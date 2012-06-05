package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Classe BloqueioSenha
 * 
 */
public class BloqueioSenha implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4927392465470848147L;
    /**
     * Atributo codigo
     */
    private Long codigo;
    /**
     * Atributo ip
     */
    private String ip;
    /**
     * Atributo data Hora
     */
    private Date dataHora;
    /**
     * Atributo cpf Interlocutor
     */
    private String cpfInterlocutor;
    /**
     * Atributo user Agent
     */
    private String userAgent;

    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     *            the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     *            the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return the dataHora
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora
     *            the dataHora to set
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the cpfInterlocutor
     */
    public String getCpfInterlocutor() {
        return cpfInterlocutor;
    }

    /**
     * @param cpfInterlocutor
     *            the cpfInterlocutor to set
     */
    public void setCpfInterlocutor(String cpfInterlocutor) {
        this.cpfInterlocutor = cpfInterlocutor;
    }

    /**
     * @return the userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * @param userAgent
     *            the userAgent to set
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
