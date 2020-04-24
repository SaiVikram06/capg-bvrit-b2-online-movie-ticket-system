package com.capg.omts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.Entity.Movies;
import com.capg.omts.Entity.Theaters;
import com.capg.omts.Service.IMovieTheatreService;

//These @CrossOrigin will help us to connect with the angular with help of the above url
@CrossOrigin(origins = "http://localhost:4200")

//Instead of using @Controller and @ResponseBody we use the @RestController which means it is 
//a combination of @Controller and @ResponseBody
@RestController
public class MovieTheatreRestController {
	
	@Autowired
	IMovieTheatreService service;
	
	/*
	 * @GetMapping("/run") public String run() {
	 * System.out.println("run is working"); return "Run is working"; }
	 */
	
	
	// In post Man we use the url as http://localhost:8084/movie/addMovie and select as POST
	//if we type this then we can add the movie and its details.
	//Movie Details are mentioned in com.capg.omts.entity.movies class
	/*
	 * @PostMapping("/movie/addMovie") public String addMovie(@RequestBody Movies
	 * movie) { service.addMovie(movie); return
	 * "Your Movie details have been added"; }
	 */
	
	// In post Man we use the url as http://localhost:8084/deleteMovie/{movieId} and select as Delete
	// {movieId} = 1,2,3 etc which is based on Database id's
	//This method is used to delete the movie details
	/*
	 * @DeleteMapping("/movie/deleteMovie/{movieId}") public String
	 * deleteMovie(@PathVariable int movieId) { service.deleteMovie(movieId); return
	 * "The Movie id "+movieId+" details have been deleted"; }
	 */
	
	// In post Man we use the url as http://localhost:8084/movie/search/{movieId} and select as Get
	// {movieId} = 1,2,3 etc which is based on Database id's
	//This method is used for searching the movie in which values comes from service layer
	@GetMapping("/movie/search/{movieId}")
		public String searchMovie(@PathVariable int movieId) throws Exception {
			 Movies movies=service.searchMovie(movieId);
			 if(movies==null)
				 throw new Exception("Invalid id");
			 return "Your requested for the movie "+movies.getMovieName();
		}
	
	
	
	// In post Man we use the url as http://localhost:8084/theatre/addTheatre and select as post
	// This method is used to add the Theatre details
	//Theatre details are mentioned in com.capg.omts.Entity.Theaters
	
		/*
		 * @PostMapping("/theatre/addTheatre") public String addTheatre(@RequestBody
		 * Theaters theatre) { service.addTheatre(theatre); return
		 * "Your Theatre details have been successfully added"; }
		 */
	
	// In post Man we use the url as http://localhost:8084/theatre/deleteTheatre and select as delete
	//This method is used to delete the theatre details
		/*
		 * @DeleteMapping("/theatre/deleteTheatre") public String
		 * deleteTheatre(@RequestBody int TheatreId) { service.deleteTheatre(TheatreId);
		 * return "Your Theatre id "+TheatreId+" details have been deleted"; }
		 */
	// In post Man we use the url as http://localhost:8084/theatre/search//theatre/search/{TheatreId} and select as Get
	//{TheatreId} can be the id like 1,2,3 etc mentioned in database
	//This method is used to search the theatre in which values comes from service layer
	@GetMapping("/theatre/search/{TheatreId}")
	public String searchTheatre(@PathVariable int TheatreId) throws Exception {
		Theaters theaters=service.searchTheatre(TheatreId);
			if(theaters==null)
				throw new Exception("Invalid id");
		return "your requested for"+theaters.getTheaterName();
		
	}
	
	
	// In post Man we use the url as http://localhost:8084/movies/getall
	//This method will retrieve all the details of the movie in which values come from service layer
	@GetMapping("/movies/getall")
	public List<Movies> getAllMovies(){
		List<Movies> movie= service.getAllMovies();
		return movie;
	}
	
	// In post Man we use the url as http://localhost:8084/Theaters/getall
	// //This method will retrieve all the details of the Theatres in which values come from the service layer
	@GetMapping("/Theaters/getall")
	public List<Theaters> getAllTheaters(){
		List<Theaters> theater= service.getAllTheaters();
		return theater;
	}

}
