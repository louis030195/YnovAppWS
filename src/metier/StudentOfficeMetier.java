package metier;

import javax.ejb.Stateless;

import metier.entities.StudentOffice;


@Stateless
public class StudentOfficeMetier extends AbstractDao<StudentOffice> {

	
	public StudentOfficeMetier(){
		super();
		this.setEntity(StudentOffice.class);
	}

}
