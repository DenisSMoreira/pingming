/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.desbloquear;

import web.login.dao.desbloquear.IDesbloquearDAO;

/**
 *
 * @author dmoreira
 */
public class DesbloquearService implements IDesbloquearService{
    
    private IDesbloquearDAO desbloquearDAO;

    /**
     * @return the desbloquearDAO
     */
    public IDesbloquearDAO getDesbloquearDAO() {
        return desbloquearDAO;
    }

    /**
     * @param desbloquearDAO the desbloquearDAO to set
     */
    public void setDesbloquearDAO(IDesbloquearDAO desbloquearDAO) {
        this.desbloquearDAO = desbloquearDAO;
    }
}
