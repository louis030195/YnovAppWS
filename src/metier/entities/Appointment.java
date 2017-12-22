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
public class Appointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	int appId;
	@NotNull
	Time hBegin;
	Time hEnd;
	@NotNull
	Date date;
	@NotNull
	String place;
	@NotNull
	String object;
	@NotNull
	String message;
	
	
	/**
	 * @param appId
	 * @param hBegin
	 * @param hEnd
	 * @param date
	 * @param place
	 * @param object
	 * @param message
	 */
	public Appointment(int appId, Time hBegin, Time hEnd, Date date, String place, String object, String message) {
		super();
		this.appId = appId;
		this.hBegin = hBegin;
		this.hEnd = hEnd;
		this.date = date;
		this.place = place;
		this.object = object;
		this.message = message;
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
	/**
	 * @return the hBegin
	 */
	public Time gethBegin() {
		return hBegin;
	}
	/**
	 * @param hBegin the hBegin to set
	 */
	public void sethBegin(Time hBegin) {
		this.hBegin = hBegin;
	}
	/**
	 * @return the hEnd
	 */
	public Time gethEnd() {
		return hEnd;
	}
	/**
	 * @param hEnd the hEnd to set
	 */
	public void sethEnd(Time hEnd) {
		this.hEnd = hEnd;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * @return the object
	 */
	public String getObject() {
		return object;
	}
	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
