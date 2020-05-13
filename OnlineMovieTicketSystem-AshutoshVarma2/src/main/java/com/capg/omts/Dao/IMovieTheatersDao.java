package com.capg.omts.Dao;

/*@Author: Ashutosh*/
import java.util.List;

import com.capg.omts.Entity.Movies;

//Here we are just designing the methods which will be implemented in another layer of this package
public interface IMovieTheatersDao {
	
	public List<Movies> searchTheater(String theaterName);
	
	public List<Movies> searchMovie(String Moviename);
	
	public List<Movies> getAllMovies();

}
