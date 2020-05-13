package com.capg.omts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.Entity.Movies;
import com.capg.omts.Service.IMovieTheaterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class MovieTheatreRestController {

	@Autowired
	IMovieTheaterService service;

	// In post Man we use the url as http://localhost:8084/movie/search/{movieId}
	// and select as Get
	// {movieName} which is based on Database Theater Names
	// This method is used for searching the movie in which values comes from
	// service layer
	@SuppressWarnings("unchecked")
	@GetMapping("movie/searchtheater/{theaterName}")
	public <T> T searchTheater(@PathVariable String theaterName) throws Exception {
		List<Movies> movie = service.searchTheater(theaterName);
		for (Movies mv : movie) {
			if (mv.getTheaterName().equalsIgnoreCase(theaterName.trim())) {
				return (T) movie;
			}
		}
		return (T) "Theater not found";
	}

	// In post Man we use the url as
	// http://localhost:8084/movie/searchmovie/{movieName} and select as Get
	// This method is used for searching the movie in which values comes from
	// service layer
	@SuppressWarnings("unchecked")
	@GetMapping("/movie/searchmovie/{movieName}")
	public <T> T searchMovie(@PathVariable String movieName) throws Exception {
		List<Movies> movie = service.searchMovie(movieName);
		for (Movies mv : movie) {
			if (mv.getMovieName().equalsIgnoreCase(movieName.trim())) {
				return (T) movie;
			}
		}

		return (T) "Movie not found";
	}

	// In post Man we use the url as http://localhost:8084/movies/getall
	// This method will retrieve all the details of the movie in which values come
	// from service layer
	@GetMapping("/getall")
	public List<Movies> getAllMovies() {
		List<Movies> movie = service.getAllMovies();
		return movie;
	}

}
