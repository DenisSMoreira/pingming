package adapters;

import cbss.bean.canonico.Cliente;
import cbss.bean.canonico.Login;
import cbss.controleacesso.IAceiteTermoService;
import cbss.controleacesso.IControleAcessoSessionFacade;
import cbss.controleacesso.exceptions.ControleAcessoException;

public class AceiteTermoServiceAdapter implements IAceiteTermoService {

    /**
     * @return controleAcessoSessionFacade Controle Acesso de Sess�o Facede
     */
    private IControleAcessoSessionFacade controleAcessoSessionFacade;

	@Override
	public void insereDtAceite(Login login, Integer codTermo, Cliente cliente) throws ControleAcessoException {
		 controleAcessoSessionFacade.insereDtAceite(login, codTermo, cliente);
		
	}
    
   /**           
    * 
    * @return controleAcessoSessionFacade Controle Acesso Exception Facade
    */
   public IControleAcessoSessionFacade getControleAcessoSessionFacade() {
       return controleAcessoSessionFacade;
   }

   /**
  
    * 
    * @param controleAcessoSessionFacade Controle Acesso Exception Facade
    */
   public void setControleAcessoSessionFacade(IControleAcessoSessionFacade controleAcessoSessionFacade) {
       this.controleAcessoSessionFacade = controleAcessoSessionFacade;
   }
    
}
