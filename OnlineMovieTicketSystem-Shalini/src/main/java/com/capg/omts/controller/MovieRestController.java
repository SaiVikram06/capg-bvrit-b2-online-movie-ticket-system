package com.capg.omts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.entity.MovieBean;
import com.capg.omts.service.MovieServiceImpl;

//this@CrossOrigin will help us to connect with angular with the url mentioned below
@CrossOrigin(origins = "http://localhost:4200")
//@RestController = @Controller + @ResponseBody
@RequestMapping(value = "movie")
@RestController
public class MovieRestController {

	@Autowired
	MovieServiceImpl movieServiceImpl;

	/*
	 * Author : Shalini This addMovie(MovieBean bean) method will return the object
	 * of Movie once a new Movie is added successfully in to system
	 */

	@PostMapping(path = "/add") // postman: POST
	public ResponseEntity<Boolean> addMovie(@Valid @RequestBody MovieBean bean) {
		MovieBean movie = movieServiceImpl.addMovie(bean);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
		
	}

	/*
	 * This deleteMovie(int movieId) method returns whether the given id movie is deleted or not.
	 *  it gathers the information from service layer
	 */
	@DeleteMapping("/delete/{movieId}") // postman: DELETE
	public ResponseEntity<String> deleteMovie(@PathVariable int movieId) {
		try {
			movieServiceImpl.removeMovie(movieId);

			ResponseEntity<String> responseEntity = new ResponseEntity(true, HttpStatus.OK);
			System.out.println("response entity=" + responseEntity);
			return responseEntity;
		} catch (Exception e) {
			
			return new ResponseEntity<String>("Invalid Movie Id", HttpStatus.BAD_REQUEST);
		}

	}

	/*
	 * This getAll() method displays all the list of movies which are available in
	 * the database and the values come from service layer
	 */

	@GetMapping("/findall") // postman: GET
	public ResponseEntity<List<MovieBean>> getAllMovies() {

		List<MovieBean> bean = movieServiceImpl.listOfMovies();
		return new ResponseEntity<List<MovieBean>>(bean, new HttpHeaders(), HttpStatus.OK);

	}

}

