package metier;

import metier.entities.News;

public class NewsMetier extends AbstractDao<News> {

	
	public NewsMetier(){
		super();
		this.setEntity(News.class);
	}

}
