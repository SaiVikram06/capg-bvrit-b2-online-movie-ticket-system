package com.capg.omts.Dao;

import java.util.List;

import com.capg.omts.Entity.Movies;
import com.capg.omts.Entity.Theaters;

//Here we are just designing the methods which will be implemented in another layer of this packageS
public interface IMovieTheatreDao {
	/*
	 * public Movies addMovie(Movies movie);
	 * 
	 * public Movies deleteMovie(int movieId);
	 */
	
	public Movies searchMovie(int movieId);
	
	public List<Movies> getAllMovies();
	
	/*
	 * public Theaters addTheatre(Theaters theatre);
	 * 
	 * public Theaters deleteTheatre(int TheatreId);
	 */
	public Theaters searchTheatre(int TheatreId);

	public List<Theaters> getAllTheaters();
}
