package metier.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table
public class ModuleMaster implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int mmId;
	String name;
	
	
	public ModuleMaster() {
		
	}
		
	/**
	 * @param mmId
	 * @param name
	 */
	public ModuleMaster(int mmId, String name) {
		super();
		this.mmId = mmId;
		this.name = name;
	}
	/**
	 * @return the mmId
	 */
	public int getmmId() {
		return mmId;
	}
	/**
	 * @param mmId the mmId to set
	 */
	public void setmmId(int mmId) {
		this.mmId = mmId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
