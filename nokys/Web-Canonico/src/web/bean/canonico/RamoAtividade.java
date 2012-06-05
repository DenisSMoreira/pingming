package web.bean.canonico;

/**
 * 
 * bean Ramo de Atividade
 *
 */
public class RamoAtividade {
	
	/**
	 * codigo da tabela de ramo de atividade
	 */
	private Integer codigo;
	
	/**
	 * Atributo = ramo de atividade
	 */
	private String ramoAtividade;
	
	/**
	 * Atributo = codigo Exterior
	 */
	private Character codigoExterno;

	/**
	 * 
	 * @return codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return ramoAtividade
	 */
	public String getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * 
	 * @param ramoAtividade
	 */
	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}


    /**
     * @param codigoExterno the codigoExterno to set
     */
    public void setCodigoExterno(Character codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    /**
     * @return the codigoExterno
     */
    public Character getCodigoExterno() {
        return codigoExterno;
    }


	
	
	

}
