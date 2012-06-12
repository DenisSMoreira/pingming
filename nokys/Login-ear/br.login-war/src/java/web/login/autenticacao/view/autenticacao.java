/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.autenticacao.view;

import java.io.Serializable;
import javax.faces.application.FacesMessage;  



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;  
import javax.faces.event.ActionEvent;  
  
@ManagedBean(name = "autenticacao") 
@RequestScoped
public class Autenticacao implements Serializable{
    private static final long serialVersionUID = 1L;
  
    private String usuario;  
      
    private String senha;  
  
 
      
    public void savePerson(ActionEvent actionEvent) {  
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + usuario + "!"));  

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