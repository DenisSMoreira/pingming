/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.recuperarsenha;

import web.login.dao.recuperar.IRecuperarDAO;

/**
 *
 * @author dmoreira
 */
public class RecuperarService implements IRecuperarService {

    private IRecuperarDAO recuperarDAO;

    /**
     * @return the recuperarDAO
     */
    public IRecuperarDAO getRecuperarDAO() {
        return recuperarDAO;
    }

    /**
     * @param recuperarDAO the recuperarDAO to set
     */
    public void setRecuperarDAO(IRecuperarDAO recuperarDAO) {
        this.recuperarDAO = recuperarDAO;
    }
}
