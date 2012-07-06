/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.view;

import br.com.medidor.temperatura.view.JFrameConfiguracao;

/**
 * Classe Main, responsável por startar a aplicação.
 * @author Paula
 */
public class Principal {

    /**
     * Main
     * @param args 
     */
    public static void main(String[] args) {

        JFrameConfiguracao gerenciador = new JFrameConfiguracao();
        gerenciador.setVisible(true);

    }
}
