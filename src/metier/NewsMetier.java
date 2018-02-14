package metier;

import javax.ejb.Stateless;

import metier.entities.News;


@Stateless
public class NewsMetier extends AbstractDao<News> {

	
	public NewsMetier(){
		super();
		this.setEntity(News.class);
	}

}
