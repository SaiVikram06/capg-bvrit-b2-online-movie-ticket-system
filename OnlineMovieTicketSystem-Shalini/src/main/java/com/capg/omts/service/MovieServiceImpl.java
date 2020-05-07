package com.capg.omts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.dao.IMovieDao;
import com.capg.omts.entity.MovieBean;

@Service
public class MovieServiceImpl implements IMovieService {

	@Autowired
	IMovieDao dao;

	/*
	 * Here we are getting the values from dao layer(IMovieDao) and sending the
	 * values to the MovieRestcontroller by using this service layer and movie is added
	 */
	@Override
	public MovieBean addMovie(MovieBean bean) {

		return dao.addMovie(bean);
	}

	/*
	 * Here we are getting the values from dao layer(ImovieDao) and sending the
	 * values to MovieRestcontroller by using this service layer and movie is deleted by id
	 */
	@Override
	public void removeMovie(int movieId) {

		 dao.removeMovie(movieId);
	}

	/*
	 * Here we are getting the values from dao layer(ImovieDao) and sending the
	 * values to MovieRestcontroller by using this service layer and the list of movies is viewed
	 */
	@Override
	public List<MovieBean> listOfMovies() {

		return dao.listOfMovies();
	}

	
}
