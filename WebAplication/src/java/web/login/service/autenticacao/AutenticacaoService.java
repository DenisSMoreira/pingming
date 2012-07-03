/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.autenticacao;

import java.util.logging.Level;
import java.util.logging.Logger;
import web.comum.dao.exception.DataBaseException;
import web.login.comum.exceptions.LoginAcessoException;
import web.login.dao.autenticacao.ILoginDAO;
import web.login.enity.bean.Login;

/**
 *
 * @author Admin
 */
public class AutenticacaoService implements IAutenticacaoService {

    private ILoginDAO loginDAO;

    @Override
    public boolean validaAutenticacao(String usuario, String senha) throws LoginAcessoException {
        try {
            return loginDAO.validaAutenticacao(usuario, senha);
        } catch (DataBaseException ex) {
            Logger.getLogger(AutenticacaoService.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            throw new LoginAcessoException(ex.getMessage());
        }

    }

    @Override
    public Login buscaLogin(Long cpf) throws LoginAcessoException {
        try {
            return loginDAO.buscar(cpf);
        } catch (Exception ex) {
            Logger.getLogger(AutenticacaoService.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            throw new LoginAcessoException(ex.getMessage());
        }
    }

    /**
     * @return the loginDAO
     */
    public ILoginDAO getLoginDAO() {
        return loginDAO;
    }

    /**
     * @param loginDAO the loginDAO to set
     */
    public void setLoginDAO(ILoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }
}
