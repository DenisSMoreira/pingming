package web.bean.canonico;

import java.util.Date;

/**
 * Bean para Acesso Valido
 */
public class AcessoValido implements java.io.Serializable {
    /**
     * Atributo = Serial Version
     */
    private static final long serialVersionUID = -8043121425926613578L;
    /**
     * Atributo = C�digo para incrementar
     */
    private Long codigo;
    /**
     * Atributo = Ip da maquina
     */
    private String ip;
    /**
     * Atributo = periodo data
     */
    private Date dataHora;
    /**
     * Atributo = Cpf do Interlocutor
     */
    private String cpfInterlocutor;
    /**
     * Atributo = Navegador usado
     */
    private String userAgent;
    /**
     * Atributo = id da Sessao
     */
    private Long idSessao;

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
    public void setCodigo(final Long codigo) {
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