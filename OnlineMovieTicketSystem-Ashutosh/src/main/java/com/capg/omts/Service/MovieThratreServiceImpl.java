package com.capg.omts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.Dao.IMovieTheatreDao;
import com.capg.omts.Entity.Movies;
import com.capg.omts.Entity.Theaters;

@Service
public class MovieThratreServiceImpl implements IMovieTheatreService {
	@Autowired
	IMovieTheatreDao dao;
	
	/*
	 * @Override public Movies addMovie(Movies movie) { return dao.addMovie(movie);
	 * 
	 * }
	 * 
	 * @Override public Movies deleteMovie(int movieId) {
	 * 
	 * return dao.deleteMovie(movieId); }
	 */

	@Override
	public Movies searchMovie(int movieId) {
		
		return dao.searchMovie(movieId);
	}

	/*
	 * @Override public Theaters addTheatre(Theaters theatre) {
	 * 
	 * return dao.addTheatre(theatre); }
	 * 
	 * @Override public Theaters deleteTheatre(int TheatreId) {
	 * 
	 * return dao.deleteTheatre(TheatreId); }
	 */
	@Override
	public Theaters searchTheatre(int TheatreId) {
	
		return dao.searchTheatre(TheatreId);
	}

	@Override
	public List<Movies> getAllMovies() {
		
		return dao.getAllMovies();
	}

	@Override
	public List<Theaters> getAllTheaters() {
		
		return dao.getAllTheaters();
	}

}
