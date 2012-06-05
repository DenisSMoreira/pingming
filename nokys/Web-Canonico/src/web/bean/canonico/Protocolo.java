package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * Bean para Protocolo
 */
public class Protocolo implements Serializable {
    /**
     * Atributo = Serial Version
     */
    private static final long serialVersionUID = -8021191709121599177L;
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
     * Atributo = Nome do interlocutor  
     */
    private String nomeInterlocutor;
    /**
     * Atributo = Cpf do Interlocutor
     */
    private String cpfInterlocutor;
    /**
     * Atributo = Perfil do interlocutor
     */
    private String perfilInterlocutor;
    /**
     * Atributo = Cnpj ou Cpf da empresa
     */ 
    private String empresaCnpjCpf;
    /**
     * Atributo = Origem da altera��o
     */
    private String origemAlteracao;
    /**
     * Atributo = Navegador usado
     */
    private String userAgent;
    /**
     * Numero do Protocolo
     */
    private Long numeroProtocolo;
    /**
     * Atributo = Evento a selecionar
     */
    private String evento;
    /**
     * Atributo = Id da sess�o
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
     * @return the nomeInterlocutor
     */
    public String getNomeInterlocutor() {
        return nomeInterlocutor;
    }

    /**
     * @param nomeInterlocutor
     *            the nomeInterlocutor to set
     */
    public void setNomeInterlocutor(final String nomeInterlocutor) {
        this.nomeInterlocutor = nomeInterlocutor;
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
     * @return the perfilInterlocutor
     */
    public String getPerfilInterlocutor() {
        return perfilInterlocutor;
    }

    /**
     * @param perfilInterlocutor
     *            the perfilInterlocutor to set
     */
    public void setPerfilInterlocutor(final String perfilInterlocutor) {
        this.perfilInterlocutor = perfilInterlocutor;
    }

    /**
     * @return the empresaCnpjCpf
     */
    public String getEmpresaCnpjCpf() {
        return empresaCnpjCpf;
    }

    /**
     * @param empresaCnpjCpf
     *            the empresaCnpjCpf to set
     */
    public void setEmpresaCnpjCpf(final String empresaCnpjCpf) {
        this.empresaCnpjCpf = empresaCnpjCpf;
    }

    /**
     * @return the origemAlteracao
     */
    public String getOrigemAlteracao() {
        return origemAlteracao;
    }

    /**
     * @param origemAlteracao
     *            the origemAlteracao to set
     */
    public void setOrigemAlteracao(final String origemAlteracao) {
        this.origemAlteracao = origemAlteracao;
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
     * @return the numeroProtocolo
     */
    public Long getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * @param numeroProtocolo
     *            the numeroProtocolo to set
     */
    public void setNumeroProtocolo(final Long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    /**
     * @return the evento
     */
    public String getEvento() {
        return evento;
    }

    /**
     * @param evento
     *            the evento to set
     */
    public void setEvento(final String evento) {
        this.evento = evento;
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
