/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.autenticacao.bean.view;


/**
 *
 * @author Admin
 */
public class LoginBean {
    /**
     *  String do nome do usuario.
     */
    private String usuario;
    
    /**
     *  String com a senha do usuario.
     */
    private String senha;
    
//    /**
//     *  Servi�o de login.
//     */
//    private LoginService loginService;

    public LoginBean(){
        
        
    }
    
   /**
     * Efetua o login no sistema.
     * @return String de forward para a praxima tela.
     */
    public String efetuaLogin() {
        
        
        
        
        
        
        
        
        return null;
    }
    
    
    
    /**
     * String do nome do usuario.
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * String do nome do usuario.
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * String com a senha do usuario.
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * String com a senha do usuario.
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

   

}
