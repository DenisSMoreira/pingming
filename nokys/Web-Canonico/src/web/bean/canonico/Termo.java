package web.bean.canonico;

import java.io.Serializable;
import java.sql.Date;

public class Termo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7968327654217393303L;
	private Integer codigo;
	private String descricao;
	private Date dataInicialVigenciaTermo;
	private Byte codTipoTermo;

	public Termo() {

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicialVigenciaTermo() {
		return dataInicialVigenciaTermo;
	}

	public void setDataInicialVigenciaTermo(Date dataInicialVigenciaTermo) {
		this.dataInicialVigenciaTermo = dataInicialVigenciaTermo;
	}

	public Byte getCodTipoTermo() {
		return codTipoTermo;
	}

	public void setCodTipoTermo(Byte codTipoTermo) {
		this.codTipoTermo = codTipoTermo;
	}

}
