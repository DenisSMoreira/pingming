package web.comum.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import web.comum.dao.exception.DataBaseException;



/**
 * Implementação genérica abstrata de persistência de Entidades de Negócio
 * utilizando o padrão JPA. Cada Entidade de Negócio que precisa ser persistida
 * deve possuir uma implementação AbstractDAO que extende esta classe e implementar uma
 * interface AbstractDAO referente a Entidade.
 * 
 * @author Scopus Tecnologia Ltda.
 * 
 * @param <T>
 *            O Tipo da Entidade de Negócio a ser persistida.
 * @param <K>
 *            O Tipo da Chave primária da Entidade de Negócio a ser persistida.
 */
 public abstract class AbstractDAO<T, K> implements IDAO<T, K> {
        
        @PersistenceContext()
	private EntityManager em;

	/**
	 * Obtém a instância do Entity Manager injetado.
	 * 
	 * @return A instância do Entity Manager.
	 */
	protected final EntityManager getEntityManager() {
		return em;
	}

	/**
	 * Persiste uma Entidade de Negócio em banco de dados através da
	 * implementação JPA. Este método participa de uma transação global (está
	 * anotado com
	 * <code>@TransactionAttribute(TransactionAttributeType.REQUIRED)</code>) ,
	 * portanto nescessita de uma transação ativa.
	 * 
	 * @param objeto
	 *            A Entide de Negócio a ser inserida.
	 * 
	 * @return A Entidade de Negócio persistida.
	 * 
	 * @throws DataBaseException
	 *             Em caso de erros na persistência.
	 */
        @Override
	public T inserir(T objeto) throws DataBaseException {

		try {
			em.persist(objeto);
		} catch (Exception e) {
			throw new DataBaseException(e);
		}

		return objeto;
	}

	/**
	 * Atualiza uma Entidade de Negócio em banco de dados através da
	 * implementação JPA. Este método participa de uma transação global (está
	 * anotado com
	 * <code>@TransactionAttribute(TransactionAttributeType.REQUIRED)</code>) ,
	 * portanto nescessita de uma transação ativa.
	 * 
	 * @param objeto
	 *            A Entidade de Negócio a ser atualizada.
	 * 
	 * @return A Entidade de Negócio atualizada.
	 * 
	 * @throws DataBaseException
	 *             Em caso de erros na persistência.
	 */
        @Override
	public T atualizar(T objeto) throws DataBaseException {
		T bean = null;

		try {
			bean = em.merge(objeto);
		} catch (Exception e) {
			throw new DataBaseException(e);
		}

		return bean;
	}

	/**
	 * Remove uma Entidade de Negócio do banco de dados através da implementação
	 * JPA. Este método participa de uma transação global (está anotado com
	 * <code>@TransactionAttribute(TransactionAttributeType.REQUIRED)</code>) ,
	 * portanto nescessita de uma transação ativa.
	 * 
	 * @param pk
	 *            A chave primária da Entidade de Negócio a ser removida.
	 * 
	 * @throws DataBaseException
	 *             Em caso de erros na persistência.
	 */
        @Override
	public void remover(K pk) throws DataBaseException {
		try {
			T objeto = obter(pk);
			em.remove(objeto);
		} catch (Exception e) {
			throw new DataBaseException(e);
		}
	}

	/**
	 * Recupera uma Entidade de Negócio do banco de dados através da
	 * implementação JPA. Este método não precisa participar de uma transação
	 * global (está anotado com
	 * <code>TransactionAttributeType.NOT_SUPPORTED</code>), portanto não
	 * nescessita de uma transação ativa.
	 * 
	 * @param pk
	 *            A chave primária da Entidade de Negócio a ser recuperada.
	 * 
	 * @return A Entidade de Negócio recuperada.
	 * 
	 * @throws DataBaseException
	 *             Em caso de erros na persistência.
	 */
        @Override
	public T obter(K pk) {
		T bean = null;

		try {
			bean = em.find(getEntityTypeClass(), pk);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bean;
	}

	/**
	 * Otém o tipo da Classe da Entidade de Negócio.
	 * 
	 * @return O tipo da Classe da Entidade de Negócio.
	 */
	@SuppressWarnings("unchecked")
        @Override
	public Class<T> getEntityTypeClass() {
		Type type = getClass().getGenericSuperclass();
		ParameterizedType paramType = (ParameterizedType) type;
		return (Class<T>) paramType.getActualTypeArguments()[0];
	}

	/**
	 * Otém o tipo da Classe da Chave primária da Entidade de Negócio.
	 * 
	 * @return O tipo da Classe da Chave primária da Entidade de Negócio.
	 */
	@SuppressWarnings("unchecked")
        @Override
	public Class<K> getPrimaryKeyTypeClass() {
		Type type = getClass().getGenericSuperclass();
		ParameterizedType paramType = (ParameterizedType) type;
		return (Class<K>) paramType.getActualTypeArguments()[1];
	}

}