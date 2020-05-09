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

import com.capg.omts.entity.TheatreBean;
import com.capg.omts.service.TheatreServiceImpl;




//this@CrossOrigin will help us to connect with angular with the url mentioned below
@CrossOrigin(origins = "http://localhost:4200")
//@RestController = @Controller + @ResponseBody
@RestController
public class TheatreRestController {

	@Autowired
	TheatreServiceImpl theatreServiceImpl;

	/*
	 * Author : Krishnaveni
	 * This addTheatre(theatreBean bean) method will return the object of Movie 
	 * once a new Theatre is added successfully in to system
	  */

	@PostMapping("/theatre/add") // postman: POST
	public String addTheatre(@RequestBody TheatreBean bean) {
		TheatreBean theatre = theatreServiceImpl.addTheatre(bean);
		return theatre.getTheatreName() + " has been added" + " with theatre id " + theatre.getTheatreId();
	}

	/*
	 * This deleteTheatre(int theatreId) method returns a message that your movie is
	 * deleted by id. it gathers the information from service layer
	 */
	@DeleteMapping("/theare/delete/{movieId}") // postman: DELETE
	public String deleteTheatre(@PathVariable int theatreId) {
		TheatreBean theatrebean = theatreServiceImpl.removeTheatre(theatreId);

		return "Your Theatre with id: " + theatrebean.getTheatreId() + " has been deleted";
	}

	
}
