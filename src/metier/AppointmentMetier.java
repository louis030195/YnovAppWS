package metier;

import metier.entities.Appointment;

public class AppointmentMetier extends AbstractDao<Appointment> {

	
	public AppointmentMetier(){
		super();
		this.setEntity(Appointment.class);
	}

}
