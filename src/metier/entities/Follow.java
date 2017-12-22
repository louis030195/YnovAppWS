package metier.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Follow implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int usrId;
	int mmId;
	
	
	
	/**
	 * @param usrId
	 * @param mmId
	 */
	public Follow(int usrId, int mmId) {
		super();
		this.usrId = usrId;
		this.mmId = mmId;
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
	
}
