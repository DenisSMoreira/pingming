package br.com.medidor.temperatura.gerenciador;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.grafico.Grafico;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Paula
 */
public class Gerenciador extends JFrame {

    public static final int ID_CONFIGURACOES = 1;
    private static final long serialVersionUID = 1L;
    private JButton botaoAlterar, botaoLimpar, botaoCancelar, botaoGrafico;
    private JTextField fieldTempExec, fieldTempMin, fieldTempMax;
    private JPanel panel;
    private JLabel labelTempExec, labelTempMin, labelTempMax;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//    private final IConfiguracaoDAO daoConfig = DaoFactory.criarConfiguracaoDao();
    private Configuracao configuracao;
    private Action acao = new Action();

    public Gerenciador() {
        super("Gerenciador do sistema");
        initConfigTela();
//        configuracao = daoConfig.buscarConfiguracoes(ID_CONFIGURACOES);
        
        configuracao = new Configuracao();
        configuracao.setTemperaturaMaxima(40);
        configuracao.setTemperaturaMinima(2);
        configuracao.setTempoExecucao(1000);
        initComponentes();

    }

    public final void initComponentes() {

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
        fieldTempExec.setText(configuracao.getTempoExecucao().toString());
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

    public final void initConfigTela() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tela de configuração");
        this.setBounds((screenSize.width - 460) / 2, (screenSize.height - 460) / 2, 460, 200);
        this.setResizable(true);
        this.setLayout(null);
    }

   

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

  

    private void limparCampos() {
        fieldTempMax.setText("");
        fieldTempMin.setText("");
        fieldTempExec.setText("");
    }

    private void alterarConfiguracoes() {
        try {
            configuracao.setTemperaturaMaxima(Integer.parseInt(fieldTempMax.getText()));
            configuracao.setTemperaturaMinima(Integer.parseInt(fieldTempMin.getText()));
            configuracao.setTempoExecucao(Integer.parseInt(fieldTempExec.getText()));

//            if (daoConfig.alterarConfiguracoes(configuracao)) {
//                JOptionPane.showMessageDialog(panel, "Sucesso ao alterar configurações");
//            } else {
//                JOptionPane.showMessageDialog(panel, "Erro ao alterar configurações");
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panel, "Erro ao alterar configurações: Verifique os dados digitados.");
        }
    }
  
}
