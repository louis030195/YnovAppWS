package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import metier.NewsMetier;
import metier.entities.News;

@Singleton
@Path("/News")
public class NewsService {
	
	private NewsMetier metier;
	
	public NewsService() {
		metier = new NewsMetier();
		
	}
	
	
	@GET
	@Path("/Newss")
	@Produces(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public List<News> getNewss(){
		return metier.findAll();
	}	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public News saveNews(News n){
		return metier.add(n);
	}
	
	
	@DELETE
	@Path("/removeNews/{NewsId}")
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public boolean removeNews(
			@PathParam(value="NewsId")int NewsId) {
		return metier.delete(NewsId);
	}
	
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
	public News updateNews(News n) {
		return metier.update(n);
	}
	
	
}
