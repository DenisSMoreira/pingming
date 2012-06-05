package web.bean.canonico;

/**
 * 
 * bean Divis�o do Ramo de Atividade
 *
 */
public class DivisaoRamoAtividade {
	
	/**
	 * Atributo = ramo de Atividade
	 * Vem da classe RamoAtividade
	 */
	private RamoAtividade ramoAtividade;
	
	/**
	 * Atributo = codigo
	 */
	private Integer codigo;
	
	/**
	 * Atributo = divisaoRamoAtividade
	 */
	private String divisaoRamoAtividade;
	
	/**
	 * Atributo = codigoExterior
	 */
	private Byte codigoExterno;

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
	 * @return divisaoRamoAtividade
	 */
	public String getDivisaoRamoAtividade() {
		return divisaoRamoAtividade;
	}

	/**
	 * 
	 * @param divisaoRamoAtividade
	 */
	public void setDivisaoRamoAtividade(String divisaoRamoAtividade) {
		this.divisaoRamoAtividade = divisaoRamoAtividade;
	}


	/**
	 * 
	 * @return ramoAtividade
	 */
	public RamoAtividade getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * 
	 * @param ramoAtividade
	 */
	public void setRamoAtividade(RamoAtividade ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

    /**
     * @param codigoExterno the codigoExterno to set
     */
    public void setCodigoExterno(Byte codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    /**
     * @return the codigoExterno
     */
    public Byte getCodigoExterno() {
        return codigoExterno;
    }
	
	
	
	
	
	

}
