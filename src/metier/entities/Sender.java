package metier.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table
public class Sender implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int appId;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int usrId;
	
	
	
	
	
	/**
	 * @param appId
	 * @param usrId
	 */
	public Sender(int appId, int usrId) {
		super();
		this.appId = appId;
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
	
}
