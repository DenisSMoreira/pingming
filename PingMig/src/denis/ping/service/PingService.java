/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package denis.ping.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import denis.ping.service.bean.BeanConfig;
import denis.ping.service.constants.ConstantsSystem;
import denis.ping.service.constants.EnumConst;
import javax.swing.JOptionPane;

/**
 * Classe responsavél por recuperar as configurações iniciais.
 * @author Denis Soares Moreira
 */
public final class PingService {

    private BeanConfig bean;
    private InputStream fis = null;
    private Properties props = null;

    /**
     * Construtor que recebe o bean de configurações
     * @param beanC BeanConfig.class
     */
    public PingService(BeanConfig beanC) {
        bean = beanC;
    }

    /**
     *  Metodo por recuperar configurações do user e resgatar configurações default se nescessario
     * @param timeout tempo de delay para a verificação
     * @param ipHost IP da maquina que irá tentar conectar
     * @return Configurações
     */
    public BeanConfig startConfig(String timeout, String ipHost) {
        fis = this.getClass().getResourceAsStream(ConstantsSystem.ARQUIVO_PROPERTIES);
        props = new Properties();
        try {
            props.load(fis);

            if (timeout != null ? ConstantsSystem.VAZIO != null : !timeout.equals(ConstantsSystem.VAZIO) || timeout.length() >= EnumConst.QUATRO.val()) {
                props.setProperty(ConstantsSystem.TIME_SLEEP, timeout);
            }
            if (ipHost != null ? ConstantsSystem.VAZIO != null : !ipHost.equals(ConstantsSystem.VAZIO)) {
                props.setProperty(ConstantsSystem.HOSTS, ipHost);
            }

            bean.setTimeOut(Integer.parseInt(props.getProperty(ConstantsSystem.TIME)));
            bean.setTimeSleep(Integer.parseInt(props.getProperty(ConstantsSystem.TIME_SLEEP)));
            bean.setHostVpn(props.getProperty(ConstantsSystem.HOSTS));
            fis.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            props = null;
            fis = null;
        }

        return bean;
    }
}
