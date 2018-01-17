package metier;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import metier.entities.Event;



/**
 * 
 * @author Louis
 * Interface permettant de factoriser les m�thodes CRUD d'interaction avec la base de donn�e.
 * 
 */
@Remote
@Stateless
public interface IEventMetier {
	
	
	public Event addEvent(Event e);
	public List<Event> listEvents();
	public void deleteEvent(int eventId);
	public void initEvents();
	
}
