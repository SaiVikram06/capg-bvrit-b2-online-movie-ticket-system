
package com.capg.omts.Entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

@Entity
@Table(name = "Theaters")
public class Theaters implements Serializable {
	@Id
	@Column(name="Theatre_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int TheatreId;
	@Column(name="Theater_Name")
	private String TheaterName;
	@Column(name="Theatre_City")
	private String TheatreCity;
	@Column(name="screens")
	private int screens;
	

	

	public int getTheatreId() {
		return TheatreId;
	}

	public void setTheatreId(int theatreId) {
		TheatreId = theatreId;
	}

	public String getTheaterName() {
		return TheaterName;
	}

	public void setTheaterName(String theaterName) {
		TheaterName = theaterName;
	}

	public String getTheatreCity() {
		return TheatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		TheatreCity = theatreCity;
	}

	public int getScreens() {
		return screens;
	}

	public void setScreens(int screens) {
		this.screens = screens;
	}

	

	@Override
	public String toString() {
		return "Theatre [TheatreId=" + TheatreId + ", TheaterName=" + TheaterName + ", TheatreCity=" + TheatreCity
				+ ", screens=" + screens + "]";
	}
}
