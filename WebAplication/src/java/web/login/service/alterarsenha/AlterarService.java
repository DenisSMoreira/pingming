/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.alterarsenha;

import web.login.dao.alterarsenha.IAlterarDAO;

/**
 *
 * @author dmoreira
 */
public class AlterarService implements IAlterarService{
    
    private IAlterarDAO alterarDAO;

    /**
     * @return the alterarDAO
     */
    public IAlterarDAO getAlterarDAO() {
        return alterarDAO;
    }

    /**
     * @param alterarDAO the alterarDAO to set
     */
    public void setAlterarDAO(IAlterarDAO alterarDAO) {
        this.alterarDAO = alterarDAO;
    }
}
