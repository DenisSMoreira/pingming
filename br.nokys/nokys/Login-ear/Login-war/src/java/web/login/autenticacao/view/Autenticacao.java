/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.autenticacao.view;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;  
import javax.faces.context.FacesContext;  
import javax.faces.event.ActionEvent;  

  
@ManagedBean 
public class Autenticacao implements Serializable{
    private static final long serialVersionUID = 1L;
  
    private String usuario;  
      
    private String senha;  
  
    public void login(ActionEvent action) {  
       if(usuario.equals("admin") && senha.equals("admin")){
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + usuario +"!")); 
           
       }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro: ", "Usuario ou senha inválida"));  
     }
        
    }
    
    public String recuperar(){
        
        return "recuperar";
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