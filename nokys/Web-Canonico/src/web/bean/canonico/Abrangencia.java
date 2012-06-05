package web.bean.canonico;

import java.io.Serializable;
import java.sql.Date;

/**
 * Bean para Acesso com Senha Expirada
 */
public class Abrangencia implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7022035823212423059L;
	
	/**
     * c�digo da abrang�ncia
     */
    private Long codigo;
    /**
     * Intelocutor
     */
    private Interlocutor interlocutor;
    
    /**
     * Filial do contratante
     */
    private Filial filialContratante;

    /**
     * Perfil
     */
    private Perfil perfil;

    /**
     * c�digo do contrato
     */
    private Long codContrato;

    /**
     * C�digo da localiza��o da entrega
     */
    private Long codLocalEntrega;

    /**
     * N�mero da ordem da relev�ncia
     */
    private Integer numOrdRelevancia;

    /**
     * Sincronismo
     */
    private Boolean sincronismo;

    /**
     * Data de Atualizacao
     */
    private Date dataAtualizacao;

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the interlocutor
	 */
	public Interlocutor getInterlocutor() {
		return interlocutor;
	}

	/**
	 * @param interlocutor the interlocutor to set
	 */
	public void setInterlocutor(Interlocutor interlocutor) {
		this.interlocutor = interlocutor;
	}

	/**
	 * @return the filialContratante
	 */
	public Filial getFilialContratante() {
		return filialContratante;
	}

	/**
	 * @param filialContratante the filialContratante to set
	 */
	public void setFilialContratante(Filial filialContratante) {
		this.filialContratante = filialContratante;
	}

	/**
	 * @return the perfil
	 */
	public Perfil getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	/**
	 * @return the codContrato
	 */
	public Long getCodContrato() {
		return codContrato;
	}

	/**
	 * @param codContrato the codContrato to set
	 */
	public void setCodContrato(Long codContrato) {
		this.codContrato = codContrato;
	}

	/**
	 * @return the codLocalEntrega
	 */
	public Long getCodLocalEntrega() {
		return codLocalEntrega;
	}

	/**
	 * @param codLocalEntrega the codLocalEntrega to set
	 */
	public void setCodLocalEntrega(Long codLocalEntrega) {
		this.codLocalEntrega = codLocalEntrega;
	}

	/**
	 * @return the numOrdRelevancia
	 */
	public Integer getNumOrdRelevancia() {
		return numOrdRelevancia;
	}

	/**
	 * @param numOrdRelevancia the numOrdRelevancia to set
	 */
	public void setNumOrdRelevancia(Integer numOrdRelevancia) {
		this.numOrdRelevancia = numOrdRelevancia;
	}

	/**
	 * @return the sincronismo
	 */
	public Boolean getSincronismo() {
		return sincronismo;
	}

	/**
	 * @param sincronismo the sincronismo to set
	 */
	public void setSincronismo(Boolean sincronismo) {
		this.sincronismo = sincronismo;
	}

	/**
	 * @return the dataAtualizacao
	 */
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	/**
	 * @param dataAtualizacao the dataAtualizacao to set
	 */
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
}
