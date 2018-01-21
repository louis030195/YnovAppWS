package metier;

import metier.entities.Event;

/**
 * 
 * @author Louis
 * 
 */
public class EventMetier extends AbstractDao<Event> {

	
	public EventMetier(){
		super();
		this.setEntity(Event.class);
	}

}
