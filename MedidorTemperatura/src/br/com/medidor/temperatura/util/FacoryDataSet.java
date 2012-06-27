/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.util;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.jni.RecuperaDadosJNI;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

/**
 * Fabrica de criação de data set
 * @author Paula
 */
public final class FacoryDataSet {

    /**
     * Construtor private para bloquear a instancia da classe
     */
    private FacoryDataSet() {
    }

    /**
     * Creates a sample dataset.
     * @return the dataset.
     */
    @SuppressWarnings("deprecation")
    public static XYDataset createDataset(Configuracao configuracao) {

        final RecuperaDadosJNI cjni = RecuperaDadosJNI.getInstance();
        final TimeSeriesCollection dataset = cjni.recuperarDados(configuracao);


        return dataset;

    }
}
