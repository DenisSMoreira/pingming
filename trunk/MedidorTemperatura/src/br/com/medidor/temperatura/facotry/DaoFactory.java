package br.com.medidor.temperatura.facotry;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.medidor.temperatura.dao.ConfiguracaoDAOImpl;
import br.com.medidor.temperatura.dao.IConfiguracaoDAO;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Classe Factory que contém o metodo para recuperar a instancia do Session Factory.
 * @author Paula
 */
public class DaoFactory {

    /**
     * Objeto de sessão factory 
     */
    private static final SessionFactory sessionFactory;

    /**
     * Fabrica de Objetos DAO.
     * Utilizado para retirar o acoplamento do código
     */
    public static IConfiguracaoDAO criarConfiguracaoDao() {

        return new ConfiguracaoDAOImpl();

    }

    //Abre a conexão com o banco
    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {

            System.err.println("Erro ao iniciar a fabrica de conexções" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     *  Metodo que retona a conexão aberta com o banco
     * @see SessionFactory  
     * @return SessionFactory (sessão aberta com o banco)
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
