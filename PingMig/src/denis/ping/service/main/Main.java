/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package denis.ping.service.main;

import denis.ping.service.view.SuperGerenciadorPing;


/**
 * Classe responsável por executar o programa.
 * @author Denis Soares Moreira
 */
public class Main {

    /**
     * Metodo main responsavél por executar o aplicativo
     * @param args Argumentos[]
     */
    public static void main(String[] args) {
       final SuperGerenciadorPing viewStart = new SuperGerenciadorPing();
       viewStart.setVisible(true);
    }

}
