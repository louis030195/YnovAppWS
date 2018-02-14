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
public class Receiver implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	int usrId;

	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	int appId;
	
	
	public Receiver() {
		
	}
	
	/**
	 * @param usrId
	 * @param appId
	 */
	public Receiver(int usrId, int appId) {
		super();
		this.usrId = usrId;
		this.appId = appId;
	}
	/**
	 * @return the usrId
	 */
	public int getusrId() {
		return usrId;
	}
	/**
	 * @param usrId the usrId to set
	 */
	public void setusrId(int usrId) {
		this.usrId = usrId;
	}
	/**
	 * @return the appId
	 */
	public int getappId() {
		return appId;
	}
	/**
	 * @param appId the appId to set
	 */
	public void setappId(int appId) {
		this.appId = appId;
	}
	
}
