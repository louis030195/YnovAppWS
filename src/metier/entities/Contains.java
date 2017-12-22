package metier.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contains implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int picId;
	int soId;
	int newsId;
	int eventId;
	
	
	
	
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
