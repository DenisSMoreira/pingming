package web.canonico;

import java.io.Serializable;

/**
 * 
 * Classe Endereco - Bean tabela TENDER
 * 
 */
public class Endereco implements Serializable {

    /**
	 * serialVersionUID gerada
	 */
    private static final long serialVersionUID = -7728064390319272313L;

	/**
     * O c�digo do endere�o
     */
    private Long codigo;

    /**
     * Nome do Logradouro
     */
    private String logradouro;
    /**
     * N�mero do Logradouro
     */
    private String numero;
    /**
     * Complemento do Endere�o
     */
    private String complemento;
    /**
     * Bairro
     */
    private String bairro;
    /**
     * N�mero da Caixa Postal
     */
    private String caixaPostal;
    /**
     * CEP da Caixa Postal
     */
    private Integer cepCaixaPostal;
    /**
     * Munic�pio
     */
    private String municipio;
    /**
     * CEP
     */
    private Integer cep;
    /**
     * Tipo de Logradouro
     */
    private String tipoLogradouro;
    /**
     * Sigla da Unidade Federativa
     */
    private String uf;
    /**
     * C�digo do Logradouro
     */
    private Integer codigoLogradouro;
    /**
     * C�digo do Tipo de Logradouro
     */
    private Short codigoTipoLogradouro;
    /**
     * @return O codigo
     */
    public Long getCodigo() {
        return codigo;
    }
    /**
     * @param codigo O codigo a ser setado
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    /**
     * @return O logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }
    /**
     * @param logradouro O logradouro a ser setado
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    /**
     * @return O numero
     */
    public String getNumero() {
        return numero;
    }
    /**
     * @param numero O numero a ser setado
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * @return O complemento
     */
    public String getComplemento() {
        return complemento;
    }
    /**
     * @param complemento O complemento a ser setado
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    /**
     * @return O bairro
     */
    public String getBairro() {
        return bairro;
    }
    /**
     * @param bairro O bairro a ser setado
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    /**
     * @return A caixaPostal
     */
    public String getCaixaPostal() {
        return caixaPostal;
    }
    /**
     * @param caixaPostal A caixaPostal a ser setado
     */
    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }
    /**
     * @return O cepCaixaPostal
     */
    public Integer getCepCaixaPostal() {
        return cepCaixaPostal;
    }
    /**
     * @param cepCaixaPostal O cepCaixaPostal a ser setado
     */
    public void setCepCaixaPostal(Integer cepCaixaPostal) {
        this.cepCaixaPostal = cepCaixaPostal;
    }
    /**
     * @return O municipio
     */
    public String getMunicipio() {
        return municipio;
    }
    /**
     * @param municipio O municipio a ser setado
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    /**
     * @return O cep
     */
    public Integer getCep() {
        return cep;
    }
    /**
     * @param cep O cep a ser setado
     */
    public void setCep(Integer cep) {
        this.cep = cep;
    }
    /**
     * @return O tipoLogradouro
     */
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }
    /**
     * @param tipoLogradouro O tipoLogradouro a ser setado
     */
    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }
    /**
     * @return A uf
     */
    public String getUf() {
        return uf;
    }
    /**
     * @param uf A uf a ser setado
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
    /**
     * @return O codigoLogradouro
     */
    public Integer getCodigoLogradouro() {
        return codigoLogradouro;
    }
    /**
     * @param codigoLogradouro O codigoLogradouro a ser setado
     */
    public void setCodigoLogradouro(Integer codigoLogradouro) {
        this.codigoLogradouro = codigoLogradouro;
    }
    /**
     * @return O codigoTipoLogradouro
     */
    public Short getCodigoTipoLogradouro() {
        return codigoTipoLogradouro;
    }
    /**
     * @param codigoTipoLogradouro O codigoTipoLogradouro a ser setado
     */
    public void setCodigoTipoLogradouro(Short codigoTipoLogradouro) {
        this.codigoTipoLogradouro = codigoTipoLogradouro;
    }
    
    
}
