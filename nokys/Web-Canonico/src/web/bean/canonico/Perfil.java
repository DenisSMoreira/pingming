package web.bean.canonico;

import java.io.Serializable;
import java.util.List;

public class Perfil implements Serializable, Comparable<Perfil> {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -236789394188116437L;
	
	
	/**
	 * Atributo c�digo do perfil.
	 */
	private Integer codigo;
	/**
	 * Atributo descri��o do perfil.
	 */
	private String descricao;

	/**
	 * Atributo Perfil Funcionalidade Modo de Acesso.
	 */
	private List<PerfilFuncionalidade> listaPerfilFunc;

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
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
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int compareTo(Perfil perfilOutro) {

		return this.getDescricao().compareTo(perfilOutro.getDescricao());
	}

	@Override
	public String toString() {
		return this.descricao;
	}

	/**
	 * @param listaPerfilFunc
	 *            the listaPerfilFunc to set
	 */
	public void setListaPerfilFunc(List<PerfilFuncionalidade> listaPerfilFunc) {
		this.listaPerfilFunc = listaPerfilFunc;
	}

	/**
	 * @return the listaPerfilFunc
	 */
	public List<PerfilFuncionalidade> getListaPerfilFunc() {
		return listaPerfilFunc;
	}
}
