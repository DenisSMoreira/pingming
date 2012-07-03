/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.autenticacao;

import web.comum.dao.IDAO;
import web.comum.dao.exception.DataBaseException;
import web.login.enity.bean.Login;

/**
 *
 * @author Admin
 */
public interface ILoginDAO extends IDAO<Login , Long> {
    
    boolean validaAutenticacao(String usuario, String senha) throws DataBaseException;


    

}
