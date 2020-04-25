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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.omts.entity.ScreenBean;
import com.capg.omts.service.ScreenServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/screen" })
public class ScreenRestController {

	@Autowired
	ScreenServiceImpl serviceimpl;

	@PostMapping("/add") // postman :POST
	public String addScreen(@RequestBody ScreenBean bean) {
		ScreenBean screenbean = serviceimpl.addScreen(bean);
		return "Hello " + "your screen added successfully" + "Your Screen Id is " + screenbean.getScreenId();
	}

	@DeleteMapping("/removeByid/{screenId}")
	public String deleteScreenById(@PathVariable int screenId) {
		serviceimpl.deleteScreen(screenId);

		return "Your screen is deleted successfully";
	}

	@GetMapping("/findall")
	public List<ScreenBean> getAllScreens() {

		List<ScreenBean> bean = serviceimpl.getAllScreens();
		return bean;
	}

	@ExceptionHandler(Exception.class)
	public String invalid(Exception e) {
		return e.getMessage();
	}
}
