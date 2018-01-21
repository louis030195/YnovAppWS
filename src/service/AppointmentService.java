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

import metier.AppointmentMetier;
import metier.entities.Appointment;

@Singleton
@Path("/Appointment")
public class AppointmentService {
	
	private AppointmentMetier metier;
	
	public AppointmentService() {
		metier = new AppointmentMetier();
		
	}
	
	
	@GET
	@Path("/Appointments")
	@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public List<Appointment> getAppointments(){
		return metier.findAll();
	}	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Appointment saveAppointment(Appointment a){
		return metier.add(a);
	}
	
	
	@DELETE
	@Path("/removeAppointment/{AppointmentId}")
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public boolean removeAppointment(
			@PathParam(value="AppointmentId")int AppointmentId) {
		return metier.delete(AppointmentId);
	}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public Appointment updateAppointment(Appointment a) {
		return metier.update(a);
	}
	
	
}
