package web.login.service.impl;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import web.login.service.ILoginServiceLocal;


/**
 * 
 * Classe Login Service Implementa��o
 * 
 */
@Stateless
public class LoginServiceImpl implements ILoginServiceLocal {

    /**
     * Metodo EJB para chamada de classes = Inject class ILoginDAO
     */
//    @EJB
//    private ILoginDAO loginDAO;

   

    /**
     * Obtem o login por CPF do interlocutor
     * 
     * @return Login 
     * @param cpfInterlocutor : CPF do interlocutor
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
//    public final void obtemLoginPorCpf(Long cpfInterlocutor) throws ControleAcessoException {
//        Login login = null;
//        try {
//            login = loginDAO.obtemLoginPorCpf(cpfInterlocutor);
//
//        } catch (Exception e) {
//            LogManager.getLogger(this.getClass()).error(e.getMessage());
//            throw new ControleAcessoException(e.getMessage());
//        }
//        return login;
//    }




}
