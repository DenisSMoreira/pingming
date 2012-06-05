package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;
    /**
     * bean referente ao relat�rio Cancelamento de pedido
     */
public class CancelamentoPedido implements Serializable {
    /**
     * Vari�lvel referente ao form
     */
    private static final long serialVersionUID = -8067666990533762605L;
    /**
     * Vari�lvel referente ao caompo do codigo
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
     * Vari�lvel referente ao caompo da origem da altera��o
     */
    private String origemAlteracao;
    /**
     * Vari�lvel referente ao caompo do user Agent
     */
    private String userAgent;
    /**
     * Vari�lvel referente ao caompo da solicita��o do interlocutor
     */
    private String interlocutorSolicitante;
    /**
     * Vari�lvel referente ao caompo do e-mail do solicitante
     */
    private String emailSolicitante;
    /**
     * Vari�lvel referente ao caompo do n�mero do Contrato
     */
    private Long numeroContrato;
    /**
     * Vari�lvel referente ao caompo ddata de envio
     */
    private Date dataHoraEnvio;
    /**
     * Vari�lvel referente ao caompo da data de solicita��o de cancelamento
     */
    private Date dataHoraSolicitacaoCancelamento;
    /**
     * Vari�lvel referente ao caompo do total de beneficios Original
     */
    private Long totalBeneficiariosOriginal;
    /**
     * Vari�lvel referente ao caompo do total de beneficios cancelados
     */
    private Long totalBeneficiariosCancelamento;
    /**
     * Vari�lvel referente ao caompo da data da disponibilidade do beneficio
     */
    private Date dataHoraDisponibilizacaoBeneficio;
    /**
     * Vari�lvel referente ao caompo do n�mero do pedido
     */
    private Long numeroPedido;
    /**
     * Vari�lvel referente ao caompo do valor do pedido original
     */
    private Double valorPedidoOriginal;
    /**
     * Vari�lvel referente ao caompo do valor da solicita��o Cancelada
     */
    private Double valorSolicitadoCancelamento;
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
     * @return the dataHoraSolicitacaoCancelamento
     */
    public Date getDataHoraSolicitacaoCancelamento() {
        return dataHoraSolicitacaoCancelamento;
    }

    /**
     * @param dataHoraSolicitacaoCancelamento
     *            the dataHoraSolicitacaoCancelamento to set
     */
    public void setDataHoraSolicitacaoCancelamento(
            final Date dataHoraSolicitacaoCancelamento) {
        this.dataHoraSolicitacaoCancelamento = dataHoraSolicitacaoCancelamento;
    }

    /**
     * @return the totalBeneficiariosOriginal
     */
    public Long getTotalBeneficiariosOriginal() {
        return totalBeneficiariosOriginal;
    }

    /**
     * @param totalBeneficiariosOriginal
     *            the totalBeneficiariosOriginal to set
     */
    public void setTotalBeneficiariosOriginal(final Long totalBeneficiariosOriginal) {
        this.totalBeneficiariosOriginal = totalBeneficiariosOriginal;
    }

    /**
     * @return the totalBeneficiariosCancelamento
     */
    public Long getTotalBeneficiariosCancelamento() {
        return totalBeneficiariosCancelamento;
    }

    /**
     * @param totalBeneficiariosCancelamento
     *            the totalBeneficiariosCancelamento to set
     */
    public void setTotalBeneficiariosCancelamento(
            final Long totalBeneficiariosCancelamento) {
        this.totalBeneficiariosCancelamento = totalBeneficiariosCancelamento;
    }

    /**
     * @return the dataHoraDisponibilizacaoBeneficio
     */
    public Date getDataHoraDisponibilizacaoBeneficio() {
        return dataHoraDisponibilizacaoBeneficio;
    }

    /**
     * @param dataHoraDisponibilizacaoBeneficio
     *            the dataHoraDisponibilizacaoBeneficio to set
     */
    public void setDataHoraDisponibilizacaoBeneficio(
            final Date dataHoraDisponibilizacaoBeneficio) {
        this.dataHoraDisponibilizacaoBeneficio = dataHoraDisponibilizacaoBeneficio;
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
     * @return the valorPedidoOriginal
     */
    public Double getValorPedidoOriginal() {
        return valorPedidoOriginal;
    }

    /**
     * @param valorPedidoOriginal
     *            the valorPedidoOriginal to set
     */
    public void setValorPedidoOriginal(final Double valorPedidoOriginal) {
        this.valorPedidoOriginal = valorPedidoOriginal;
    }

    /**
     * @return the valorSolicitadoCancelamento
     */
    public Double getValorSolicitadoCancelamento() {
        return valorSolicitadoCancelamento;
    }

    /**
     * @param valorSolicitadoCancelamento
     *            the valorSolicitadoCancelamento to set
     */
    public void setValorSolicitadoCancelamento(
            final Double valorSolicitadoCancelamento) {
        this.valorSolicitadoCancelamento = valorSolicitadoCancelamento;
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
