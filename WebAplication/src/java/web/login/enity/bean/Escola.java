package web.login.enity.bean;

import java.sql.Date;


/**
 * Bean Escola
 */
public class Escola implements java.io.Serializable {

    /**
     * SerialVersionUID gerada
     */
    private static final long serialVersionUID = 2549673391074149135L;

    /**
     * O codigo do Escola
     */
    private Long codigo;   
   
    /**
     * O endereco do cliente
     */
    private Endereco endereco;

    /**
     * O nome do cliente
     */
    private String nome;
    /**
     * Numero do telefone principal
     */
    private Long telefonePrincipal;
    /**
     * Numero do telefone opcional
     */
    private Long telefoneOpcional;
    /**
     * Numero do fax
     */
    private Long fax;
    /**
     * Codigo do tipo de Escola
     */
    private Character tipoEscola;
    /**
     * DDD do telefone principal
     */
    private Integer dddPrincipal;
    /**
     * Ramal to telefone principal
     */
    private Integer ramalPrincipal;
    /**
     * Ramal do telefone opcional
     */
    private Integer ramalOpcional;
    /**
     * Ramal do fax
     */
    private Integer ramalFax;
    /**
     * Email do cliente
     */
    private String email;
    /**
     * Data de criacao do cliente
     */
    private Date dataCriacao;
    /**
     * Data de atualizacao do cliente
     */
    private Date dataAtualizacao;
    /**
     * DDD do telefone opcional
     */
    private Integer dddOpcional;
    /**
     * DDD do fax
     */
    private Integer dddFax;
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
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }
    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the telefonePrincipal
     */
    public Long getTelefonePrincipal() {
        return telefonePrincipal;
    }
    /**
     * @param telefonePrincipal the telefonePrincipal to set
     */
    public void setTelefonePrincipal(Long telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }
    /**
     * @return the telefoneOpcional
     */
    public Long getTelefoneOpcional() {
        return telefoneOpcional;
    }
    /**
     * @param telefoneOpcional the telefoneOpcional to set
     */
    public void setTelefoneOpcional(Long telefoneOpcional) {
        this.telefoneOpcional = telefoneOpcional;
    }
    /**
     * @return the fax
     */
    public Long getFax() {
        return fax;
    }
    /**
     * @param fax the fax to set
     */
    public void setFax(Long fax) {
        this.fax = fax;
    }
    /**
     * @return the tipoPessoa
     */
    public Character getTipoEscola() {
        return tipoEscola;
    }
    /**
     * @param tipoPessoa the tipoPessoa to set
     */
    public void setTipoEscola(Character tipoEscola) {
        this.tipoEscola = tipoEscola;
    }
    /**
     * @return the dddPrincipal
     */
    public Integer getDddPrincipal() {
        return dddPrincipal;
    }
    /**
     * @param dddPrincipal the dddPrincipal to set
     */
    public void setDddPrincipal(Integer dddPrincipal) {
        this.dddPrincipal = dddPrincipal;
    }
    /**
     * @return the ramalPrincipal
     */
    public Integer getRamalPrincipal() {
        return ramalPrincipal;
    }
    /**
     * @param ramalPrincipal the ramalPrincipal to set
     */
    public void setRamalPrincipal(Integer ramalPrincipal) {
        this.ramalPrincipal = ramalPrincipal;
    }
    /**
     * @return the ramalOpcional
     */
    public Integer getRamalOpcional() {
        return ramalOpcional;
    }
    /**
     * @param ramalOpcional the ramalOpcional to set
     */
    public void setRamalOpcional(Integer ramalOpcional) {
        this.ramalOpcional = ramalOpcional;
    }
    /**
     * @return the ramalFax
     */
    public Integer getRamalFax() {
        return ramalFax;
    }
    /**
     * @param ramalFax the ramalFax to set
     */
    public void setRamalFax(Integer ramalFax) {
        this.ramalFax = ramalFax;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dataCriacao
     */
    public Date getDataCriacao() {
        return dataCriacao;
    }
    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
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
 
    /**
     * @return the dddOpcional
     */
    public Integer getDddOpcional() {
        return dddOpcional;
    }
    /**
     * @param dddOpcional the dddOpcional to set
     */
    public void setDddOpcional(Integer dddOpcional) {
        this.dddOpcional = dddOpcional;
    }
    /**
     * @return the dddFax
     */
    public Integer getDddFax() {
        return dddFax;
    }
    /**
     * @param dddFax the dddFax to set
     */
    public void setDddFax(Integer dddFax) {
        this.dddFax = dddFax;
    }


    
}
