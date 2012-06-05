package web.bean.canonico;

import java.sql.Date;


/**
 * Bean Cliente
 */
public class Cliente implements java.io.Serializable {

    /**
     * SerialVersionUID gerada
     */
    private static final long serialVersionUID = 2549673391074149135L;

    /**
     * O codigo do Cliente
     */
    private Long codigo;
    
    private ClientePJ clientePJ;
    private ClientePF clientePF;
    
    /**
     * Interlocutor do cliente
     */
    private Interlocutor interlocutor;
    
    /**
     * O endereco do cliente
     */
    private Endereco endereco;

    /**
     * O nome do cliente
     */
    private String nome;
    /**
     * N�mero do telefone principal
     */
    private Long telefonePrincipal;
    /**
     * N�mero do telefone opcional
     */
    private Long telefoneOpcional;
    /**
     * N�mero do fax
     */
    private Long fax;
    /**
     * C�digo do tipo de pessoa
     */
    private Character tipoPessoa;
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
     * Sincronizacao
     */
    private Boolean sincronizacao;
    /**
     * Data de criacao do cliente
     */
    private Date dataCriacao;
    /**
     * Data de atualizacao do cliente
     */
    private Date dataAtualizacao;
    /**
     * Data de migracao do cliente
     */
    private Date dataMigracao;
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
    public char getTipoPessoa() {
        return tipoPessoa;
    }
    /**
     * @param tipoPessoa the tipoPessoa to set
     */
    public void setTipoPessoa(char tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
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
     * @return the sincronizacao
     */
    public Boolean getSincronizacao() {
        return sincronizacao;
    }
    /**
     * @param sincronizacao the sincronizacao to set
     */
    public void setSincronizacao(Boolean sincronizacao) {
        this.sincronizacao = sincronizacao;
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
     * @return the dataMigracao
     */
    public Date getDataMigracao() {
        return dataMigracao;
    }
    /**
     * @param dataMigracao the dataMigracao to set
     */
    public void setDataMigracao(Date dataMigracao) {
        this.dataMigracao = dataMigracao;
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
     * @param tipoPessoa the tipoPessoa to set
     */
    public void setTipoPessoa(Character tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
	public void setClientePJ(ClientePJ clientePJ) {
		this.clientePJ = clientePJ;
	}
	public ClientePJ getClientePJ() {
		return clientePJ;
	}
	public void setClientePF(ClientePF clientePF) {
		this.clientePF = clientePF;
	}
	public ClientePF getClientePF() {
		return clientePF;
	}

    
}
