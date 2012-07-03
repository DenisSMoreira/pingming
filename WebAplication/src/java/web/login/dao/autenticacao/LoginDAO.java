/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.dao.autenticacao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import web.comum.dao.AbstractDAO;
import web.comum.dao.SessionDao;
import web.login.enity.bean.Login;


public class LoginDAO extends AbstractDAO<Object, Object> implements ILoginDAO  {

    @Override
    public boolean verificarAutenticacao(String usuario, String senha) {
        Session session = SessionDao.getSession(super.getEntityManager());
        Criteria critLogin = session.createCriteria(Login.class);
        boolean resultado = false;
        try {

          final Login login = (Login) critLogin.add(Restrictions.eq("cpf", usuario)).uniqueResult();
            if(login.getSenha().equals(senha)){
                resultado = true;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

  
}