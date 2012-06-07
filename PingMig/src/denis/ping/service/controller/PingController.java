package denis.ping.service.controller;

import java.io.InputStream;
import denis.ping.service.constants.ConstantsSystem;
import java.net.InetAddress;
import denis.ping.service.bean.BeanConfig;
import denis.ping.service.constants.EnumConst;
import denis.ping.service.view.SuperGerenciadorPing;

/**
 * Controlador do ping da aplicação
 * @author Denis Soares Moreira
 */
public final class PingController extends Thread {

    /**
     * Tela de configurações
     */
    private static SuperGerenciadorPing menuView;
    /**
     * Boolean usado para verificação do ping
     */
    private boolean pingBolean = false;
    /**
     * Verifica status do ping
     */
    private boolean bStatus = false;
    /**
     * Flag
     */
    private boolean flagVerificao = true;
    /**
     * Verifica se está conectado.
     */
    private String verifica_last = "";
    /**
     * Bytes retornado do prompt
     */
    private String bytes = "";
    /**
     * tempo retornado do prompt
     */
    private String tempo = "";
    /**
     * ttl retornado do prompt
     */
    private String ttl = "";
    /**
     * Referencia do Pojo das configurações
     */
    private BeanConfig beanConf;
    /**
     * Referencia da classe responsavel pelo processo
     */
    private Process proc = null ;
    /**
     * Responsavel por inserir e retornar dados do prompt
     */
    private InputStream in  = null;
    /**
     * vuffer
     */
    private byte buffer[] = new byte[EnumConst.MIL_VINTE_QUATRO.val()];
    /**
     * buff
     */
    private String buff = null;

    /**
     * Constutor da PingController.class
     * @param menu SuperGerenciadorPing tela de visualização(metodo para alterar icone, status , etc)
     * @param bean Bean populado com as configurações
     */
    public PingController(SuperGerenciadorPing menu, BeanConfig bean) {
        this.setPriority(MIN_PRIORITY);
        menuView = menu;
        beanConf = bean;
    }

    /**
     * Meotod responsavél por pingar o ip desejado
     * @return true - conectado
     *         false- desconectado
     */
    public final boolean doPing() {
        try {
            bStatus = InetAddress.getByName(beanConf.getHostVpn()).isReachable(beanConf.getTimeOut());
            if (bStatus) {
                proc = Runtime.getRuntime().exec(new String[]{ConstantsSystem.CMD_PING, beanConf.getHostVpn()});
                in = proc.getInputStream();

                while (in.read(buffer) >= EnumConst.ZERO.val()) {
                        buff = new String(buffer);

                    if (buff.contains(ConstantsSystem.CMD_V_TTL)) {
                        bytes = buff.substring(buff.indexOf(ConstantsSystem.CMD_BYTES) + EnumConst.SEIS.val(), buff.indexOf(ConstantsSystem.CMD_TIME) -EnumConst.UM.val());
                        tempo = buff.substring(buff.indexOf(ConstantsSystem.CMD_TIME) + EnumConst.SEIS.val(), buff.indexOf(ConstantsSystem.CMD_TTL) - EnumConst.UM.val());
                        ttl = buff.substring(buff.indexOf(ConstantsSystem.CMD_TTL) + EnumConst.QUATRO.val());
                        ttl = ttl.substring(EnumConst.ZERO.val(), buff.indexOf(ConstantsSystem.ESPACO) - EnumConst.TRES.val());
                        menuView.alteraStatus(bStatus, bytes, tempo, ttl, beanConf);
                    }
                    buffer = new byte[EnumConst.MIL_VINTE_QUATRO.val()];
                }
            }

            menuView.alteraStatus(bStatus, bytes, tempo, ttl, beanConf);
            return bStatus;
        } catch (Exception e) {
            return false;
        }
        finally{
            proc = null;
            in = null;
            buff = null;
        }
    }

    @Override
    /**
     * Thread responsavel por verifica o ping
     */
    public final void run() {
        for (pingBolean = doPing(); flagVerificao; pingBolean = doPing()) {
            if (pingBolean) {
                if (!verifica_last.equals(ConstantsSystem.STATUS_UP)) {
                    verifica_last = ConstantsSystem.STATUS_UP;
                }
                try {
                    Thread.sleep(beanConf.getTimeSleep());
                } catch (InterruptedException e) {
                    flagVerificao = false;
                }
            } else {
                verifica_last = ConstantsSystem.STATUS_DOWN;

            }
        }
    }
}
