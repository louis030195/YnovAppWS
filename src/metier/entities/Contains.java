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
public class Contains implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	int picId;
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	int soId;
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	int newsId;
	
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
	int eventId;
	
	public Contains() {
		
	}
	
	
	/**
	 * @param picId
	 * @param soId
	 * @param newsId
	 * @param eventId
	 */
	public Contains(int picId, int soId, int newsId, int eventId) {
		super();
		this.picId = picId;
		this.soId = soId;
		this.newsId = newsId;
		this.eventId = eventId;
	}
	/**
	 * @return the picId
	 */
	public int getpicId() {
		return picId;
	}
	/**
	 * @param picId the picId to set
	 */
	public void setpicId(int picId) {
		this.picId = picId;
	}
	/**
	 * @return the soId
	 */
	public int getsoId() {
		return soId;
	}
	/**
	 * @param soId the soId to set
	 */
	public void setsoId(int soId) {
		this.soId = soId;
	}
	/**
	 * @return the newsId
	 */
	public int getnewsId() {
		return newsId;
	}
	/**
	 * @param newsId the newsId to set
	 */
	public void setnewsId(int newsId) {
		this.newsId = newsId;
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
	
}
