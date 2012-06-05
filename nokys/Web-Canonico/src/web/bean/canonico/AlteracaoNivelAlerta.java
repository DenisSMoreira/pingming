package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;
    /**
     * Bean referente ao relat�rio Altera��o do n�vel de Alerta
     */
public class AlteracaoNivelAlerta implements Serializable {

    /**
     * Variavel referente ao form
     */
    private static final long serialVersionUID = 8216563627182717181L;
    /**
     * Vari�vel referente ao c�digo
     */
    private int codigo;
    /**
     * Vari�vel referente ao campo ip
     */
    private String ip;
    /**
     * Vari�vel referente a data
     */
    private Date dataHora;
    /**
     * Vari�vel referente ao campo nome interlocutor
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
     * Vari�lvel referente ao caompo da Origem da ALtera��o
     */
    private String origemAlteracao;
    /**
     * Vari�lvel referente ao caompo do UserAgent
     */
    private String userAgent;
    /**
     * Vari�lvel referente ao caompo do Nivel Antigo
     */
    private String nivelAntigo;
    /**
     * Vari�lvel referente ao caompo doNivel Novo
     */
    private String nivelNovo;
    /**
     * Vari�lvel referente ao caompo do id da Sess�o
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
    public void setOrigemAlteracao( final String origemAlteracao) {
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
    public void setUserAgent( final String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * @return the nivelAntigo
     */
    public String getNivelAntigo() {
        return nivelAntigo;
    }

    /**
     * @param nivelAntigo
     *            the nivelAntigo to set
     */
    public void setNivelAntigo(final String nivelAntigo) {
        this.nivelAntigo = nivelAntigo;
    }

    /**
     * @return the nivelNovo
     */
    public String getNivelNovo() {
        return nivelNovo;
    }

    /**
     * @param nivelNovo
     *            the nivelNovo to set
     */
    public void setNivelNovo(final String nivelNovo) {
        this.nivelNovo = nivelNovo;
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
