package metier;

import javax.ejb.Stateless;

import metier.entities.Event;

/**
 * 
 * @author Louis
 * 
 */
@Stateless
public class EventMetier extends AbstractDao<Event> {

	
	public EventMetier(){
		super();
		this.setEntity(Event.class);
	}

}
