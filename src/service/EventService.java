package service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.ejb.EJB;
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
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Event saveEvent(Event e){
		return metier.addEvent(e);
	}
	
	
	
	/***
	 * M�thode temporaire pour tester les insertions en GET � supprimer plus tard
	 */
	/*
	@GET
	@Path("/addEvent/{animator}/{date}/{time}/{place}")
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Event addEvent(
			@PathParam(value="animator")String animator,
			@PathParam(value="date")Date date,
			@PathParam(value="time")Time time,
			@PathParam(value="place")String place){
	
		return metier.addEvent(new Event(animator,date,time,place));
	}
	*/
	
	@DELETE
	@Path("/removeEvent/{eventId}")
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public boolean removeEvent(
			@PathParam(value="eventId")int eventId) {
		return metier.deleteEvent(eventId);
	}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Event updateEvent(Event e) {
		return metier.updateEvent(e);
	}
	
	
}
