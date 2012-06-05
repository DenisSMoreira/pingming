package adapters;

import cbss.bean.canonico.ConfigLogin;
import cbss.controleacesso.IControleAcessoSessionFacade;
import cbss.controleacesso.IRegraSenhaService;
import cbss.controleacesso.exceptions.ControleAcessoException;
/**
 * 
 * Pergunta Secreta da configura��o da senha
 *
 */
public class RegraSenhaServiceAdapter implements IRegraSenhaService {
    /**
     * interface de controle de acesso da session facede
     */
    private IControleAcessoSessionFacade controleAcessoSessionFacade;

    
    /**
     * Obtem regra da senha por codigo
     * 
     * @return ConfigLogin 
     * @param codigo : Codigo da regra da senha
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
	public ConfigLogin obtemRegraSenha(Long codigo)
			throws ControleAcessoException {
		return controleAcessoSessionFacade.obtemRegraSenha(codigo);
	}

    
    /**
     * 
     * @return controleAcessoSessionFacade controle Acesso Session Facade
     */
    
    public IControleAcessoSessionFacade getControleAcessoSessionFacade() {
        return controleAcessoSessionFacade;
    }

    /**
     * 
     * @param controleAcessoSessionFacade control Acesso Session Facade
     */
    public void setControleAcessoSessionFacade(IControleAcessoSessionFacade controleAcessoSessionFacade) {
        this.controleAcessoSessionFacade = controleAcessoSessionFacade;
    }


}
