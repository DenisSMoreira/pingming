package web.bean.canonico;

import java.io.Serializable;

/**
 * 
 * Bean Cargo
 * 
 * 
 */
public class Cargo implements Serializable {

	/**
	 * 
	 * Atributo = Serial Version
	 * 
	 */

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * Atributo = Codigo Cargo
	 * 
	 */

	private Integer codigoCargo;

	/**
	 * 
	 * Atributo = Descri��o do Cargo
	 * 
	 */
	private String descricaoCargo;

	/**
	 * @return the codCargo
	 */
	private String codigoExterno;

	/**
	 * @return the codigoCargo
	 */
	public Integer getCodigoCargo() {
		return codigoCargo;
	}

	/**
	 * @param codigoCargo
	 *            the codigoCargo to set
	 */
	public void setCodigoCargo(Integer codigoCargo) {
		this.codigoCargo = codigoCargo;
	}

	/**
	 * @return the descricaoCargo
	 */
	public String getDescricaoCargo() {
		return descricaoCargo;
	}

	/**
	 * @param descricaoCargo
	 *            the descricaoCargo to set
	 */
	public void setDescricaoCargo(String descricaoCargo) {
		this.descricaoCargo = descricaoCargo;
	}

    /**
     * @param codigoExterno the codigoExterno to set
     */
    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    /**
     * @return the codigoExterno
     */
    public String getCodigoExterno() {
        return codigoExterno;
    }

}
