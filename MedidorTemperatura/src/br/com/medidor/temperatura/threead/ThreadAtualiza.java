/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.threead;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.grafico.Grafico;
import br.com.medidor.temperatura.facotry.FacoryDataSet;
import java.awt.Dimension;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;

/**
 * ThreadAtualiza
 * @author Paula
 */
public class ThreadAtualiza extends Thread {

    private ApplicationFrame applicationFrame = null;
    private Configuracao configuracao = null;
    private static final Dimension DIMENSION = new Dimension(500, 370);

    /**
     * Construtor obrigando a thread que atualizar o grafico 
     *  receber alguns parametros nescessarios
     * @see Configuracao
     * @see Grafico
     * @param ApplicationFrame grafico
     * @param Configuracao configuracao 
     */
    public ThreadAtualiza(ApplicationFrame applicationFrame, Configuracao configuracao) {
        this.applicationFrame = applicationFrame;
        this.configuracao = configuracao;
    }

    /**
     * Metodo chamado pela threead
     */
    @Override
    public void run() {
        while (true) {
            try {
                final XYDataset dataset = FacoryDataSet.createDataset(configuracao);
                final JFreeChart chart = Grafico.createChart(dataset);
                final ChartPanel chartPanel = new ChartPanel(chart);
                chartPanel.setPreferredSize(DIMENSION);
                chartPanel.setMouseZoomable(true, true);

                applicationFrame.setContentPane(chartPanel);
                applicationFrame.validate();
                
                
                Thread.sleep(configuracao.getTempoExecucao());
            } catch (Exception exception) {
                System.out.print(exception.getMessage());
                break;
            }

        }
    }

}
