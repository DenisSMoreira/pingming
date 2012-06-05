package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * bean configura�ao Extrato funcionario
 * 
 * @author gferreira
 * 
 */

public class ExtratoFuncionario implements Serializable {

    /**
     * Atributo serialversion
     */

    private static final long serialVersionUID = 2372264903116184104L;

    /**
     * Atributo Codigo
     */

    private Long codigo;

    /**
     * Atributo ip
     */

    private String ip;

    /**
     * Atributo dataHora
     */

    private Date dataHora;

    /**
     * Atributo nomeInterlocutor
     */

    private String nomeInterlocutor;

    /**
     * Atributo cpfInterlocutor
     */

    private String cpfInterlocutor;

    /**
     * Atributo perfilInterlocutor
     */

    private String perfilInterlocutor;

    /**
     * Atributo empresaCnpjCpf
     */

    private String empresaCnpjCpf;

    /**
     * Atributo origemAlteracao
     */

    private String origemAlteracao;

    /**
     * Atributo userAgent
     */

    private String userAgent;

    /**
     * Atributo numeroProtocolo
     */

    private Long numeroProtocolo;

    /**
     * Atributo produto
     */

    private String produto;

    /**
     * Atributo numeroContrato - Relat�rio Extrato Funcionario
     */

    private Long numeroContrato;

    /**
     * Atributo tipoDocumento - Relat�rio Extrato Funcionario
     */

    private String tipoDocumento;

    /**
     * Atributo numeroUsuario - Relat�rio Extrato Funcionario
     */

    private Long numeroUsuario;

    /**
     * Atributo idSessao - Relat�rio Extrato Funcionario
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
     * @return the nomeInterlocutor
     */
    public String getNomeInterlocutor() {
        return nomeInterlocutor;
    }

    /**
     * @param nomeInterlocutor
     *            the nomeInterlocutor to set
     */
    public void setNomeInterlocutor(String nomeInterlocutor) {
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
    public void setCpfInterlocutor(String cpfInterlocutor) {
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
    public void setPerfilInterlocutor(String perfilInterlocutor) {
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
    public void setEmpresaCnpjCpf(String empresaCnpjCpf) {
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
    public void setOrigemAlteracao(String origemAlteracao) {
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
    public void setUserAgent(String userAgent) {
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
    public void setNumeroProtocolo(Long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
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
    public void setProduto(String produto) {
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
    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    /**
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento
     *            the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the numeroUsuario
     */
    public Long getNumeroUsuario() {
        return numeroUsuario;
    }

    /**
     * @param numeroUsuario
     *            the numeroUsuario to set
     */
    public void setNumeroUsuario(Long numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
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
    public void setIdSessao(Long idSessao) {
        this.idSessao = idSessao;
    }
}
