package metier;



import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Event;


/**
 * 
 * @author Louis
 * Cette classe a un r�le de DAO, elle permet d'int�ragir directement avec la base de donn�e.
 * TODO : classe abstraite avec type g�n�rique qui impl�mente les m�thodes CRUD pour factorisation du code
 * 
 */
@Stateless
public class EventMetierImpl implements IEventMetier {
	
	@PersistenceContext(name="YnovAppREST")
	EntityManager em;
	
	
	@Override
	public Event addEvent(Event e) {
		try {
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(e);
			// em.flush();	// Debug method
			tx.commit();	
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return e;
	}
	
	@Override
	public List<Event> listEvents(){
		Query req = em.createQuery("select e from Event e");
		return req.getResultList();
	}
	
	
	@Override
	public void initEvents() {
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("YnovAppREST");
		em = emf.createEntityManager();
	}

	
	@Override
	public boolean deleteEvent(int eventId) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Event e = em.find(Event.class, eventId);
		if(null != e) {
			em.remove(e);
			tx.commit();
			return true;
		}
		else{
			tx.commit();
			return false;
			// TODO : sinon retourner exception, pr�voir de cr�er des exceptions ...
		}
		
	}
	
	@Override
	public Event updateEvent(Event e) { // TODO : changer type de retour?
		// TODO : Pr�voir une v�rification si l'id existe ou pas
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(e);
		tx.commit();
		return e;
	}
	
}
