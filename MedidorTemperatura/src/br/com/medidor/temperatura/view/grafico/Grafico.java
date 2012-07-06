/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.view.grafico;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.threead.ThreadAtualizaGrafico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * Grafico de temperatura
 *
 * @author Paula
 */
public final class Grafico extends ApplicationFrame {

    private static final long serialVersionUID = 1L;
    
    private static ThreadAtualizaGrafico atualizarGrafico = null;
    
    /**
     * Dimensão fixa do JFrame
     */
    private static final Dimension DIMENSION = new Dimension(550, 370);

    /**
     * Grafico JFreeChart
     *
     * @param title titulo do frame
     */
    public Grafico(final String title) {
        super(title);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    /**
     * Criação do Chart
     *
     * @param XYDataset dataset.
     * @return um chart.
     */
     public static JFreeChart createChart(final XYDataset dataset) {
        
              
        final JFreeChart chart = ChartFactory.createXYLineChart(
            "Medidor de temperatura de aquários",      // Titulo
            "Medicoes",                                 // eixo x
            "Temperatura",                             // eixo y
            dataset,                                   // data
            PlotOrientation.VERTICAL,
            true,                                      // incluir legenda
            true,                                      // tooltips
            false                                      // urls
        );

       
        chart.setBackgroundPaint(Color.white);
        
        
        final XYPlot plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        
        final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesLinesVisible(1, false);
        renderer.setSeriesShapesVisible(1, false);
        plot.setRenderer(renderer);
        
        plot.setDomainCrosshairLockedOnData(true);
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairLockedOnData(true);
        plot.setRangeCrosshairVisible(true);
        

     
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

                
        return chart;
        
    }

    /**
     * Metodo responsavel por criar e mostrar o gráfico
     *
     * @see Configuracao
     * @param Configuracao configuracao
     */
    public static void abrirGrafico(Configuracao configuracao) {
        final Grafico grafic = new Grafico("Medidor de temperatura de aquários");

        RefineryUtilities.centerFrameOnScreen(grafic);
        atualizarGrafico = new ThreadAtualizaGrafico(grafic, configuracao);
        grafic.pack();


        grafic.setVisible(true);
        grafic.setSize(DIMENSION);
        atualizarGrafico.start();

    }

    /**
     * Sobreposição do método windowClosing para poder fechar apenas o
     * JFreeChart
     *
     * @param WindowEvent e
     */
    @Override
    public void windowClosing(WindowEvent e) {
        atualizarGrafico.interrupt();
        this.setVisible(false);

    }
}