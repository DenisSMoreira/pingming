/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.autenticacao;

import web.login.comum.exceptions.LoginAcessoException;


/**
 *
 * @author Admin
 */
public interface IAutenticacaoService {
 
    
   boolean verificarAutenticacao(String usuario, String senha) throws LoginAcessoException;

   
}
