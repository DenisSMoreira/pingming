package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * Bean referente ao relat�rio Inclus�o de pedido
 */
public class InclusaoPedido implements Serializable {

    /**
     * Id
     */
    private static final long serialVersionUID = -5602222125711215874L;

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
     * Vari�vel interlocutor solicitante
     */
    private String interlocutorSolicitante;

    /**
     * Vari�vel e-mail solicitante
     */
    private String emailSolicitante;

    /**
     * Vari�vel n�mero do contrato
     */
    private Long numeroContrato;

    /**
     * Vari�vel data e hora do envio
     */
    private Date dataHoraEnvio;

    /**
     * Vari�vel total de benefici�rios
     */
    private String totalBeneficiarios;

    /**
     * Vari�vel data e hora da disponibiliza��o do benef�cio
     */
    private Date dataDisponibilizacaoBeneficio;

    /**
     * Vari�vel n�mero do pedido
     */
    private Long numeroPedido;

    /**
     * Vari�vel valor do pedido
     */
    private Double valorPedido;

    /**
     * Vari�vel tipo de entrada
     */
    private String tipoEntrada;

    /**
     * Vari�vel id da sess�o
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
     * @return the interlocutorSolicitante
     */
    public String getInterlocutorSolicitante() {
        return interlocutorSolicitante;
    }

    /**
     * @param interlocutorSolicitante
     *            the interlocutorSolicitante to set
     */
    public void setInterlocutorSolicitante(final String interlocutorSolicitante) {
        this.interlocutorSolicitante = interlocutorSolicitante;
    }

    /**
     * @return the emailSolicitante
     */
    public String getEmailSolicitante() {
        return emailSolicitante;
    }

    /**
     * @param emailSolicitante
     *            the emailSolicitante to set
     */
    public void setEmailSolicitante(final String emailSolicitante) {
        this.emailSolicitante = emailSolicitante;
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
     * @return the dataHoraEnvio
     */
    public Date getDataHoraEnvio() {
        return dataHoraEnvio;
    }

    /**
     * @param dataHoraEnvio
     *            the dataHoraEnvio to set
     */
    public void setDataHoraEnvio(final Date dataHoraEnvio) {
        this.dataHoraEnvio = dataHoraEnvio;
    }

    /**
     * @return the totalBeneficiarios
     */
    public String getTotalBeneficiarios() {
        return totalBeneficiarios;
    }

    /**
     * @param totalBeneficiarios
     *            the totalBeneficiarios to set
     */
    public void setTotalBeneficiarios(final String totalBeneficiarios) {
        this.totalBeneficiarios = totalBeneficiarios;
    }

    /**
     * @return the dataDisponibilizacaoBeneficio
     */
    public Date getDataDisponibilizacaoBeneficio() {
        return dataDisponibilizacaoBeneficio;
    }

    /**
     * @param dataDisponibilizacaoBeneficio
     *            the dataDisponibilizacaoBeneficio to set
     */
    public void setDataDisponibilizacaoBeneficio(
            final Date dataDisponibilizacaoBeneficio) {
        this.dataDisponibilizacaoBeneficio = dataDisponibilizacaoBeneficio;
    }

    /**
     * @return the numeroPedido
     */
    public Long getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * @param numeroPedido
     *            the numeroPedido to set
     */
    public void setNumeroPedido(final Long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    /**
     * @return the valorPedido
     */
    public Double getValorPedido() {
        return valorPedido;
    }

    /**
     * @param valorPedido
     *            the valorPedido to set
     */
    public void setValorPedido(final Double valorPedido) {
        this.valorPedido = valorPedido;
    }

    /**
     * @return the tipoEntrada
     */
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    /**
     * @param tipoEntrada
     *            the tipoEntrada to set
     */
    public void setTipoEntrada(final String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
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
