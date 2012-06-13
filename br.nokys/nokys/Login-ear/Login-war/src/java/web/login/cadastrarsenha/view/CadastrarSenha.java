/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.cadastrarsenha.view;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author dmoreira
 */
@ManagedBean(name = "cadastrar")
@SessionScoped
public class CadastrarSenha implements Serializable{
    
    private String text  ;
    private String nome;
    private String endereco;
    private String telefone;
    private String usuario;
    private String senha;
    
    public CadastrarSenha(){
        
    }
    
    public String login() {  
         return "/Autenticacao.xhtml";
    }
    /**
     * @return the link
     */
    public String getText() {
        return text;
    }

    /**
     * @param link the link to set
     */
    public void setText(String text) {
        this.text = text;
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
