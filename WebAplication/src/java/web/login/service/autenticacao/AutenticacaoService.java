/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.autenticacao;

import web.login.dao.autenticacao.ILoginDAO;

/**
 *
 * @author Admin
 */
public class AutenticacaoService implements IAutenticacaoService {

    private ILoginDAO loginDAO;

    @Override
    public boolean verificarAutenticacao(String usuario, String senha) {
        return loginDAO.verificarAutenticacao(usuario, senha);

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
