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

import metier.StudentOfficeMetier;
import metier.entities.StudentOffice;

@Singleton
@Path("/StudentOffice")
public class StudentOfficeService {
	
	private StudentOfficeMetier metier;
	
	public StudentOfficeService() {
		metier = new StudentOfficeMetier();
		
	}
	
	
	@GET
	@Path("/StudentOffices")
	@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public List<StudentOffice> getStudentOffices(){
		return metier.findAll();
	}	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public StudentOffice saveStudentOffice(StudentOffice so){
		return metier.add(so);
	}
	
	
	@DELETE
	@Path("/removeStudentOffice/{StudentOfficeId}")
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public boolean removeStudentOffice(
			@PathParam(value="StudentOfficeId")int StudentOfficeId) {
		return metier.delete(StudentOfficeId);
	}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public StudentOffice updateStudentOffice(StudentOffice so) {
		return metier.update(so);
	}
	
	
}
