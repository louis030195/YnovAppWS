package metier.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int ugId;
	String name;
	
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
