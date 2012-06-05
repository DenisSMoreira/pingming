
package web.bean.canonico;

/**
 * Bean - Informa��es do Vendedor
 */
public class Vendedor {
    /**
     * Codigo vendedor
     */
    private Long codigo;
    /**
     * Numero do banco do vendedor
     */
    private Long numeroBanco;
    /**
     * Numero da agencia do banco
     */
    private Integer numeroAgencia;
    /**
     * Nome completo do vendedor
     */
    private String nome;
    /**
     * Telefone do vendedor
     */
    private Long telefone;
    /**
     * Ramal do vendedor
     */
    private Integer ramal;
    /**
     * DDD 
     */
    private Integer ddd;
    /**
     * Codigo do pais
     */
    private Integer codPais;
    
    /**
     * Retorna codigo do vendedor
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }
    /**
     * Seta codigo do vendedor
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    /**
     * Retorna o numero do banco
     * @return the numeroBanco
     */
    public Long getNumeroBanco() {
        return numeroBanco;
    }
    /**
     * Seta o numero do banco
     * @param numeroBanco the numeroBanco to set
     */
    public void setNumeroBanco(Long numeroBanco) {
        this.numeroBanco = numeroBanco;
    }
    /**
     * Retorna o numero da agencia do banco
     * @return the numeroAgencia
     */
    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }
    /**
     * Seta o numero da agencia do banco
     * @param numeroAgencia the numeroAgencia to set
     */
    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    /**
     * Retorna o nome do vendedor
     * @return the nomeVendedor
     */
    public String getNome() {
        return nome;
    }
    /**
     * Seta o nome do vendedor
     * @param nomeVendedor the nomeVendedor to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Retorna o telefone do vendedor
     * @return the telefone
     */
    public Long getTelefone() {
        return telefone;
    }
    /**
     * Seta telefone do vendedor
     * @param telefone the telefone to set
     */
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
    /**
     * Retorna Ramal do vendedor
     * @return the ramal
     */
    public Integer getRamal() {
        return ramal;
    }
    /**
     * Seta Ramal do vendedor
     * @param ramal the ramal to set
     */
    public void setRamal(Integer ramal) {
        this.ramal = ramal;
    }
    /**
     * Retorna DDD
     * @return the ddd
     */
    public Integer getDdd() {
        return ddd;
    }
    /**
     * Seta DDD
     * @param ddd the ddd to set
     */
    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }
    /**
     * Retorna codigo do pais
     * @return the codPais
     */
    public Integer getCodPais() {
        return codPais;
    }
    /**
     * Seta codigo do pais
     * @param codPais the codPais to set
     */
    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }
    
}
