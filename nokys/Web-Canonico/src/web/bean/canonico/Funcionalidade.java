package web.bean.canonico;

import java.io.Serializable;
import java.util.List;

public class Funcionalidade implements Serializable
{
	private static final long serialVersionUID = 8831317138171310363L;

	/**
	 * C�digo da funcionalidade
	 */
	private Integer codigo;
	
	/**
	 * Descri��o da funcionalidade
	 */
	private String descricao;
	
	/**
	 * Sigla para a funcionalidade
	 */
	private String sigla;

	
	private List<ItemMenu> itensMenu;
	
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

	/**
	 * @param itensMenu the itensMenu to set
	 */
	public void setItensMenu(List<ItemMenu> itensMenu) {
		this.itensMenu = itensMenu;
	}

	/**
	 * @return the itensMenu
	 */
	public List<ItemMenu> getItensMenu() {
		return itensMenu;
	}
	
	

}
