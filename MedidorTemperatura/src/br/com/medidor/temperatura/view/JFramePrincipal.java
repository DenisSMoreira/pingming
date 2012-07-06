/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author dmoreira
 */
public class JFramePrincipal extends JFrame {


    public JFramePrincipal() {
        super("Tela Principal");
        initConfigTela();
        initComponentes();

    }

    private void initComponentes() {
        bar = new JMenuBar();
        this.setJMenuBar(bar);

        menuArquivo = new JMenu("Arquivo");
        bar.add(menuArquivo);

        menuConfiguracao = new JMenu("Configuração");
        bar.add(menuConfiguracao);

        menuItemSair = new JMenuItem("Sair");
        menuItemSair.addActionListener(action);
        menuArquivo.add(menuItemSair);

        menuItemGrafico = new JMenuItem("Configuração e Grafico");
        menuItemGrafico.addActionListener(action);
        menuConfiguracao.add(menuItemGrafico);


    }

    private void initConfigTela() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tela de configuração");
        this.setBounds((screenSize.width - 560) / 2, (screenSize.height - 560) / 2, 560, 280);
        this.setResizable(true);
        this.setLayout(null);

    }

    /**
     * Class Action
     * Classe responsável por resgatar o evento do botão 
     * e filtrar
     */
    private class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == menuItemSair) {
                System.exit(0);
            }
            if (e.getSource() == menuItemGrafico) {
                abrirGerenciadorGrafico();
            }

        }
    }


    public void abrirGerenciadorGrafico() {
        if (gerenciador == null) {
            gerenciador = new JPanelConfiguracao();
            this.add(gerenciador);
            this.repaint();
            gerenciador.validate();
        }

    }
    
    
    private JMenu menuArquivo, menuConfiguracao;
    private JMenuItem menuItemSair, menuItemGrafico;
    private JMenuBar bar;
    private JPanelConfiguracao gerenciador = null;
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private Action action = new Action();
}
