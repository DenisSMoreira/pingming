package adapters;

import java.sql.Date;

import cbss.bean.canonico.Interlocutor;
import cbss.controleacesso.IControleAcessoSessionFacade;
import cbss.controleacesso.IInterlocutorService;
import cbss.controleacesso.exceptions.ControleAcessoException;

/**
 * 
 * Classe Interlocutor Service Adapter
 * 
 */
public class InterlocutorServiceAdapter implements IInterlocutorService {

    /**
     * Interface de controle de Acesso do SessionFacade
     * @return controleAcessoSessionFacade 
     */
    private IControleAcessoSessionFacade controleAcessoSessionFacade;

    /**
     * Obtem interlocutor pelo CNPJ do contrato
     * 
     * @return Interlocutor 
     * @param cpfInterlocutor : CPF do interlocutor
     * @param cnpjContrato : CNPJ do contrato 
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Interlocutor obtemInterlocutorPorCnpjContrato(Long cpfInterlocutor, Long cnpjContrato)
        throws ControleAcessoException {
        return controleAcessoSessionFacade.obtemInterlocutorPorCnpjContrato(cpfInterlocutor, cnpjContrato);
    }
    
    /**
     * Obtem interlocutor pelo CPF do contrato
     * 
     * @return Interlocutor 
     * @param cpfInterlocutor : CPF do interlocutor
     * @param cpfContrato : CPF do contrato
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Interlocutor obtemInterlocutorPorCpfContrato(Long cpfInterlocutor, Long cpfContrato)
        throws ControleAcessoException {
        return controleAcessoSessionFacade.obtemInterlocutorPorCpfContrato(cpfInterlocutor, cpfContrato);
    }

    /**
     * Obtem interlocutor pelo Codigo do interlocutor
     * 
     * @return Interlocutor
     * @param codInterlocutor : Codigo do interlocutor
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Interlocutor obtemInterlocutorPorCodInterlocutor(Long codInterlocutor) throws ControleAcessoException {
        return controleAcessoSessionFacade.obtemInterlocutorPorCodInterlocutor(codInterlocutor);
    }
    /**
     * Obtem Interlocutores por CPF do interlocutor 
     * 
     * @return Interlocutor
     * @param cpfInterlocutor : CPF do interlocutor
     * @param dataNascimento : Data de nascimento
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Interlocutor obtemInterlocutorPorCpfInterlocutor(Long cpfInterlocutor, Date dataNascimento)
        throws ControleAcessoException {
        return controleAcessoSessionFacade.obtemInterlocutorPorCpfInterlocutor(cpfInterlocutor, dataNascimento);
    }

    /**
    
     *           
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
