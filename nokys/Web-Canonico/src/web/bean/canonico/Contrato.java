package web.bean.canonico;

import java.io.Serializable;
import java.sql.Date;

/**
 * Bean - Responsavel por armazenar dados do contrato
 */
public class Contrato implements Serializable{
    
	private static final long serialVersionUID = 4360828198685166698L;
	
	private Long codigo;
    private Cliente cliente ;
    private MeioPagamento meioPagamento;
    private Simula simula;
    private Filial filialEntrega;
    private Canal canalEntrada;
    private StatusContrato statusContrato;
    private Emissao emissao;
    private Contrato contrato;
    private Filial filialFaturamento;
    private Produto produto;
    private FormaPagamento formaPagamento;
    private EntidadeDevedora entidadeDevedora;
    private Filial filialContratante;
    private Canal canalVenda;
    private Long numeroContrato;
    private Character tipoEntrega;
    private Character tipoFaturamento;
    private Date dataAssinatura;
    private Date dataCriacao;
    private Date dataAtualizacao;
    private Boolean flagTermoAceitdecisao;
    private String nomeEmbossing;
    private Integer quantidadeFuncionarios;
    private Long numeroLimiteMes;
    private Integer numeroSeqCartao;
    private Boolean flagSincronizacao;
    private Byte tipoContrato;
    private Boolean flagExibeTarifa;
    private Character uploadCsv;
    private Byte numeroPrzmineftvc;

    public Contrato(){
        
    }

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
	 * @return the meioPagamento
	 */
	public MeioPagamento getMeioPagamento() {
		return meioPagamento;
	}

	/**
	 * @param meioPagamento the meioPagamento to set
	 */
	public void setMeioPagamento(MeioPagamento meioPagamento) {
		this.meioPagamento = meioPagamento;
	}

	/**
	 * @return the simula
	 */
	public Simula getSimula() {
		return simula;
	}

	/**
	 * @param simula the simula to set
	 */
	public void setSimula(Simula simula) {
		this.simula = simula;
	}

	/**
	 * @return the filialEntrega
	 */
	public Filial getFilialEntrega() {
		return filialEntrega;
	}

	/**
	 * @param filialEntrega the filialEntrega to set
	 */
	public void setFilialEntrega(Filial filialEntrega) {
		this.filialEntrega = filialEntrega;
	}

	/**
	 * @return the canalEntrada
	 */
	public Canal getCanalEntrada() {
		return canalEntrada;
	}

	/**
	 * @param canalEntrada the canalEntrada to set
	 */
	public void setCanalEntrada(Canal canalEntrada) {
		this.canalEntrada = canalEntrada;
	}

	/**
	 * @return the statusContrato
	 */
	public StatusContrato getStatusContrato() {
		return statusContrato;
	}

	/**
	 * @param statusContrato the statusContrato to set
	 */
	public void setStatusContrato(StatusContrato statusContrato) {
		this.statusContrato = statusContrato;
	}

	/**
	 * @return the emissao
	 */
	public Emissao getEmissao() {
		return emissao;
	}

	/**
	 * @param emissao the emissao to set
	 */
	public void setEmissao(Emissao emissao) {
		this.emissao = emissao;
	}

	/**
	 * @return the contrato
	 */
	public Contrato getContrato() {
		return contrato;
	}

	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	/**
	 * @return the filialFaturamento
	 */
	public Filial getFilialFaturamento() {
		return filialFaturamento;
	}

	/**
	 * @param filialFaturamento the filialFaturamento to set
	 */
	public void setFilialFaturamento(Filial filialFaturamento) {
		this.filialFaturamento = filialFaturamento;
	}

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * @return the formaPagamento
	 */
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	/**
	 * @param formaPagamento the formaPagamento to set
	 */
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	/**
	 * @return the entidadeDevedora
	 */
	public EntidadeDevedora getEntidadeDevedora() {
		return entidadeDevedora;
	}

	/**
	 * @param entidadeDevedora the entidadeDevedora to set
	 */
	public void setEntidadeDevedora(EntidadeDevedora entidadeDevedora) {
		this.entidadeDevedora = entidadeDevedora;
	}

	/**
	 * @return the filialContratante
	 */
	public Filial getFilialContratante() {
		return filialContratante;
	}

	/**
	 * @param filialContratante the filialContratante to set
	 */
	public void setFilialContratante(Filial filialContratante) {
		this.filialContratante = filialContratante;
	}

	/**
	 * @return the canalVenda
	 */
	public Canal getCanalVenda() {
		return canalVenda;
	}

	/**
	 * @param canalVenda the canalVenda to set
	 */
	public void setCanalVenda(Canal canalVenda) {
		this.canalVenda = canalVenda;
	}

