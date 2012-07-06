/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.util;

import br.com.medidor.temperatura.bean.Configuracao;
import javax.swing.JOptionPane;

/**
 * Valida Temperatura Util
 * @author Paula
 */
public final class ValidaTemperatura {
    
    private ValidaTemperatura(){
        
    }
    
    /**
     * Verifica Temperatura
     * @see Configuracao
     * @param Temperatura temperatura
     * @param Configuracao configuracao  
     */
    public static void verificaTemperatura(final Double temperatura, final Configuracao configuracao) {
        if (configuracao.getTemperaturaMinima() >= temperatura) {
            JOptionPane.showMessageDialog(null, "Esquentando Aquário!");
        } else if (configuracao.getTemperaturaMaxima() <= temperatura) {
            JOptionPane.showMessageDialog(null, "Esfriando Aquário!");
        }

    }
}
