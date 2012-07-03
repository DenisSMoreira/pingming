package web.login.enity.bean;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 * 
 * Bean Historico Senha
 *
 */
@Entity
public class HistSenha implements java.io.Serializable {

    /**
	 * Atributo = Serial Version
	 */
    private static final long serialVersionUID = -3641627230985673155L;

    /**
     * Atributo = Login
     */
    @OneToOne
    private Login login;

    /**
     * Atributo = Codigo do Historico da Senha 
     */
    @Id
    private Long codHistSenha;
    
    /**
     * Atributo = Senha 
     */
    private String senha;
    
    /**
     * Atributo = Data Altera��o
     * 
     */
    private Date dataAlteracao;

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
     * @return the codHistSenha
     */
    public Long getCodHistSenha() {
        return codHistSenha;
    }

    /**
     * @param codHistSenha
     *            the codHistSenha to set
     */
    public void setCodHistSenha(Long codHistSenha) {
        this.codHistSenha = codHistSenha;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha
     *            the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the dataAlteracao
     */
    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * @param dataAlteracao
     *            the dataAlteracao to set
     */
    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

}
