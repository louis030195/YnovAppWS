package metier.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Picture implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int picId;
	String image;
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
