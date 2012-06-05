package web.bean.canonico;

import java.io.Serializable;

public class ItemMenu implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5679788209322718157L;
	
	private Integer codigo;
	private String descricao;
	private String descricaoAlternativa;
	private String url;
	private Funcionalidade funcionalidade;
	private ItemMenu itemMenuPai;
	
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param funcionalidade the funcionalidade to set
	 */
	public void setFuncionalidade(Funcionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}
	/**
	 * @return the funcionalidade
	 */
	public Funcionalidade getFuncionalidade() {
		return funcionalidade;
	}
	/**
	 * @param itemMenuPai the itemMenuPai to set
	 */
	public void setItemMenuPai(ItemMenu itemMenuPai) {
		this.itemMenuPai = itemMenuPai;
	}
	/**
	 * @return the itemMenuPai
	 */
	public ItemMenu getItemMenuPai() {
		return itemMenuPai;
	}
	/**
	 * @return the descricaoAlternativa
	 */
	public String getDescricaoAlternativa() {
		return descricaoAlternativa;
	}
	/**
	 * @param descricaoAlternativa the descricaoAlternativa to set
	 */
	public void setDescricaoAlternativa(String descricaoAlternativa) {
		this.descricaoAlternativa = descricaoAlternativa;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
