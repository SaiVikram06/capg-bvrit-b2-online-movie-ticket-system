package com.capg.omts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.dao.IShowDao;
import com.capg.omts.entity.ShowBean;

@Service
public class ShowServiceImpl implements IShowService  {
	@Autowired
	IShowDao dao;
	/**
	 * @author sravya:
	 * this method addShow will 
	 * insert details into the entity of ShowBean**/
	 
	@Override
	public ShowBean addShow(ShowBean Bean) {
		// TODO Auto-generated method stub
		return dao.addShow(Bean);
	}
	/**
	 *  @author sravya:
	 *  This method removeShow will
	 *  delete the details(object) of ShowBean present in particular id**/
		
	@Override
	public void removeShow(int showId) {
		// TODO Auto-generated method stub
		dao.removeShow(showId);
	}
	/**
	 *  @author sravya:
	 *  This method getAllShows will
	 *  retrieve the details(object) of ShowBean**/
	public List<ShowBean> getAllShows() {
		// TODO Auto-generated method stub
		return dao.getAllShows();
	}
}
