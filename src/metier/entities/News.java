package metier.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class News implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int newsId;
	String category;
	String title;
	String description;
	String author;
	Date creationDate;
	
	/**
	 * @param newsId
	 * @param category
	 * @param title
	 * @param description
	 * @param author
	 * @param creationDate
	 */
	public News(int newsId, String category, String title, String description, String author, Date creationDate) {
		super();
		this.newsId = newsId;
		this.category = category;
		this.title = title;
		this.description = description;
		this.author = author;
		this.creationDate = creationDate;
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
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
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
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	
}