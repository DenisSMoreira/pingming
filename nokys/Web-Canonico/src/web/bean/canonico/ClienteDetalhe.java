package web.bean.canonico;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Bean para Detalhes do Cliente 
 *
 */
public class ClienteDetalhe implements Serializable {

    /**
	 * serialVersionUID gerada
	 */
    private static final long serialVersionUID = -785755458248905634L;
	/**
     * O codigo
     */
    private Long codigo;
    /**
     * O cliente relacionado
     */
    private Cliente cliente;
    /**
     * Restricao Financeira
     */
    private Character restricaoFinanceira;
    /**
     * rz Retricao Financeira
     */
    private Byte rzRestricaoFinanceira;
    /**
     *  Faturamento Ano
     */
    private Long faturamentoAno;
    /**
     * Grupo Economico
     */
    private String grupoEconomico;
    /**
     * Limite de Cr�dito
     */
    private Long limiteCredito;
    /**
     * Data Inicial de Validade Do Limite de Cr�dito
     */
    private Date dataInicialValidadeLimiteCredito;
    /**
     * Data de Vencimento do Limite de Cr�dito
     */
    private Date dataVencimentoLimiteCredito;
    /**
     * Banco Limite de Cr�dito
     */
    private Short bancoLimiteCredito;
    /**
     * Limite de cr�dito contratado
     */
    private Character limiteCreditoContratado;
    /**
     * Modificador Limite de cr�dito
     */
    private Character modificadorLimiteCredito;
    /**
     * cliente Holding
     */
    private Character clienteHolding;
    /**
     * Site
     */
    private String site;
    /**
     * Participa��o
     */
    private BigDecimal participacao;
    /**
     * Quantidade Funcion�rios
     */
    private Integer quantidadeFuncionario;
    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }
    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * @return the restricaoFinanceira
     */
    public Character getRestricaoFinanceira() {
        return restricaoFinanceira;
    }
    /**
     * @param restricaoFinanceira the restricaoFinanceira to set
     */
    public void setRestricaoFinanceira(Character restricaoFinanceira) {
        this.restricaoFinanceira = restricaoFinanceira;
    }
    /**
     * @return the rzRestricaoFinanceira
     */
    public Byte getRzRestricaoFinanceira() {
        return rzRestricaoFinanceira;
    }
    /**
     * @param rzRestricaoFinanceira the rzRestricaoFinanceira to set
     */
    public void setRzRestricaoFinanceira(Byte rzRestricaoFinanceira) {
        this.rzRestricaoFinanceira = rzRestricaoFinanceira;
    }
    /**
     * @return the faturamentoAno
     */
    public Long getFaturamentoAno() {
        return faturamentoAno;
    }
    /**
     * @param faturamentoAno the faturamentoAno to set
     */
    public void setFaturamentoAno(Long faturamentoAno) {
        this.faturamentoAno = faturamentoAno;
    }
    /**
     * @return the grupoEconomico
     */
    public String getGrupoEconomico() {
        return grupoEconomico;
    }
    /**
     * @param grupoEconomico the grupoEconomico to set
     */
    public void setGrupoEconomico(String grupoEconomico) {
        this.grupoEconomico = grupoEconomico;
    }
    /**
     * @return the limiteCredito
     */
    public Long getLimiteCredito() {
        return limiteCredito;
    }
    /**
     * @param limiteCredito the limiteCredito to set
     */
    public void setLimiteCredito(Long limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    /**
     * @return the dataInicialValidadeLimiteCredito
     */
    public Date getDataInicialValidadeLimiteCredito() {
        return dataInicialValidadeLimiteCredito;
    }
    /**
     * @param dataInicialValidadeLimiteCredito the dataInicialValidadeLimiteCredito to set
     */
    public void setDataInicialValidadeLimiteCredito(
            Date dataInicialValidadeLimiteCredito) {
        this.dataInicialValidadeLimiteCredito = dataInicialValidadeLimiteCredito;
    }
    /**
     * @return the dataVencimentoLimiteCredito
     */
    public Date getDataVencimentoLimiteCredito() {
        return dataVencimentoLimiteCredito;
    }
    /**
     * @param dataVencimentoLimiteCredito the dataVencimentoLimiteCredito to set
     */
    public void setDataVencimentoLimiteCredito(Date dataVencimentoLimiteCredito) {
        this.dataVencimentoLimiteCredito = dataVencimentoLimiteCredito;
    }
    /**
     * @return the bancoLimiteCredito
     */
    public Short getBancoLimiteCredito() {
        return bancoLimiteCredito;
    }
    /**
     * @param bancoLimiteCredito the bancoLimiteCredito to set
     */
    public void setBancoLimiteCredito(Short bancoLimiteCredito) {
        this.bancoLimiteCredito = bancoLimiteCredito;
    }
    /**
     * @return the limiteCreditoContratado
     */
    public Character getLimiteCreditoContratado() {
        return limiteCreditoContratado;
    }
    /**
     * @param limiteCreditoContratado the limiteCreditoContratado to set
     */
    public void setLimiteCreditoContratado(Character limiteCreditoContratado) {
        this.limiteCreditoContratado = limiteCreditoContratado;
    }
    /**
     * @return the modificadorLimiteCredito
     */
    public Character getModificadorLimiteCredito() {
        return modificadorLimiteCredito;
    }
    /**
     * @param modificadorLimiteCredito the modificadorLimiteCredito to set
     */
    public void setModificadorLimiteCredito(Character modificadorLimiteCredito) {
        this.modificadorLimiteCredito = modificadorLimiteCredito;
    }
    /**
     * @return the clienteHolding
     */
    public Character getClienteHolding() {
        return clienteHolding;
    }
    /**
     * @param clienteHolding the clienteHolding to set
     */
    public void setClienteHolding(Character clienteHolding) {
        this.clienteHolding = clienteHolding;
    }
    /**
     * @return the site
     */
    public String getSite() {
        return site;
    }
    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }
    /**
     * @return the participacao
     */
    public BigDecimal getParticipacao() {
        return participacao;
    }
    /**
     * @param participacao the participacao to set
     */
    public void setParticipacao(BigDecimal participacao) {
        this.participacao = participacao;
    }
    /**
     * @return the quantidadeFuncionario
     */
    public Integer getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }
    /**
     * @param quantidadeFuncionario the quantidadeFuncionario to set
     */
    public void setQuantidadeFuncionario(Integer quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }
    
    
}
