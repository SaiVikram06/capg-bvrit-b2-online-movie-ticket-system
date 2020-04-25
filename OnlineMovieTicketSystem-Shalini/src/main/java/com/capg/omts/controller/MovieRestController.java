package com.capg.omts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.entity.MovieBean;
import com.capg.omts.service.MovieServiceImpl;

//this@CrossOrigin will help us to connect with angular with the url mentioned below
@CrossOrigin(origins = "http://localhost:4200")
//@RestController = @Controller + @ResponseBody
@RestController
public class MovieRestController {

	@Autowired
	MovieServiceImpl movieServiceImpl;

	/*
	 * Author : Shalini 
	 * This addMovie(MovieBean bean) method will return the object of Movie 
	 * once a new Movie is added successfully in to system
	  */

	@PostMapping("/movie/add") // postman: POST
	public String addMovie(@RequestBody MovieBean bean) {
		MovieBean movie = movieServiceImpl.addMovie(bean);
		return movie.getMovieName() + " has been added" + " with movie id " + movie.getMovieId();
	}

	/*
	 * This deleteMovie(int movieId) method returns a message that your movie is
	 * deleted by id. it gathers the information from service layer
	 */
	@DeleteMapping("/movie/delete/{movieId}") // postman: DELETE
	public String deleteMovie(@PathVariable int movieId) {
		MovieBean moviebean = movieServiceImpl.removeMovie(movieId);

		return "Your Movie with id: " + moviebean.getMovieId() + " has been deleted";
	}

	/*
	 * This getAll() method displays all the list of movies which are available in
	 * the database and the values come from service layer
	 */

	@GetMapping("/movie/findall") // postman: GET
	public List<MovieBean> getAll() {

		List<MovieBean> bean = movieServiceImpl.listOfMovies();
		return bean;
	}

}
