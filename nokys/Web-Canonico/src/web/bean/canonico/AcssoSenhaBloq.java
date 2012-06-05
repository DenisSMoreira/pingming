package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;
    /**
     * bean referente ao relat�rio Acesso com senha Bloqueada
    */
public class AcssoSenhaBloq implements Serializable {
    /**
     * Vari�lvel referente ao form
     */
    private static final long serialVersionUID = 3039245660846032210L;
    /**
     * Vari�lvel referente ao caompo do c�digo
     */
    private int codigo;
    /**
     * Vari�lvel referente ao caompo do IP
     */
    private String ip;
    /**
     * Vari�lvel referente ao caompo da data
     */
    private Date dataHora;
    /**
     * Vari�lvel referente ao caompo do CPF do Interlocutor
     */
    private String cpfInterlocutor;
    /**
     * Vari�lvel referente ao caompo do User Agent
     */
    private String userAgent;
    /**
     * Vari�lvel referente ao caompo do ID da sess�o
     */
    private Long idSessao;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     *            the codigo to set
     */
    public void setCodigo(final int codigo) {
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
    public void setIp(final String ip) {
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
    public void setDataHora(final Date dataHora) {
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
    public void setCpfInterlocutor(final String cpfInterlocutor) {
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
    public void setUserAgent(final String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * @return the idSessao
     */
    public Long getIdSessao() {
        return idSessao;
    }

    /**
     * @param idSessao
     *            the idSessao to set
     */
    public void setIdSessao(final Long idSessao) {
        this.idSessao = idSessao;
    }

}
