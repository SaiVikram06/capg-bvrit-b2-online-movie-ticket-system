package com.capg.omts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.dao.ITheatreDao;
import com.capg.omts.entity.TheatreBean;

@Service
public class TheatreServiceImpl implements ITheatreService {
  
	@Autowired
	ITheatreDao dao;

	@Override
	public TheatreBean addTheatre(TheatreBean bean) {
		// TODO Auto-generated method stub
		
		return dao.addTheatre(bean);
	}

	/*
	 * Here we are getting the values from dao layer(ItheatreDao) and sending the
	 * values to TheatreRestcontroller by using this service layer and theatre is deleted by id
	 */

	@Override
	public TheatreBean removeTheatre(int theatreId) {
		// TODO Auto-generated method stub
		
		return dao.removeTheatre(theatreId);
	}

	/*
	 * Here we are getting the values from dao layer(ItheatreDao) and sending the
	 * values to TheatreRestcontroller by using this service layer and the list of movies is viewed
	 */
	
	
}
