/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.autenticacao;

import web.comum.dao.IDAO;

/**
 *
 * @author Admin
 */
public interface ILoginDAO extends IDAO<Object, Object> {
    
    boolean verificarAutenticacao(String usuario, String senha);
}
