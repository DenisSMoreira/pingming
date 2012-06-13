/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.autenticacao.view;

import java.io.Serializable;
 




import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


  
@ManagedBean(name = "autenticacao") 
@ApplicationScoped
public class Autenticacao implements Serializable{
    private static final long serialVersionUID = 1L;
  
    private String usuario;  
      
    private String senha;  
  
 
      
    public String savePerson() {  
       
         return "/WEB-INF/jsp/cadastrarsenha/CadastrarSenha.xhtml";
    }
      public String login() {  
       
         return "autenticacao";
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