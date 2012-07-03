/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view.homefake;


import java.io.Serializable;  
  


import javax.faces.bean.ManagedBean;
import web.login.util.Forwards;
  
/**
 *
 * @author dmoreira
 */
@ManagedBean(name="home")
public class HomeFake implements Serializable {

    
    private static final long serialVersionUID = 1L;

    /**
     * @return the forwardCadastrar
     */
    public String forwardCadastrar() {
        return Forwards.CADASTRAR_SENHA;
    }
    
       /**
     * @return the forwardCadastrar
     */
    public String forwardRecuperar() {
        return Forwards.RECUPERAR_SENHA;
    }
    
       /**
     * @return the forwardCadastrar
     */
    public String forwardDesbloquear() {
        return Forwards.DESBLOQUEAR_SENHA;
    }
    
    
       /**
     * @return the forwardCadastrar
     */
    public String forwardAlterar() {
        return Forwards.ALTERAR_SENHA;
    }

    
    
}  