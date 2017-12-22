package metier.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BePart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int usrId;
	int ugId;
	int soId;
	int eventId;
	int newsId;
	/**
	 * @param usrId
	 * @param ugId
	 * @param soId
	 * @param eventId
	 * @param newsId
	 */
	public BePart(int usrId, int ugId, int soId, int eventId, int newsId) {
		super();
		this.usrId = usrId;
		this.ugId = ugId;
		this.soId = soId;
		this.eventId = eventId;
		this.newsId = newsId;
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
	
}
