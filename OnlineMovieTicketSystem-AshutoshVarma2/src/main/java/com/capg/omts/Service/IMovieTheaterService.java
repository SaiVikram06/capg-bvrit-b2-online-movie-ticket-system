package com.capg.omts.Service;

import java.util.List;

import com.capg.omts.Entity.Movies;

//Here we are just designing the methods which will be implemented in another layer of this package
public interface IMovieTheaterService {
	
	public List<Movies> searchTheater(String theaterName);
	
	public List<Movies> searchMovie(String name);
	
	public List<Movies> getAllMovies();
	
}
