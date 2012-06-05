package web.bean.canonico;

import java.io.Serializable;

/**
 * 
 * Bean Empresa Parceira
 *
 */
public class EmpresaParceira implements Serializable {

	/**
	 * Serial Number
	 */
	private static final long serialVersionUID = 7691077872262361406L;
	
	/**
	 * Atributo Codigo da empresa
	 */
	private Long codigoEmpresa;

	/**
	 * Atributo Nome da empresa
	 */
	private String nomeEmpresa;
	
	/**
	 * Atributo numero da raiz Cnpj
	 */
	private Long numeroRaizCnpj;
	
	/**
	 * Atributo numero do Cnpj da filial
	 */
	private Long numeroFilialCnpj;
	
	/**
	 * Atributo numero do Cnpj
	 */
	private Long numeroCnpj;
	
	/**
	 * Atributo numero DDD da filial
	 */
	private Long numeroDddFilial;
	
	/**
	 * Atributo numero do telefone da filial
	 */
	private Long numeroTelefoneFilial;
	
	/**
	 * Atributo numero do fax da filial
	 */
	private Long numeroFaxFilial;
	
	/**
	 * Atributo numero do DDD e do fax da filial
	 */
	private Long numeroDddFaxFilial;

	
	
	/**
	 * @return the codigoEmpresa
	 */
	public Long getCodigoEmpresa() {
		return codigoEmpresa;
	}
	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(Long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	/**
	 * @return the nomeEmpresa
	 */
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	/**
	 * @param nomeEmpresa the nomeEmpresa to set
	 */
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	/**
	 * @return the numeroRaizCnpj
	 */
	public Long getNumeroRaizCnpj() {
		return numeroRaizCnpj;
	}
	/**
	 * @param numeroRaizCnpj the numeroRaizCnpj to set
	 */
	public void setNumeroRaizCnpj(Long numeroRaizCnpj) {
		this.numeroRaizCnpj = numeroRaizCnpj;
	}
	/**
	 * @return the numeroFilialCnpj
	 */
	public Long getNumeroFilialCnpj() {
		return numeroFilialCnpj;
	}
	/**
	 * @param numeroFilialCnpj the numeroFilialCnpj to set
	 */
	public void setNumeroFilialCnpj(Long numeroFilialCnpj) {
		this.numeroFilialCnpj = numeroFilialCnpj;
	}
	/**
	 * @return the numeroCnpj
	 */
	public Long getNumeroCnpj() {
		return numeroCnpj;
	}
	/**
	 * @param numeroCnpj the numeroCnpj to set
	 */
	public void setNumeroCnpj(Long numeroCnpj) {
		this.numeroCnpj = numeroCnpj;
	}
	/**
	 * @return the numeroDddFilial
	 */
	public Long getNumeroDddFilial() {
		return numeroDddFilial;
	}
	/**
	 * @param numeroDddFilial the numeroDddFilial to set
	 */
	public void setNumeroDddFilial(Long numeroDddFilial) {
		this.numeroDddFilial = numeroDddFilial;
	}
	/**
	 * @return the numeroTelefoneFilial
	 */
	public Long getNumeroTelefoneFilial() {
		return numeroTelefoneFilial;
	}
	/**
	 * @param numeroTelefoneFilial the numeroTelefoneFilial to set
	 */
	public void setNumeroTelefoneFilial(Long numeroTelefoneFilial) {
		this.numeroTelefoneFilial = numeroTelefoneFilial;
	}
	/**
	 * @return the numeroFaxFilial
	 */
	public Long getNumeroFaxFilial() {
		return numeroFaxFilial;
	}
	/**
	 * @param numeroFaxFilial the numeroFaxFilial to set
	 */
	public void setNumeroFaxFilial(Long numeroFaxFilial) {
		this.numeroFaxFilial = numeroFaxFilial;
	}
	/**
	 * @return the numeroDddFaxFilial
	 */
	public Long getNumeroDddFaxFilial() {
		return numeroDddFaxFilial;
	}
	/**
	 * @param numeroDddFaxFilial the numeroDddFaxFilial to set
	 */
	public void setNumeroDddFaxFilial(Long numeroDddFaxFilial) {
		this.numeroDddFaxFilial = numeroDddFaxFilial;
	}
}
