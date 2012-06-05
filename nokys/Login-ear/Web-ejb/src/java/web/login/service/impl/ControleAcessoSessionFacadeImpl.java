package web.login.service.impl;

import java.sql.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import web.login.service.IControleAcessoSessionFacade;
import web.login.service.ILoginServiceLocal;


/**
 * 
 * Classe Controle de Acesso da Session Facade Implementa��o
 */
@Stateless(mappedName="ControleAcessoEJB")
public class ControleAcessoSessionFacadeImpl implements IControleAcessoSessionFacade {

    /**
     * Metodo EJB para chamada de classes = Inject class IInterlocutorServiceLocal
     */
    @EJB
    private ILoginServiceLocal loginServiceLocal;
    
   

}