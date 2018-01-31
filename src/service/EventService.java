package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import metier.EventMetier;
import metier.entities.Event;

@Singleton
@Path("/Event")
public class EventService {
	
	private EventMetier metier;
	
	public EventService() {
		metier = new EventMetier();
		
	}
	
	
	@GET
	@Path("/events")
	@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public List<Event> getEvents(){
		return metier.findAll();
	}	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Event saveEvent(Event e){
		return metier.add(e);
	}
	
	
	@DELETE
	@Path("/removeEvent/{eventId}")
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public boolean removeEvent(
			@PathParam(value="eventId")int eventId) {
		return metier.delete(eventId);
	}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Event updateEvent(Event e) {
		return metier.update(e);
	}
	
	
}
