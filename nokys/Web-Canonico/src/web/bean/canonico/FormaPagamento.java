package web.bean.canonico;

import java.io.Serializable;

/**
 * 
 * Bean Forma de pagamentos
 *
 */
public class FormaPagamento implements Serializable {

	/**
	 * Serial Number
	 */
	private static final long serialVersionUID = -4386360374332326825L;

	/**
	 * Atributo Codigo de forma de pagamento
	 */
	private Long codigoFormaPagamento;
	
	/**
	 * Atributo Descri��o de forma de pagamentos
	 */
	private String descricaoFormaPagamento;
	
	/**
	 * Atributo Codigo Externo
	 */
	private String codigoExterno;
	
	
	/**
	 * @return the codigoFormaPagamento
	 */
	public Long getCodigoFormaPagamento() {
		return codigoFormaPagamento;
	}
	/**
	 * @param codigoFormaPagamento the codigoFormaPagamento to set
	 */
	public void setCodigoFormaPagamento(Long codigoFormaPagamento) {
		this.codigoFormaPagamento = codigoFormaPagamento;
	}
	/**
	 * @return the descricaoFormaPagamento
	 */
	public String getDescricaoFormaPagamento() {
		return descricaoFormaPagamento;
	}
	/**
	 * @param descricaoFormaPagamento the descricaoFormaPagamento to set
	 */
	public void setDescricaoFormaPagamento(String descricaoFormaPagamento) {
		this.descricaoFormaPagamento = descricaoFormaPagamento;
	}
	/**
	 * @return the codigoExterno
	 */
	public String getCodigoExterno() {
		return codigoExterno;
	}
	/**
	 * @param codigoExterno the codigoExterno to set
	 */
	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}
}
