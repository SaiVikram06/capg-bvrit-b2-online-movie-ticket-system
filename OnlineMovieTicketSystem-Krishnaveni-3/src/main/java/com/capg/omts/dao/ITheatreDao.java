package com.capg.omts.dao;

import com.capg.omts.entity.TheatreBean;
//Here we are just designing the methods in interface 
public interface ITheatreDao {
	

		public TheatreBean addTheatre(TheatreBean bean);

		public TheatreBean removeTheatre(int theatreId);


}

