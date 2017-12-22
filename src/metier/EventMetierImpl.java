package metier;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Event;



@Stateless
public class EventMetierImpl implements IEventMetier {
	
	//private Map<Integer, Event> events = new HashMap<Integer, Event>();
	
	@PersistenceContext(name="YnovAppREST")
	EntityManager em;
	
	
	@Override
	public Event addEvent(Event e) {
		//events.put(e.geteventId(), e);
		em.persist(e);
		return e;
	}
	
	@Override
	public List<Event> listEvents(){
		
		Query req = em.createQuery("select e from Event e");
		System.out.println(req);
		return req.getResultList();
		//return new ArrayList<Event>(events.values());
	}
	
	
	@Override
	public void initEvents() {
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("YnovAppREST");
		em = emf.createEntityManager();
		
		
		//Event e = new Event(1,"Gala","Gala 2018", "Yven",new Date(199997),Time.valueOf("18:00:00"),"Grand théatre Aix","http://www.eventBrite.com");
		//events.put(e.geteventId(),e);
	}

}
