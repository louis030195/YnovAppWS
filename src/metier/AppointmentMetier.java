package metier;

import javax.ejb.Stateless;

import metier.entities.Appointment;

@Stateless
public class AppointmentMetier extends AbstractDao<Appointment> {

	
	public AppointmentMetier(){
		super();
		this.setEntity(Appointment.class);
	}

}
