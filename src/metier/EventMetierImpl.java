package metier;



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
 * Cette classe a un rôle de DAO, elle permet d'intéragir directement avec la base de donnée.
 * 
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
	public void deleteEvent(int eventId) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(em.find(Event.class, eventId));
		tx.commit();
		em.flush();
	}
	
}
