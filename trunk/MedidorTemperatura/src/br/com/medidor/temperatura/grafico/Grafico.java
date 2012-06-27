/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.grafico;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.threead.ThreadAtualiza;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * Grafico de temperatura
 * @author Paula
 */
//TODO: http://www.java2s.com/Code/Java/Chart/Line-Plot-Chart.htm novo layout
public final class Grafico extends ApplicationFrame {

    private static final long serialVersionUID = 1L;
   
    /**
     * Dimensão fixa do JFrame
     */
    private static final Dimension DIMENSION = new Dimension(550, 370);

    /**
     * Grafico JFreeChart
     * @param title titulo do frame
     */
    public Grafico(final String title) {
        super(title);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    /**
     * Criação do Chart
     * @param XYDataset dataset.
     * @return a chart.
     */
    @SuppressWarnings("deprecation")
    public static JFreeChart createChart(final XYDataset dataset) {


        final JFreeChart chart = ChartFactory.createTimeSeriesChart(
                "Medidor de temperatura de aquários",
                "Horários",
                "Temperatura",
                dataset,
                true,
                true,
                false);

        chart.setBackgroundPaint(Color.white);

        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(false);

        final XYItemRenderer renderer = plot.getRenderer();
        if (renderer instanceof StandardXYItemRenderer) {
            final StandardXYItemRenderer rr = (StandardXYItemRenderer) renderer;
            rr.setShapesFilled(true);
            renderer.setSeriesStroke(0, new BasicStroke(10.0f));
            renderer.setSeriesStroke(1, new BasicStroke(10.0f));
        }

        final DateAxis axis = (DateAxis) plot.getDomainAxis();
        axis.setDateFormatOverride(new SimpleDateFormat("hh:mma"));

        return chart;

    }

    /**
     * Metodo responsavel por criar e mostrar o gráfico
     * @see Configuracao
     * @param Configuracao configuracao
     */
    public static void abrirGrafico(Configuracao configuracao) {
        final Grafico grafic = new Grafico("Medidor de temperatura de aquários");

        RefineryUtilities.centerFrameOnScreen(grafic);
        final ThreadAtualiza atualizarGrafico = new ThreadAtualiza(grafic, configuracao);
        grafic.pack();

        
        grafic.setVisible(true);
        grafic.setSize(DIMENSION);
        atualizarGrafico.start();

    }

    /**
     * Sobreposição do método windowClosing para poder fechar apenas o JFreeChart
     * @param WindowEvent e 
     */
   @Override
    public void windowClosing(WindowEvent e) {
        this.setVisible(false);
        
    }
}