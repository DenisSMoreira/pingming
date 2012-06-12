package web.login.dao.impl;


import javax.ejb.Stateless;
import web.comum.dao.DAOJPAImpl;
import web.login.dao.ILoginDAO;



/**
 * 
 * 
 * Classe Login DAO Implementa��o
 * 
 */
@Stateless
public class LoginDAOImpl extends DAOJPAImpl<Object, Long> implements ILoginDAO {


    /**
     * Atualiza o Status do Interlocutor para Ativo.
     *
     * @return Long
     * @param cpfInterlocutor : CPF do interlocutor
     * @param status : Status do interlocutor ativo
     * @throws DataBaseException : Excess�o do Controle Acesso
     */
//    @TransactionAttribute(TransactionAttributeType.REQUIRED)
//    public Short alteraStatusLogin(Long cpfInterlocutor, Short status) throws DataBaseException {
//        Session session = SessionDao.getSession(super.getEntityManager());
//        Criteria critLogin = session.createCriteria(Login.class);
//        Criteria critStatus = session.createCriteria(StatusLogin.class);
//        Login login = null;
//        StatusLogin statusLogin = null;
//
//        try {
//
//            login = (Login) critLogin.add(Restrictions.eq(NUMERO_CPF, cpfInterlocutor)).uniqueResult();
//            statusLogin = (StatusLogin) critStatus.add(Restrictions.eq(CODIGO, status)).uniqueResult();
//            login.setStatusLogin(statusLogin);
//            login = atualizar(login);
//            
//        } catch (Exception e) {
//            LogManager.getLogger(this.getClass()).error(e.getMessage());
//            throw new DataBaseException(e.getMessage());
//        } finally{
//        	statusLogin = null;
//        }
//     
//        return login.getStatusLogin().getCodigo();
//
//    }

    

}
