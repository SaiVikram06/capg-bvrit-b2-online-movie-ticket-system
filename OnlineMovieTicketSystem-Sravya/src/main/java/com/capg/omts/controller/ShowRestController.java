package com.capg.omts.controller;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.capg.omts.entity.ShowBean;
import com.capg.omts.service.ShowServiceImpl;
//
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/show" })
public class ShowRestController {
	@Autowired
	ShowServiceImpl showserviceimpl;
	/**
	 *@author sravya: this createShow method will insert details into the entity of ShowBean
	**/
	@PostMapping("/create")   
	public String createShow(@RequestBody ShowBean bean) { //this method will take all the created details
		ShowBean showbean = showserviceimpl.addShow(bean);
		return  showbean.getShowName() + "Your Show Id is "
				+ showbean.getShowId();
	}
	/**
	 *@author sravya: this method deleteShowById will delete the details present in particular id
	**/ 
	@DeleteMapping("/removeById/{showId}")
	
	public String deleteShowById(@PathVariable int showId) 
	{
		showserviceimpl.removeShow(showId);
		
		return "Your Show is deleted succesfully";
	}
	@GetMapping("/findall")   // viewing all the shows which are available
	/**
	 *@author sravya: this method getAllshows will retrive the details which we create before in the ShowBean
	 * 
	**/
	public List<ShowBean> getallshows() {

		List<ShowBean> bean = showserviceimpl.getAllShows();
		return bean;
	} 
	@ExceptionHandler(Exception.class)
	public String inValid(Exception e) {
		return e.getMessage();
	}

}
