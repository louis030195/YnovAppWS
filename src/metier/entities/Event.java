package metier.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.NotNull;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
 

@XmlRootElement
@Entity
@Table
public class Event implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	// TODO: adapter à la convention de nommage de la bdd
	//@Column(name="EVENT_id")
	int eventId;
	String title;
	String description;
	@NotNull
	String animator;
	@NotNull
	Date date;
	@NotNull
	Time time;
	@NotNull
	String place;
	String eventBrite;
	
	public Event() {
		
	}
	
	/**
	 * @param animator
	 * @param date
	 * @param time
	 * @param place
	 */
	public Event(String animator, Date date, Time time, String place) {
		this.animator = animator;
		this.date = date;
		this.time = time;
		this.place = place;
	}
	
	
	/**
	 * @param eventId
	 * @param title
	 * @param description
	 * @param animator
	 * @param date
	 * @param time
	 * @param place
	 * @param eventBrite
	 */
	public Event(int eventId, String title, String description, String animator, Date date, Time time, String place,
			String eventBrite) {
		super();
		this.eventId = eventId;
		this.title = title;
		this.description = description;
		this.animator = animator;
		this.date = date;
		this.time = time;
		this.place = place;
		this.eventBrite = eventBrite;
	}
	
	
	/**
	 * @return the eventId
	 */
	public int geteventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void seteventId(int eventId) {
		this.eventId = eventId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the animator
	 */
	public String getAnimator() {
		return animator;
	}
	/**
	 * @param animator the animator to set
	 */
	public void setAnimator(String animator) {
		this.animator = animator;
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
	 * @return the time
	 */
	public Time getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Time time) {
		this.time = time;
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
	 * @return the eventBrite
	 */
	public String getEventBrite() {
		return eventBrite;
	}
	/**
	 * @param eventBrite the eventBrite to set
	 */
	public void setEventBrite(String eventBrite) {
		this.eventBrite = eventBrite;
	}
	
}
