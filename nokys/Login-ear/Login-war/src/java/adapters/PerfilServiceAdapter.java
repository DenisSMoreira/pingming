package adapters;

import java.util.List;

import cbss.bean.canonico.Perfil;
import cbss.controleacesso.IControleAcessoSessionFacade;
import cbss.controleacesso.IPerfilService;
import cbss.controleacesso.exceptions.ControleAcessoException;
/**
 * 
 * classe perfil service adapter 
 *
 */
public class PerfilServiceAdapter implements IPerfilService {
    /**
     * 
     */
    private IControleAcessoSessionFacade controleAcessoSessionFacade;

    /**
     * Incluir perfis de uma lista de perfil
     * 
     * @return List : Inclui lista de perfis
     * @param perfis : Lista de perfis 
     * @param descricaoPerfil : Descri��o do perfil
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public List<Perfil> incluirPerfil(List<Perfil> perfis, String descricaoPerfil) throws ControleAcessoException {
        return controleAcessoSessionFacade.incluirPerfil(perfis, descricaoPerfil);

    }
    /**
     * Remover perfis de uma lista de perfil
     * 
     * @return List : Lista com perfil removido
     * @param perfis : Lista de perfis
     * @param descricaoPerfil : Descri��o do Perfil
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public List<Perfil> removerPerfil(List<Perfil> perfis, String descricaoPerfil) throws ControleAcessoException {
        return controleAcessoSessionFacade.removerPerfil(perfis, descricaoPerfil);

    }
    /**
     * Obtem perfis do interlocutor separados por virgula
     * 
     * @return String
     * @param perfis : Lista de perfis
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public String obtemPerfisInterlocutor(List<Perfil> perfis) throws ControleAcessoException {
        return controleAcessoSessionFacade.obtemPerfisInterlocutor(perfis);

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
 * @param controleAcessoSessionFacade controle Acesso Session Facade
 */
    public void setControleAcessoSessionFacade(IControleAcessoSessionFacade controleAcessoSessionFacade) {
        this.controleAcessoSessionFacade = controleAcessoSessionFacade;
    }

}
