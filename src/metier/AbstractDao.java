package metier;



import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import metier.entities.Event;


/**
 * 
 * @author Louis
 * Cette classe a un rôle de DAO, elle permet d'intéragir directement avec la base de donnée.
 * TODO : classe abstraite avec type générique qui implémente les méthodes CRUD pour factorisation du code
 * 
 */
//@Stateless
public abstract class AbstractDao<T extends Serializable> {

	private Class<T> entity;
	
	@PersistenceContext(name="YnovAppREST")
	EntityManager em;

	
	public final void setEntity(Class<T> entityToSet) {
		this.entity = entityToSet;
	}

    public AbstractDao() {
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("YnovAppREST");
		em = emf.createEntityManager();
    }
	
	
	public T add(T t) {
		try {
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(t);
			// em.flush();	// Debug method
			tx.commit();	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return t;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(){
		return em.createQuery("select e from "+entity.getName()+" e").getResultList();	
	}
	

	
	
	public boolean delete(int id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		T t = em.find(entity, id);
		em.remove(t);
		tx.commit();
		return true;
	}
	
	
	public T update(T t) { // TODO : changer type de retour?
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(t);
		tx.commit();
		return t;
	}
	
}
