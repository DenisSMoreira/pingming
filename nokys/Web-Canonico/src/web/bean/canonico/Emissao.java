package web.bean.canonico;

import java.io.Serializable;


/**
 * Bean - Armazena valores da Emissao
 */
public class Emissao implements Serializable {
    
 
    private static final long serialVersionUID = 3436764180253003763L;
    private Long codigo;
    private String codigoExterno;
    private Integer numeroCEP;
    private String municipio;
    private String bairro;
    private Integer codigoLogradouro;
    private Short codigoTipoLagradouro;
    private String descricaoTipoLogradouro;
    private String nomeLogradouro;
    private String numeroLogradouro;
    private String enderecoCompleto;
    private String nomeEmissao;
    private Long numeroCNPJ;
    private String UF;
    private String nomeMunicipio;
    
    public Emissao(){
        
        
    }
    
    
    /**
	 * @return the nomeMunicipio
	 */
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}


	/**
	 * @param nomeMunicipio the nomeMunicipio to set
	 */
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}


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
     * @return the codigoExterno
     */
    public String getCodigoExterno() {
        return codigoExterno;
    }
    /**
     * @param codigoExterno the codigoExterno to set
     */
    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
    /**
     * @return the numeroCEP
     */
    public Integer getNumeroCEP() {
        return numeroCEP;
    }
    /**
     * @param numeroCEP the numeroCEP to set
     */
    public void setNumeroCEP(Integer numeroCEP) {
        this.numeroCEP = numeroCEP;
    }
    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }
    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }
    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    /**
     * @return the codigoLogradouro
     */
    public Integer getCodigoLogradouro() {
        return codigoLogradouro;
    }
    /**
     * @param codigoLogradouro the codigoLogradouro to set
     */
    public void setCodigoLogradouro(Integer codigoLogradouro) {
        this.codigoLogradouro = codigoLogradouro;
    }
    /**
     * @return the codigoTipoLagradouro
     */
    public Short getCodigoTipoLagradouro() {
        return codigoTipoLagradouro;
    }
    /**
     * @param codigoTipoLagradouro the codigoTipoLagradouro to set
     */
    public void setCodigoTipoLagradouro(Short codigoTipoLagradouro) {
        this.codigoTipoLagradouro = codigoTipoLagradouro;
    }
    /**
     * @return the descricaoTipoLogradouro
     */
    public String getDescricaoTipoLogradouro() {
        return descricaoTipoLogradouro;
    }
    /**
     * @param descricaoTipoLogradouro the descricaoTipoLogradouro to set
     */
    public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro) {
        this.descricaoTipoLogradouro = descricaoTipoLogradouro;
    }
    /**
     * @return the nomeLogradouro
     */
    public String getNomeLogradouro() {
        return nomeLogradouro;
    }
    /**
     * @param nomeLogradouro the nomeLogradouro to set
     */
    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }
    /**
     * @return the numeroLogradouro
     */
    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }
    /**
     * @param numeroLogradouro the numeroLogradouro to set
     */
    public void setNumeroLogradouro(String numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }
    /**
     * @return the enderecoCompleto
     */
    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }
    /**
     * @param enderecoCompleto the enderecoCompleto to set
     */
    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }
    /**
     * @return the nomeEmissao
     */
    public String getNomeEmissao() {
        return nomeEmissao;
    }
    /**
     * @param nomeEmissao the nomeEmissao to set
     */
    public void setNomeEmissao(String nomeEmissao) {
        this.nomeEmissao = nomeEmissao;
    }
    /**
     * @return the numeroCNPJ
     */
    public Long getNumeroCNPJ() {
        return numeroCNPJ;
    }
    /**
     * @param numeroCNPJ the numeroCNPJ to set
     */
    public void setNumeroCNPJ(Long numeroCNPJ) {
        this.numeroCNPJ = numeroCNPJ;
    }
    /**
     * @return the uF
     */
    public String getUF() {
        return UF;
    }
    /**
     * @param uF the uF to set
     */
    public void setUF(String uF) {
        UF = uF;
    }

  
}
