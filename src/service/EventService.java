package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import metier.EventMetierImpl;
import metier.entities.Event;

@Singleton
@Path("/event")
public class EventService {
	private EventMetierImpl metier;
	
	public EventService() {
		metier = new EventMetierImpl();
		metier.initEvents();
		
	}
	
	
	@GET
	@Path("/events")
	@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public List<Event> getEvents(){
		return metier.listEvents();
	}
	
	
	@POST
	@Path("/events")
	@Consumes(MediaType.APPLICATION_JSON)
	public Event saveEvent(Event e){
		return metier.addEvent(e);
	}
	
}
