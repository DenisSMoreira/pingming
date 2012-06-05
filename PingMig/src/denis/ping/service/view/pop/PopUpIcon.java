/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package denis.ping.service.view.pop;

import denis.ping.service.constants.ConstantsSystem;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * Menu Apresetando quando clicado botão direito do icone
 * @author Denis Soares Moreira
 */
public final class PopUpIcon extends PopupMenu {

    /**
     * Objeto action que será adcionado nos menu
     */
    private final action acao = new action();
    /**
     * Menu Abrir gerenciador
     */
    private MenuItem AbrirGerenciador;
    /**
     * Menu Sair
     */
    private MenuItem Sair;
    /**
     * Referencia da class JFrame.class
     */
    private JFrame frame = null;

    /**
     * Construtor PopupIcon.class
     * @param frame Recebe frame para recuperar a instancia do mesmo
     */
    public PopUpIcon(JFrame frame) {
        AbrirGerenciador = new MenuItem(ConstantsSystem.MENU_GERENCIADOR);
        AbrirGerenciador.addActionListener(acao);

        Sair = new MenuItem(ConstantsSystem.MENU_SAIR);
        Sair.addActionListener(acao);

        this.add(AbrirGerenciador);
        this.addSeparator();
        this.add(Sair);
        this.frame = frame;

    }

    /**
     * Classe privada, responsavel por implementar ação nos menus
     * do popIcon do trayIcon
     */
    private final class action implements ActionListener {

        /**
         * Meotod responsavél por verificar quem foi executado, e
         * efetua uma ação
         * @param e ActionEvent 
         */
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(Sair)) {
                System.exit(0);
            }
            if (e.getSource().equals(AbrirGerenciador)) {
                frame.setVisible(true);

            }

        }
    }
}
