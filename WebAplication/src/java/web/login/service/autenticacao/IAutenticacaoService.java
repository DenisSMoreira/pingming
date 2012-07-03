/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.autenticacao;

import web.login.comum.exceptions.LoginAcessoException;
import web.login.enity.bean.Login;


/**
 *
 * @author Admin
 */
public interface IAutenticacaoService {
 
    
   boolean validaAutenticacao(String usuario, String senha) throws LoginAcessoException;
    
   Login buscaLogin(Long cpf) throws LoginAcessoException;
   
}
