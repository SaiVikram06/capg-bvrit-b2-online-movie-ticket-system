package com.capg.omts.dao;

import java.util.List;

import com.capg.omts.entity.MovieBean;
//Here we are just designing the methods in interface 

public interface IMovieDao {

	public MovieBean addMovie(MovieBean bean);

	public String removeMovie(int movieId);

	public List<MovieBean> listOfMovies();

}
