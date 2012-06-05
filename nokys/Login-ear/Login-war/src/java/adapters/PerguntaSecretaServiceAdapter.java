package adapters;

import java.util.List;

import cbss.bean.canonico.PerguntaSecreta;
import cbss.controleacesso.IControleAcessoSessionFacade;
import cbss.controleacesso.IPerguntaSecretaService;
import cbss.controleacesso.exceptions.ControleAcessoException;
/**
 * 
 * Pergunta Secreta da configura��o da senha
 *
 */
public class PerguntaSecretaServiceAdapter implements IPerguntaSecretaService {
    /**
     * interface de controle de acesso da session facede
     */
    private IControleAcessoSessionFacade controleAcessoSessionFacade;

    /**
     * Obtem lista de Pergunta de Seguran�a da senha
     * 
     * @return List
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public List<PerguntaSecreta> obtemPerguntasSeguranca() throws ControleAcessoException {

        return controleAcessoSessionFacade.obtemPerguntasSeguranca();
    }

    /**
     * Obtem pergunta de seguran�a da senha
     * 
     * @return Pergunta Secreta
     * @param cpfInterlocutor : CPF do interlocutor
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public PerguntaSecreta obtemPerguntaSeguranca(Long cpfInterlocutor) throws ControleAcessoException {
        return controleAcessoSessionFacade.obtemPerguntaSeguranca(cpfInterlocutor);
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
