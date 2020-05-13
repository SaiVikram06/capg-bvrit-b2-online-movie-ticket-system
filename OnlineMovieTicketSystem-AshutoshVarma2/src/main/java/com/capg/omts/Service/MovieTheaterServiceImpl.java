package com.capg.omts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.Dao.IMovieTheatersDao;
import com.capg.omts.Entity.Movies;


@Service
public class MovieTheaterServiceImpl implements IMovieTheaterService {
	@Autowired
	IMovieTheatersDao dao;
	
//In this method controller request will come to service to this searchMovie method
	//From SearchMovie method it goes to dao.searchMovie
	//dao is the object referrence of the Dao class and searchMovie is the method
	@Override
	public List<Movies> searchMovie(String movieName) {
		List<Movies> movies = dao.searchMovie(movieName);
		System.out.println("getting values from db"+movies);
		return movies;
	}

	//In this method controller request will come to service to this searchMovie method
		//From SearchMovie method it goes to dao.searchMovie
		//dao is the object referrence of the Dao class and getAllMovies is the method
	@Override
	public List<Movies> getAllMovies() {
		
		return dao.getAllMovies();
	}

	@Override
	public List<Movies> searchTheater(String theaterName){
		return dao.searchTheater(theaterName);
	}
}
