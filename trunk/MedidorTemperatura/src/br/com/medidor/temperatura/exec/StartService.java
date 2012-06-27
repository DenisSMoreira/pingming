/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.exec;

import br.com.medidor.temperatura.gerenciador.Gerenciador;

/**
 * Classe Main, responsável por startar a aplicação.
 * @author Paula
 */
public class StartService {

    /**
     * Main
     * @param args 
     */
    public static void main(String[] args) {

        Gerenciador gerenciador = new Gerenciador();
        gerenciador.setVisible(true);

    }
}
