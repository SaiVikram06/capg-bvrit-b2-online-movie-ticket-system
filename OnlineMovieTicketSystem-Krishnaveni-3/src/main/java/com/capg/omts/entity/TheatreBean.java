package com.capg.omts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theatre")



public class TheatreBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int theatreId;
	private String theatreName;
	private String movies;
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getMovies() {
		return movies;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "TheatreBean [theatreId=" + theatreId + ", theatreName=" + theatreName + ", movies=" + movies + "]";
	}
	
	
	
}
