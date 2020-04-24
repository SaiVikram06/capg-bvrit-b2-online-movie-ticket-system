package com.capg.omts.Service;

import java.util.List;

import com.capg.omts.Entity.Movies;
import com.capg.omts.Entity.Theaters;

public interface IMovieTheatreService {
	
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
