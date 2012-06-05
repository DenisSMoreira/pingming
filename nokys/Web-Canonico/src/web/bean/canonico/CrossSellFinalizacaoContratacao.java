package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * Bean para Cross Sell Finaliza��o Contrata��o
 */
public class CrossSellFinalizacaoContratacao implements Serializable {
    /**
     * Atributo = Serial Version
     */
    private static final long serialVersionUID = -3277353288466041999L;
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
     * Atributo = Produto a selecionar
     */
    private String produto;
    /**
     * Atributo = Cpf solicitante
     */
    private String cpfSolicitante;
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
     * @return the cpfSolicitante
     */
    public String getCpfSolicitante() {
        return cpfSolicitante;
    }

    /**
     * @param cpfSolicitante
     *            the cpfSolicitante to set
     */
    public void setCpfSolicitante(final String cpfSolicitante) {
        this.cpfSolicitante = cpfSolicitante;
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
