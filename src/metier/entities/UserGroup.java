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
public class UserGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int ugId;
	@NotNull
	String name;
	
	public UserGroup() {
		
	}
	
	/**
	 * @param ugId
	 * @param name
	 */
	public UserGroup(int ugId, String name) {
		super();
		this.ugId = ugId;
		this.name = name;
	}
	
	
	/**
	 * @return the ugId
	 */
	public int getugId() {
		return ugId;
	}
	/**
	 * @param ugId the ugId to set
	 */
	public void setugId(int ugId) {
		this.ugId = ugId;
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
