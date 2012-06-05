package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * Bean referente ao relat�rio Pedido Modelo
 */
public class PedidoModelo implements Serializable {

    /**
     * Id
     */
    private static final long serialVersionUID = 4737972496821808120L;

    /**
     * Vari�vel c�digo
     */
    private Long codigo;

    /**
     * Vari�vel ip
     */
    private String ip;

    /**
     * Vari�vel data e hora
     */
    private Date dataHora;

    /**
     * Vari�vel nome do interlocutor
     */
    private String nomeInterlocutor;

    /**
     * Vari�vel cpf do interlocutor
     */
    private String cpfInterlocutor;

    /**
     * Vari�vel perfil do interlocutor
     */
    private String perfilInterlocutor;

    /**
     * Vari�vel cnpj ou cpf da empresa
     */
    private String empresaCnpjCpf;

    /**
     * Vari�vel origem da altera��o
     */
    private String origemAlteracao;

    /**
     * Vari�vel user agent
     */
    private String userAgent;

    /**
     * Vari�vel n�mero contrato
     */
    private Long numeroContrato;

    /**
     * Vari�vel produto
     */
    private String produto;

    /**
     * Vari�vel total de funcion�rios
     */
    private Long totalFuncionario;

    /**
     * Vari�vel valor total
     */
    private Double valorTotal;

    /**
     * Vari�vel id da sess�o
     */
    private Long idSessao;

    /**
     * Vari�vel a��o realizada
     */
    private String acaoRealizada;

    /**
     * Vari�vel altera��o
     */
    private String alteracao;

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
     * @return the totalFuncionario
     */
    public Long getTotalFuncionario() {
        return totalFuncionario;
    }

    /**
     * @param totalFuncionario
     *            the totalFuncionario to set
     */
    public void setTotalFuncionario(final Long totalFuncionario) {
        this.totalFuncionario = totalFuncionario;
    }

    /**
     * @return the valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal
     *            the valorTotal to set
     */
    public void setValorTotal(final Double valorTotal) {
        this.valorTotal = valorTotal;
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

    /**
     * @return the acaoRealizada
     */
    public String getAcaoRealizada() {
        return acaoRealizada;
    }

    /**
     * @param acaoRealizada
     *            the acaoRealizada to set
     */
    public void setAcaoRealizada(final String acaoRealizada) {
        this.acaoRealizada = acaoRealizada;
    }

    /**
     * @return the alteracao
     */
    public String getAlteracao() {
        return alteracao;
    }

    /**
     * @param alteracao
     *            the alteracao to set
     */
    public void setAlteracao(final String alteracao) {
        this.alteracao = alteracao;
    }
}
