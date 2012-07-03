/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.service.cadastrarsenha;

import web.login.dao.cadastrarsenha.ICadastrarDAO;

/**
 *
 * @author dmoreira
 */
public class CadastrarService implements ICadastrarService{

   private ICadastrarDAO cadastrarDAO;

    /**
     * @return the cadastrarDAO
     */
    public ICadastrarDAO getCadastrarDAO() {
        return cadastrarDAO;
    }

    /**
     * @param cadastrarDAO the cadastrarDAO to set
     */
    public void setCadastrarDAO(ICadastrarDAO cadastrarDAO) {
        this.cadastrarDAO = cadastrarDAO;
    }

   
}
