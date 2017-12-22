package service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
	@Path("/events")
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Event saveEvent(Event e){
		System.out.println(e);
		return metier.addEvent(e);
	}
	
	
	@GET
	@Path("/addEvent/{animator}/{date}/{time}/{place}")
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Event addEvent(
			@PathParam(value="animator")String animator,
			@PathParam(value="date")Date date,
			@PathParam(value="time")Time time,
			@PathParam(value="place")String place){
		//System.out.println("ok");
		/*
		long t = 19999999;
		Date tmpDate = new Date(t);
		Time tmpTime = new Time(t);
		*/
		return metier.addEvent(new Event(animator,date,time,place));
	}
	
}
