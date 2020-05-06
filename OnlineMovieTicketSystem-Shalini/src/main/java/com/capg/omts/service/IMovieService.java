package com.capg.omts.service;

import java.util.List;

import com.capg.omts.entity.MovieBean;

//Here we are just designing the methods in interface 

public interface IMovieService {
	public MovieBean addMovie(MovieBean bean);

	public String removeMovie(int movieId);

	public List<MovieBean> listOfMovies();

}
