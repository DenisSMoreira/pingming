package web.bean.canonico;

import java.io.Serializable;

/**
 * Bean Tipo Empresa
 * 
 */
public class TipoEmpresa implements Serializable {

	/**
	 * Id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Codigo Tipo Empresa
	 * 
	 */
	private Integer codigoTipoEmpresa;
	/**
	 * Recomenda��o T�cnica Empresa
	 * 
	 */
	private String recomendacaoTecnicaEmpresa;
	/**
	 * C�digo Esterior
	 * 
	 */
	private Short codigoExterno;

	/**
	 * @return the codigoTipoEmpresa
	 */
	public Integer getCodigoTipoEmpresa() {
		return codigoTipoEmpresa;
	}

	/**
	 * @param codigoTipoEmpresa
	 *            the codigoTipoEmpresa to set
	 */
	public void setCodigoTipoEmpresa(Integer codigoTipoEmpresa) {
		this.codigoTipoEmpresa = codigoTipoEmpresa;
	}

	/**
	 * @return the recomendacaoTecnicaEmpresa
	 */
	public String getRecomendacaoTecnicaEmpresa() {
		return recomendacaoTecnicaEmpresa;
	}

	/**
	 * @param recomendacaoTecnicaEmpresa
	 *            the recomendacaoTecnicaEmpresa to set
	 */
	public void setRecomendacaoTecnicaEmpresa(String recomendacaoTecnicaEmpresa) {
		this.recomendacaoTecnicaEmpresa = recomendacaoTecnicaEmpresa;
	}

    /**
     * @param codigoExterno the codigoExterno to set
     */
    public void setCodigoExterno(Short codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    /**
     * @return the codigoExterno
     */
    public Short getCodigoExterno() {
        return codigoExterno;
    }

}
