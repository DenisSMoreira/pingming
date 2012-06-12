package web.login.comum.exceptions;


import web.comum.excpetion.BaseException;



/**
 * Classe  Controle Acesso gerenciador Exception
 */
public class LoginAcessoException extends BaseException {
    /**
     * Atributo = N�mero serial de vers�o.
     */
    private static final long serialVersionUID = -9147730428111206876L ;

    /**
     * Construtor da exce��o.
     * 
     * @param message Mensagem de erro.
     * @param code C�digo de erro.
     * @throws LoginAcessoException Controle Acesso gerenciador Exception
     */
    public LoginAcessoException(String message, String code) throws LoginAcessoException {
        super(message);
        setCodigo(code);
    }

    /**
     * Construtor da exce��o.
     * 
     * @param message Mensagem de erro.
     * @param cause Exce��o original
     * @param code C�digo de erro.
     * @throws LoginAcessoException Controle Acesso gerenciador Exception
     */
    public LoginAcessoException(String message, Throwable cause, String code) throws LoginAcessoException {
        super(message);
        setCause(cause);
        setCodigo(code);
    }

    /**
     * Construtor da exce��o.
     * 
     * @param message Mensagem de erro.
     * @param cause Exce��o original
     * @throws LoginAcessoException Controle Acesso gerenciador Exception
     */
    public LoginAcessoException(String message, Throwable cause) throws LoginAcessoException{
        super(message, cause);
    }

    /**
     * Construtor da exce��o.
     * 
     * @param message Mensagem de erro.
     * @throws LoginAcessoException Controle Acesso gerenciador Exception
     */
    public LoginAcessoException(String message) throws LoginAcessoException{
        super(message);
    }

    /**
     * Construtor da exce��o.
     * 
     * @param cause Exce��o original
     * @param code C�digo de erro.
     * @throws LoginAcessoException Controle Acesso Exception
     */
    public LoginAcessoException(Throwable cause, String code) throws LoginAcessoException{
        setCause(cause);
        setCodigo(code);
    }

    /**
     * Construtor da exce��o.
     * 
     * @param cause Exce��o original.
     * @throws LoginAcessoException Controle Acesso Exception
     */
    public LoginAcessoException(Throwable cause) throws LoginAcessoException{
        super(cause);
    }

}
