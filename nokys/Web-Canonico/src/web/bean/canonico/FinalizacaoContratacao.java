package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;
    /**
     * bean referente ao relat�rio E-commerce - Finaliza��o da Contrata��o
     */
public class FinalizacaoContratacao implements Serializable {
    /**
     * Vari�lvel referente ao form
     */
    private static final long serialVersionUID = -4476698019534270617L;
    /**
     * Vari�lvel referente ao caompo codigo
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
     * Vari�lvel referente ao caompo do nome do Interlocutor
     */
    private String nomeInterlocutor;
    /**
     * Vari�lvel referente ao caompo do CPF do Interlocutor
     */
    private String cpfInterlocutor;
    /**
     * Vari�lvel referente ao caompo do perfil do Interlocutor
     */
    private String perfilInterlocutor;
    /**
     * Vari�lvel referente ao caompo do CPF/CNPJ da empresa
     */
    private String empresaCnpjCpf;
    /**
     * Vari�lvel referente ao caompo da Origem da altera��o
     */
    private String origemAlteracao;
    /**
     * Vari�lvel referente ao caompo do User Agent
     */
    private String userAgent;
    /**
     * Vari�lvel referente ao caompo do produto
     */
    private String produto;
    /**
     * Vari�lvel referente ao caompo do N�mero do conrato
     */
    private Long numeroContrato;
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
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto
     *            the produto to set
     */
    public void setProduto(final String produto) {
        this.produto = produto;
    }

    /**
     * @return the numeroContrato
     */
    public Long getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * @param numeroContrato
     *            the numeroContrato to set
     */
    public void setNumeroContrato(final Long numeroContrato) {
        this.numeroContrato = numeroContrato;
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
