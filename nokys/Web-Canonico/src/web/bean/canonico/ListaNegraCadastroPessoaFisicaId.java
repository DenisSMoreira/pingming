package web.bean.canonico;

import java.io.Serializable;
import java.sql.Timestamp;

public class ListaNegraCadastroPessoaFisicaId implements Serializable
{

	private static final long serialVersionUID = 4119901922599022567L;
	private Long numeroCPF;
	private Timestamp inclusaoUsuarioListaNegra;

	
	public ListaNegraCadastroPessoaFisicaId(){
		
	}
	
	public void setNumeroCPF(Long numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public Long getNumeroCPF() {
		return numeroCPF;
	}
	public void setInclusaoUsuarioListaNegra(Timestamp inclusaoUsuarioListaNegra) {
		this.inclusaoUsuarioListaNegra = inclusaoUsuarioListaNegra;
	}
	public Timestamp getInclusaoUsuarioListaNegra() {
		return inclusaoUsuarioListaNegra;
	}

	
}