	/**
	 * @return the numeroContrato
	 */
	public Long getNumeroContrato() {
		return numeroContrato;
	}

	/**
	 * @param numeroContrato the numeroContrato to set
	 */
	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	/**
	 * @return the tipoEntrega
	 */
	public Character getTipoEntrega() {
		return tipoEntrega;
	}

	/**
	 * @param tipoEntrega the tipoEntrega to set
	 */
	public void setTipoEntrega(Character tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	/**
	 * @return the tipoFaturamento
	 */
	public Character getTipoFaturamento() {
		return tipoFaturamento;
	}

	/**
	 * @param tipoFaturamento the tipoFaturamento to set
	 */
	public void setTipoFaturamento(Character tipoFaturamento) {
		this.tipoFaturamento = tipoFaturamento;
	}

	/**
	 * @return the dataAssinatura
	 */
	public Date getDataAssinatura() {
		return dataAssinatura;
	}

	/**
	 * @param dataAssinatura the dataAssinatura to set
	 */
	public void setDataAssinatura(Date dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}

	/**
	 * @return the dataCriacao
	 */
	public Date getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	/**
	 * @return the dataAtualizacao
	 */
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	/**
	 * @param dataAtualizacao the dataAtualizacao to set
	 */
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	/**
	 * @return the flagTermoAceitdecisao
	 */
	public Boolean getFlagTermoAceitdecisao() {
		return flagTermoAceitdecisao;
	}

	/**
	 * @param flagTermoAceitdecisao the flagTermoAceitdecisao to set
	 */
	public void setFlagTermoAceitdecisao(Boolean flagTermoAceitdecisao) {
		this.flagTermoAceitdecisao = flagTermoAceitdecisao;
	}

	/**
	 * @return the nomeEmbossing
	 */
	public String getNomeEmbossing() {
		return nomeEmbossing;
	}

	/**
	 * @param nomeEmbossing the nomeEmbossing to set
	 */
	public void setNomeEmbossing(String nomeEmbossing) {
		this.nomeEmbossing = nomeEmbossing;
	}

	/**
	 * @return the quantidadeFuncionarios
	 */
	public Integer getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}

	/**
	 * @param quantidadeFuncionarios the quantidadeFuncionarios to set
	 */
	public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}

	/**
	 * @return the numeroLimiteMes
	 */
	public Long getNumeroLimiteMes() {
		return numeroLimiteMes;
	}

	/**
	 * @param numeroLimiteMes the numeroLimiteMes to set
	 */
	public void setNumeroLimiteMes(Long numeroLimiteMes) {
		this.numeroLimiteMes = numeroLimiteMes;
	}

	/**
	 * @return the numeroSeqCartao
	 */
	public Integer getNumeroSeqCartao() {
		return numeroSeqCartao;
	}

	/**
	 * @param numeroSeqCartao the numeroSeqCartao to set
	 */
	public void setNumeroSeqCartao(Integer numeroSeqCartao) {
		this.numeroSeqCartao = numeroSeqCartao;
	}

	/**
	 * @return the flagSincronizacao
	 */
	public Boolean getFlagSincronizacao() {
		return flagSincronizacao;
	}

	/**
	 * @param flagSincronizacao the flagSincronizacao to set
	 */
	public void setFlagSincronizacao(Boolean flagSincronizacao) {
		this.flagSincronizacao = flagSincronizacao;
	}

	/**
	 * @return the tipoContrato
	 */
	public Byte getTipoContrato() {
		return tipoContrato;
	}

	/**
	 * @param tipoContrato the tipoContrato to set
	 */
	public void setTipoContrato(Byte tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	/**
	 * @return the flagExibeTarifa
	 */
	public Boolean getFlagExibeTarifa() {
		return flagExibeTarifa;
	}

	/**
	 * @param flagExibeTarifa the flagExibeTarifa to set
	 */
	public void setFlagExibeTarifa(Boolean flagExibeTarifa) {
		this.flagExibeTarifa = flagExibeTarifa;
	}

	/**
	 * @return the uploadCsv
	 */
	public Character getUploadCsv() {
		return uploadCsv;
	}

	/**
	 * @param uploadCsv the uploadCsv to set
	 */
	public void setUploadCsv(Character uploadCsv) {
		this.uploadCsv = uploadCsv;
	}

	/**
	 * @return the numeroPrzmineftvc
	 */
	public Byte getNumeroPrzmineftvc() {
		return numeroPrzmineftvc;
	}

	/**
	 * @param numeroPrzmineftvc the numeroPrzmineftvc to set
	 */
	public void setNumeroPrzmineftvc(Byte numeroPrzmineftvc) {
		this.numeroPrzmineftvc = numeroPrzmineftvc;
	}

   

}
