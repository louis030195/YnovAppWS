package metier;



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
 * Cette classe a un r�le de DAO, elle permet d'int�ragir directement avec la base de donn�e.
 * TODO : classe abstraite avec type g�n�rique qui impl�mente les m�thodes CRUD pour factorisation du code
 * 
 */
@Stateless
public abstract class Base<T> {
	
	@PersistenceContext(name="YnovAppREST")
	EntityManager em;
	
	
	final Class<T> typeParameterClass;

    public Base(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
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
	
	public List<T> findAll(){
		TypedQuery<T> query =	em.createNamedQuery("T.findAll", this.typeParameterClass);
		return query.getResultList();
	}
	

	
	
	public boolean delete(int id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		T t = em.find(this.typeParameterClass, id);
		if(null != t) {
			em.remove(t);
			tx.commit();
			return true;
		}
		else{
			tx.commit();
			return false;
			// TODO : sinon retourner exception, pr�voir de cr�er des exceptions ...
		}
		
	}
	
	
	public T update(T t) { // TODO : changer type de retour?
		// TODO : Pr�voir une v�rification si l'id existe ou pas
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(t);
		tx.commit();
		return t;
	}
	
}
