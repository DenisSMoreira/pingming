/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.autenticacao;

import web.comum.dao.IDAO;
import web.login.enity.bean.Login;

/**
 *
 * @author Admin
 */
public interface ILoginDAO extends IDAO<Long, Login> {
    
    boolean verificarAutenticacao(String usuario, String senha);
}
