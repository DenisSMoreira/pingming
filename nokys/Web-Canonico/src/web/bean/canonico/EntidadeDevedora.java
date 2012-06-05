package web.bean.canonico;

import java.io.Serializable;

/**
 * 
 * Bean Entidade Devedora
 *
 */
public class EntidadeDevedora implements Serializable {

	/**
	 * Serial number
	 */
	private static final long serialVersionUID = -1734013429818573408L;

	/**
	 * Atributo Codigo entidade devedora
	 */
	private Long codigoEntidadeDevedora;
	
	/**
	 * Atributo Objeto Banco
	 */
	private Banco banco;
	
	/**
	 * Atributo Objeto Empredsa
	 */
	private EmpresaParceira empresaParceira;
	
	/**
	 * Atributo Codigo Tipo Entidade
	 */
	private Long codigoTipoEntidade;
	

	/**
	 * @return the codigoEntidadeDevedora
	 */
	public Long getCodigoEntidadeDevedora() {
		return codigoEntidadeDevedora;
	}
	/**
	 * @param codigoEntidadeDevedora the codigoEntidadeDevedora to set
	 */
	public void setCodigoEntidadeDevedora(Long codigoEntidadeDevedora) {
		this.codigoEntidadeDevedora = codigoEntidadeDevedora;
	}
	/**
	 * @return the banco
	 */
	public Banco getBanco() {
		return banco;
	}
	/**
	 * @param banco the banco to set
	 */
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	/**
	 * @return the empresaParceira
	 */
	public EmpresaParceira getEmpresaParceira() {
		return empresaParceira;
	}
	/**
	 * @param empresaParceira the empresaParceira to set
	 */
	public void setEmpresaParceira(EmpresaParceira empresaParceira) {
		this.empresaParceira = empresaParceira;
	}
	/**
	 * @return the codigoTipoEntidade
	 */
	public Long getCodigoTipoEntidade() {
		return codigoTipoEntidade;
	}
	/**
	 * @param codigoTipoEntidade the codigoTipoEntidade to set
	 */
	public void setCodigoTipoEntidade(Long codigoTipoEntidade) {
		this.codigoTipoEntidade = codigoTipoEntidade;
	}
}
