/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package denis.ping.service.bean;

import java.io.Serializable;

/**
 * Pojo de configurações
 * @author Denis Soares Moreira
 */
public class BeanConfig implements Serializable {

    /**
     * IP do host
     */
    private String HostVpn;

    private String stattus;

    private int id;
    /**
     * Timeout para o delay
     */
    private int timeOut;

    /**
     * Timeout do sleep da thread
     */
    private int timeSleep;

    /**
     * Construtor vazio, caracterisca de um POJO
     */
    public BeanConfig() {
        
    }


    /**
     * Retorna o IP que está sendo conectado
     * @return o IP
     */
    public String getHostVpn() {
        return HostVpn;
    }

    /**
     * Seta o IP que ele vai se conectar
     * @param HostVpn IP a conectar
     */
    public void setHostVpn(String HostVpn) {
        this.HostVpn = HostVpn;
    }

    /**
     * Retorna o timeout do delay da verificação
     * @return timeOut tempo
     */
    public int getTimeOut() {
        return timeOut;
    }

    /**
     * Seta o timeout do delay da verificação
     * @param timeOut tempo
     */
    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * Retornar o tempo default de sleep da threaad
     * @return timeSleep tempo
     */
    public int getTimeSleep() {
        return timeSleep;
    }

    /**
     * Seta o tempo default de sleep da threaad
     * @param timeSleep tempo
     */
    public void setTimeSleep(int timeSleep) {
        this.timeSleep = timeSleep;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the stattus
     */
    public String getStattus() {
        return stattus;
    }

    /**
     * @param stattus the stattus to set
     */
    public void setStattus(String stattus) {
        this.stattus = stattus;
    }
}
