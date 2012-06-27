/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.facotry;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.jni.RecuperaDadosJNI;
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
     * Cria um novo dataset.
     * @return the dataset.
     */   
    public static XYDataset createDataset(Configuracao configuracao) {
        return RecuperaDadosJNI.getInstance().recuperarDados(configuracao);

    }
}
