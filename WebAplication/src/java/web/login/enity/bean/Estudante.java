package web.login.enity.bean;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 * 
 * Classe BEAN Interlocutor
 *
 */
@Entity
public class Estudante implements java.io.Serializable {
    /**
	 * 
	 */
    private static final long serialVersionUID = 2187968660368510976L;

    /**
     * Atributo codInterlocutor Codigo do Interlocutor
     */
    @Id
    private Long codigo;
  
    /**
     * 
     * Atributo = Empresa Empresa
     * 
     */
    @OneToOne
    private Escola escola;


    /**
     * 
     * Atributo = nomeInterlocutor nome Interlocutor
     * 
     */
    private String nomeInterlocutor;
    
    /**
     * 
     * Atributo = login Login
     * 
     */
    
    private Login login;
    
    /**
     * 
     * Atributo = data de Nascimento
     * 
     */
    
    private Date dataNascimento;
    
    /**
     * 
     * Atributo = Codigo Cargo
     * 
     */
    private Cargo cargo;
    
    /**
     * 
     * Atributo = departamento departamento
     * 
     */
    
    
    private Long cpf; 
    
    
    private String departamento;

    /**
     * 
     * Atributo = sexo sexo
     * 
     */
    private Character sexo;
    
    /**
     * 
     * Atributo = email E-mail
     * 
     */
    
    private String email;
    
    /**
     * 
     * Atributo = codigoPais codigo Pais
     * 
     */
    
    private Integer codigoPais;
    
    /**
     * 
     * Atributo = ddd DDD
     * 
     */
    
    private Integer ddd;
    
    /**
     * 
     * Atributo = telPrincipal telefone Principal
     * 
     */
    
    private Integer telefonePrincipal;
    
    /**
     * 
     * Atributo = ramalPrincipal ramal Principal
     * 
     */
    
    private Integer ramalPrincipal;
    
    /**
     * 
     * Atributo = telOpcional telefone Opcional
     * 
     */
    
    private Integer telefoneOpcional;
    
    /**
     * 
     * Atributo = ramalOpcional ramal Opcional
     * 
     */
    
    private Integer ramalOpcional;
    
    /**
     * 
     * Atributo = fax fax
     * 
     */
    
    private Integer fax;
    
    /**
     * 
     * Atributo = interlocutorFvs interlocutor Fvs
     * 
     */
    
    private Integer interlocutorFvs;
    
    /**
     * 
     * Atributo = ramalFax ramal Fax
     * 
     */
    
    private Integer ramalFax;
    /**
     * 
     * Atributo = enderecoFilial endereco da Filial
     * 
     */
    
    private Character enderecoFilial;

    
    /**
     * 
     * Atributo = sincronizacao sincronizacao
     * 
     */
    private Date dataCriacao;
    
    /**
     * 
     * Atributo = Data de Autalizacao
     * 
     */
    private Date dataAtualizacao;
    
    /**
     * 
     * Atributo = Numero do DDD Opcional
     * 
     */
    private Integer numeroDddOpcional;
    
    /**
     * 
     * Atributo = Numero do DDD fax
     * 
     */
    private Integer numeroDddFax;
    
    /**
     * 
     * Atributo = Endere�o
     * 
     */
    private Long endereco;

    /**
     * @return the nomeInterlocutor
     */
    public String getNomeInterlocutor() {
        return nomeInterlocutor;
    }

    /**
     * @param nomeInterlocutor
     *            the nomeInterlocutor to set
     */
    public void setNomeInterlocutor(String nomeInterlocutor) {
        this.nomeInterlocutor = nomeInterlocutor;
    }

    /**
     * @return the login
     */
    public Login getLogin() {
        return login;
    }

    /**
     * @param login
     *            the login to set
     */
    public void setLogin(Login login) {
        this.login = login;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento
     *            the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * @param cargo
     *            the cargo to set
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento
     *            the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the sexo
     */
    public Character getSexo() {
        return sexo;
    }

    /**
     * @param sexo
     *            the sexo to set
     */
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the codigoPais
     */
    public Integer getCodigoPais() {
        return codigoPais;
    }

    /**
     * @param codigoPais
     *            the codigoPais to set
     */
    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

    /**
     * @return the ddd
     */
    public Integer getDdd() {
        return ddd;
    }

    /**
     * @param ddd
     *            the ddd to set
     */
    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }



    /**
     * @return the ramalPrincipal
     */
    public Integer getRamalPrincipal() {
        return ramalPrincipal;
    }

    /**
     * @param ramalPrincipal
     *            the ramalPrincipal to set
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
     * @param ramalOpcional
     *            the ramalOpcional to set
     */
    public void setRamalOpcional(Integer ramalOpcional) {
        this.ramalOpcional = ramalOpcional;
    }

    /**
     * @return the fax
     */
    public Integer getFax() {
        return fax;
    }

    /**
     * @param fax
     *            the fax to set
     */
    public void setFax(Integer fax) {
        this.fax = fax;
    }

    /**
     * @return the interlocutorFvs
     */
    public Integer getInterlocutorFvs() {
        return interlocutorFvs;
    }

    /**
     * @param interlocutorFvs
     *            the interlocutorFvs to set
     */
    public void setInterlocutorFvs(Integer interlocutorFvs) {
        this.interlocutorFvs = interlocutorFvs;
    }

    /**
     * @return the ramalFax
     */
    public Integer getRamalFax() {
        return ramalFax;
    }

    /**
     * @param ramalFax
     *            the ramalFax to set
     */
    public void setRamalFax(Integer ramalFax) {
        this.ramalFax = ramalFax;
    }

    /**
     * @return the enderecoFilial
     */
    public Character getEnderecoFilial() {
        return enderecoFilial;
    }

    /**
     * @param enderecoFilial
     *            the enderecoFilial to set
     */
    public void setEnderecoFilial(Character enderecoFilial) {
        this.enderecoFilial = enderecoFilial;
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
	 * @return the numeroDddOpcional
	 */
	public Integer getNumeroDddOpcional() {
		return numeroDddOpcional;
	}

	/**
	 * @param numeroDddOpcional the numeroDddOpcional to set
	 */
	public void setNumeroDddOpcional(Integer numeroDddOpcional) {
		this.numeroDddOpcional = numeroDddOpcional;
	}

	/**
	 * @return the numeroDddFax
	 */
	public Integer getNumeroDddFax() {
		return numeroDddFax;
	}

	/**
	 * @param numeroDddFax the numeroDddFax to set
	 */
	public void setNumeroDddFax(Integer numeroDddFax) {
		this.numeroDddFax = numeroDddFax;
	}


	/**
	 * @return the endereco
	 */
	public Long getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Long endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the codigoInterlocutor
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigoInterlocutor the codigoInterlocutor to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the telefonePrincipal
	 */
	public Integer getTelefonePrincipal() {
		return telefonePrincipal;
	}

	/**
	 * @param telefonePrincipal the telefonePrincipal to set
	 */
	public void setTelefonePrincipal(Integer telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}

	/**
	 * @return the telefoneOpcional
	 */
	public Integer getTelefoneOpcional() {
		return telefoneOpcional;
	}
    
    /**
     * @return the cliente
     */
    public Escola getEscola() {
        return escola;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setEscola(Escola escola) {
        this.escola = escola;
    }
	/**
	 * @param telefoneOpcional the telefoneOpcional to set
	 */
	public void setTelefoneOpcional(Integer telefoneOpcional) {
		this.telefoneOpcional = telefoneOpcional;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the cpf
	 */
	public Long getCpf() {
		return cpf;
	}



    

}
