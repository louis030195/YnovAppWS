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
public class Picture implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int picId;
	String image;
	
	
	public Picture() {
		
	}
	
	/**
	 * @param picId
	 * @param image
	 */
	public Picture(int picId, String image) {
		super();
		this.picId = picId;
		this.image = image;
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
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
}
