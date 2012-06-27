/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.dao;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.facotry.DaoFactory;
import org.hibernate.Session;

/**
 * Classe de persistencia no banco
 * @author Paula
 */
public class ConfiguracaoDAOImpl implements IConfiguracaoDAO {

    /**
     * Objeto private utilizado apenas como referencia da Session
     */
    private Session session;

    /**
     * Metodo para recuperar configurações no banco
     * @see Configuracao
     * @param id da configuração
     * @return Bean da Configuração
     */
    @Override
    public Configuracao buscarConfiguracoes(Integer id) {
        session = DaoFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Configuracao configuracao = null;
        try {
            configuracao = (Configuracao) session.get(Configuracao.class, id);
        } catch (Exception e) {
            System.err.println(e.getMessage() + e);

        } finally {
            session.close();
        }
        return configuracao;
    }

    /**
     * Metodo para alterar configurações salva no banco
     * @see Configuracao
     * @param configuracao Bean Configuração
     * @return True (Sucesso na persistencia do objeto ) ou False  (Erro na persistencia do objeto )
     */
    @Override
    public Boolean alterarConfiguracoes(Configuracao configuracao) {
        session = DaoFactory.getSessionFactory().openSession();
        session.beginTransaction();

        try {
            session.merge(configuracao);
            session.flush();
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage() + e);
            return false;
        } finally {
            session.close();
        }
    }
}
