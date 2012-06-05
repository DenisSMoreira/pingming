package web.bean.canonico;

import java.io.Serializable;

public class MotivoInclusaoListaNegra implements Serializable {

	private static final long serialVersionUID = -5395124645202867814L;
	private Short codigo;
	private String descricao;
	
	public MotivoInclusaoListaNegra(){
		
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}

	public Short getCodigo() {
		return codigo;
	}
}
