package metier;

import metier.entities.StudentOffice;

public class StudentOfficeMetier extends AbstractDao<StudentOffice> {

	
	public StudentOfficeMetier(){
		super();
		this.setEntity(StudentOffice.class);
	}

}
