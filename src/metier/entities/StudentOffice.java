package metier.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentOffice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int soId;
	String name;
	String description;
	String leader;
	String homeSite;
	String facebook;
	String instagram;
	String snapchat;
	String twitter;
	
	
	
	
	/**
	 * @param soId
	 * @param name
	 * @param description
	 * @param leader
	 * @param homeSite
	 * @param facebook
	 * @param instagram
	 * @param snapchat
	 * @param twitter
	 */
	public StudentOffice(int soId, String name, String description, String leader, String homeSite, String facebook,
			String instagram, String snapchat, String twitter) {
		super();
		this.soId = soId;
		this.name = name;
		this.description = description;
		this.leader = leader;
		this.homeSite = homeSite;
		this.facebook = facebook;
		this.instagram = instagram;
		this.snapchat = snapchat;
		this.twitter = twitter;
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
	 * @return the leader
	 */
	public String getLeader() {
		return leader;
	}
	/**
	 * @param leader the leader to set
	 */
	public void setLeader(String leader) {
		this.leader = leader;
	}
	/**
	 * @return the homeSite
	 */
	public String getHomeSite() {
		return homeSite;
	}
	/**
	 * @param homeSite the homeSite to set
	 */
	public void setHomeSite(String homeSite) {
		this.homeSite = homeSite;
	}
	/**
	 * @return the facebook
	 */
	public String getFacebook() {
		return facebook;
	}
	/**
	 * @param facebook the facebook to set
	 */
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	/**
	 * @return the instagram
	 */
	public String getInstagram() {
		return instagram;
	}
	/**
	 * @param instagram the instagram to set
	 */
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	/**
	 * @return the snapchat
	 */
	public String getSnapchat() {
		return snapchat;
	}
	/**
	 * @param snapchat the snapchat to set
	 */
	public void setSnapchat(String snapchat) {
		this.snapchat = snapchat;
	}
	/**
	 * @return the twitter
	 */
	public String getTwitter() {
		return twitter;
	}
	/**
	 * @param twitter the twitter to set
	 */
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	
}
