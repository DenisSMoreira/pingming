package adapters;

import cbss.bean.canonico.Login;
import cbss.controleacesso.IControleAcessoSessionFacade;
import cbss.controleacesso.ILoginService;
import cbss.controleacesso.exceptions.ControleAcessoException;

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
    public Login obtemLoginPorCpf(Long cpfInterlocutor) throws ControleAcessoException {
        return controleAcessoSessionFacade.obtemLoginPorCpf(cpfInterlocutor);
    }
    /**
     * Verifica��o de Senha Expirada
     * 
     * @param login : Login
     * @param diasExp : Dias expirados do login
     * @return Boolean : C�digo de erro senha expirada
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Boolean verificarSenhaExpirada(Login login, Integer diasExp) throws ControleAcessoException {
        return controleAcessoSessionFacade.verificarSenhaExpirada(login, diasExp);
    }
    
    /**
     * Incrementa tentativas de acesso do Login
     * 
     * @return int : N�mero de tenttivas atuais
     * @param cpfInterlocutor : CPF do interlocutor
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Integer incrementaTentativas(Long cpfInterlocutor) throws ControleAcessoException {
        return controleAcessoSessionFacade.incrementaTentativas(cpfInterlocutor);

    }

    /**
     * Altera Status do Login
     * 
     * @return Long : Status atual do Login
     * @param cpfInterlocutor : CPF do interlocutor
     * @param status : Status para persistir
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Short alteraStatusLogin(Long cpfInterlocutor, Short status) throws ControleAcessoException {
        return controleAcessoSessionFacade.alteraStatusLogin(cpfInterlocutor, status);

    }

    /**
     * Persiste data de �ltimo acesso e zera quantidade de tentativas
     * 
     * @return int : Sucesso
     * @param cpfInterlocutor : CPF do interlocutor
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Integer persisteDataLogin(Long cpfInterlocutor) throws ControleAcessoException {
        return controleAcessoSessionFacade.persisteDataLogin(cpfInterlocutor);

    }
    
    /**
     * Persiste data de �ltimo acesso e zera quantidade de tentativas
     * 
     * @param cpfInterlocutor : CPF do interlocutor
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public void persisteDataLogin(Long cpfInterlocutor, String senha, Integer perguntaSeguranca, String respostaSeguranca)
        throws ControleAcessoException {
        controleAcessoSessionFacade.persisteDataLogin(cpfInterlocutor);

    }

    /**
     * Verifica se as �ltimas senhas do usu�rio s�o iguais a senha informada
     * 
     * @return boolean
     * @param cpfInterlocutor : CPF do interlocutor
     * @param senha : Senha
     * @param qtdSelec : Quantidade das �ltimas senhas a serem verificadas
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Boolean validaUltimasSenhasUsuario(Long cpfInterlocutor, Integer qtdSelec, String senha)
        throws ControleAcessoException {
        return controleAcessoSessionFacade.validaUltimasSenhasUsuario(cpfInterlocutor, qtdSelec, senha);

    }

    /**
     * Verifica se �ltima altera��o de senha � menor que as horas especificada.
     * 
     * @return boolean
     * @param cpfInterlocutor : CPF do interlocutor
     * @param hrsUltAlteracao : horas da �ltima alteracao da senha
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public Boolean validaUltimaAlteracao(Long cpfInterlocutor, Integer hrsUltAlteracao) throws ControleAcessoException {
        return controleAcessoSessionFacade.validaUltimaAlteracao(cpfInterlocutor, hrsUltAlteracao);

    }

    /**
     * Altera senha do Login por CPF do interlocutor
     * 
     * @param cpfInterlocutor : CPF do interlocutor
     * @param senha : Senha
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public void alteraSenhaLoginPorCpf(Long cpfInterlocutor, String senha) throws ControleAcessoException {
        controleAcessoSessionFacade.alteraSenhaLoginPorCpf(cpfInterlocutor, senha);

    }


    /**
     * Altera dados do Login por CPF do interlocutor Altera: senha, pergunta e resposta de seguran�a
     * 
     * @param cpfInterlocutor : CPF do interlocutor
     * @param senha : Senha
     * @param perguntaSeguranca : Pergunta de Seguranca
     * @param respostaSeguranca : Resposta de Seguranca
     * @throws ControleAcessoException : Excess�o do Controle Acesso
     */
    public void alteraDadosSenhaLoginPorCpf(Long cpfInterlocutor, String senha, Integer perguntaSeguranca,
            String respostaSeguranca) throws ControleAcessoException {
        controleAcessoSessionFacade.alteraDadosSenhaLoginPorCpf(cpfInterlocutor, senha, perguntaSeguranca,
                respostaSeguranca);

    }

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
