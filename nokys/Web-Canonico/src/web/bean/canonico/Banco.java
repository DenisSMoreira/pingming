package web.bean.canonico;

import java.io.Serializable;

/**
 * Bean - Dados do banco
 */
public class Banco implements Serializable {

    /**
	 * Serial Number
	 */
	private static final long serialVersionUID = -4196420678999553733L;

	/**
     * Numero do banco
     */
    private Long numeroBanco;

    /**
     * Nome do banco
     */
    private String nomeBanco;

    /**
     * Atributo usado para sincronizacao
     */
    private Integer codigoExterno;



    /**
	 * @return the numeroBanco
	 */
	public Long getNumeroBanco() {
		return numeroBanco;
	}

	/**
	 * @param numeroBanco the numeroBanco to set
	 */
	public void setNumeroBanco(Long numeroBanco) {
		this.numeroBanco = numeroBanco;
	}

	/**
	 * @return the nomeBanco
	 */
	public String getNomeBanco() {
		return nomeBanco;
	}

	/**
	 * @param nomeBanco the nomeBanco to set
	 */
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}


    /**
     * @param codigoExterno the codigoExterno to set
     */
    public void setCodigoExterno(Integer codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    /**
     * @return the codigoExterno
     */
    public Integer getCodigoExterno() {
        return codigoExterno;
    }

}
