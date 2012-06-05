package web.bean.canonico;

import java.io.Serializable;

public class ModoAcesso implements Serializable{

	private static final long serialVersionUID = -6970652587627133349L;

	/**
	 * C�digo do modo de acesso
	 */
	private Integer codigo;
	
	/**
	 * Descricao do modo de acesso
	 */
	private String descricao;
	
	/**
	 * Sigla para o modo de acesso
	 */
	private String sigla;

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
