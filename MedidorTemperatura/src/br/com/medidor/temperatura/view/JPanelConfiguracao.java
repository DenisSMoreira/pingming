package br.com.medidor.temperatura.view;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.dao.IConfiguracaoDAO;
import br.com.medidor.temperatura.facotry.DaoFactory;
import br.com.medidor.temperatura.view.grafico.Grafico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Tela de gerenciamento de configurações do gráfico 
 * @author Paula
 */
public class JPanelConfiguracao extends JPanel {

    public JPanelConfiguracao() {
        initConfigTela();
        initComponentes();

    }

    /**
     * Metodo que inicia os componentes e adiciona no frame
     */
    private void initComponentes() {

        panel = new JPanel();
        panel.setSize(440, 160);
        panel.setBorder(BorderFactory.createTitledBorder("Dados de configuração"));
        panel.setLayout(null);
        this.add(panel);

        botaoAlterar = new JButton("Alterar");
        botaoAlterar.setBorderPainted(true);
        botaoAlterar.setContentAreaFilled(false);
        botaoAlterar.setFocusable(false);
        botaoAlterar.setSize(95, 30);
        botaoAlterar.setLocation(10, 25);
        botaoAlterar.addActionListener(acao);
        panel.add(botaoAlterar);

        botaoLimpar = new JButton("Limpar");
        botaoLimpar.setBorderPainted(true);
        botaoLimpar.setContentAreaFilled(false);
        botaoLimpar.setFocusable(false);
        botaoLimpar.setSize(95, 30);
        botaoLimpar.setLocation(115, 25);
        botaoLimpar.addActionListener(acao);
        panel.add(botaoLimpar);

        botaoCancelar = new JButton("Cancelar");
        botaoCancelar.setBorderPainted(true);
        botaoCancelar.setContentAreaFilled(false);
        botaoCancelar.setFocusable(false);
        botaoCancelar.setSize(95, 30);
        botaoCancelar.setLocation(220, 25);
        panel.add(botaoCancelar);

        botaoGrafico = new JButton("Gráfico");
        botaoGrafico.setBorderPainted(true);
        botaoGrafico.setContentAreaFilled(false);
        botaoGrafico.setFocusable(false);
        botaoGrafico.setSize(95, 30);
        botaoGrafico.setLocation(325, 25);
        botaoGrafico.addActionListener(acao);
        panel.add(botaoGrafico);

        labelTempExec = new JLabel("Tempo de atualizaçãoem segundos");
        labelTempExec.setSize(245, 20);
        labelTempExec.setLocation(10, 70);
        panel.add(labelTempExec);

        fieldTempExec = new JTextField();
        fieldTempExec.setSize(125, 20);
        fieldTempExec.setLocation(225, 70);
        fieldTempExec.setText(configuracao.getSegundosAtualizacao().toString());
        panel.add(fieldTempExec);

        labelTempMin = new JLabel("Temperatura Minima");
        labelTempMin.setSize(245, 20);
        labelTempMin.setLocation(10, 100);
        panel.add(labelTempMin);

        fieldTempMin = new JTextField();
        fieldTempMin.setSize(125, 20);
        fieldTempMin.setLocation(225, 100);
        fieldTempMin.setText(configuracao.getTemperaturaMinima().toString());
        panel.add(fieldTempMin);

        labelTempMax = new JLabel("Temperatura Máxima");
        labelTempMax.setSize(245, 20);
        labelTempMax.setLocation(10, 130);
        panel.add(labelTempMax);

        fieldTempMax = new JTextField();
        fieldTempMax.setSize(125, 20);
        fieldTempMax.setLocation(225, 130);
        fieldTempMax.setText(configuracao.getTemperaturaMaxima().toString());
        panel.add(fieldTempMax);

    }

    /**
     * Metodo que inicia a configurações estrutural do frame
     */
    private void initConfigTela() {
       this.setLocation(40, 40);
       this.setSize(500, 500);
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
            if (e.getSource() == botaoAlterar) {
                alterarConfiguracoes();
            }
            if (e.getSource() == botaoLimpar) {
                limparCampos();
            }
            if (e.getSource() == botaoGrafico) {
                Grafico.abrirGrafico(configuracao);

            }
            if (e.getSource() == botaoCancelar) {
                System.exit(0);
            }

        }
    }

    /**
     * Metodo para limpar os dados dos campos para digitação
     */
    private void limparCampos() {
        fieldTempMax.setText("");
        fieldTempMin.setText("");
        fieldTempExec.setText("");
    }

    /**
     * Metodo para alterar configurações em tempo de execução 
     */
    private void alterarConfiguracoes() {
        try {
            configuracao.setTemperaturaMaxima(Integer.parseInt(fieldTempMax.getText()));
            configuracao.setTemperaturaMinima(Integer.parseInt(fieldTempMin.getText()));
            configuracao.setSegundosAtualizacao(Integer.parseInt(fieldTempExec.getText()));

            if (daoConfig.alterarConfiguracoes(configuracao)) {
                JOptionPane.showMessageDialog(panel, "Sucesso", "Sucesso ao alterar configurações" , JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(panel,"Erro ao alterar configurações", "Erro ao alterar configurações no banco de dados" ,JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panel,"Erro ao alterar configurações", "Verifique os dados digitados!", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * ID das Configurações
     */
    private static final int ID_CONFIGURACOES = 1;
    /**
     * Serial ID do Serializable
     */
    private static final long serialVersionUID = 1L;
    /**
     * Botões
     */
    private JButton botaoAlterar, botaoLimpar, botaoCancelar, botaoGrafico;
    /**
     * Campos para digitar os valores
     */
    private JTextField fieldTempExec, fieldTempMin, fieldTempMax;
    /**
     * Panel
     */
    private JPanel panel;
    /**
     * Label's 
     */
    private JLabel labelTempExec, labelTempMin, labelTempMax;

    /**
     * Objeto de persistencia 
     */
    private final IConfiguracaoDAO daoConfig = DaoFactory.criarConfiguracaoDao();
    /**
     * Referencia do bean de configuração contendo as config iniciais
     */
    private final Configuracao configuracao = daoConfig.buscarConfiguracoes(ID_CONFIGURACOES);
    /**
     * Classe usada para gerenciar as action dos botões
     */
    private final Action acao = new Action();
    

}
