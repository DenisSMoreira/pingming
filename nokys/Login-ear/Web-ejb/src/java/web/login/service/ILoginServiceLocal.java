package web.login.service;

import javax.ejb.Local;



/**
 * 
 * Classe Interface Login Service Local
 *
 */
@Local
public interface ILoginServiceLocal {

    /**
     * Obtem o login por CPF do interlocutor
     * 
     * @return Login 
     * @param cpfInterlocutor : CPF do interlocutor
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
//    obtemLoginPorCpf(Long cpfInterlocutor) throws ControleAcessoException;


}
