package web.login.ejb.adapters;



import web.login.comum.IControleAcessoSessionFacade;
import web.login.comum.ILoginService;


/**
 * 
 * Classe Login Service Adapter
 * 
 */
public class LoginServiceAdapter implements ILoginService {
    /**
     * @return controleAcessoSessionFacade Controle Acesso de Sess�o Facede
     */
    private IControleAcessoSessionFacade controleAcessoSessionFacade;

    /**
     * Obtem o login por CPF do interlocutor
     * 
     * @return Login 
     * @param cpfInterlocutor : CPF do interlocutor
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
//    public Login obtemLoginPorCpf(Long cpfInterlocutor) throws ControleAcessoException {
//        return controleAcessoSessionFacade.obtemLoginPorCpf(cpfInterlocutor);
//    }
  

    /**
    
     *           
     * 
     * @return controleAcessoSessionFacade controleAcessoSessionFacade
     */
    public IControleAcessoSessionFacade getControleAcessoSessionFacade() {
        return controleAcessoSessionFacade;
    }

    /**
         *            
     *@param controleAcessoSessionFacade Controle Acesso de Sess�o Facede
     */
    public void setControleAcessoSessionFacade(IControleAcessoSessionFacade controleAcessoSessionFacade) {
        this.controleAcessoSessionFacade = controleAcessoSessionFacade;
    }

}
