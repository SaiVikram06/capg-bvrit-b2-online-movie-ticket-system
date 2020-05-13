package com.capg.omts.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Show_Spring")
public class ShowBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int showId;
	
	@NotEmpty(message="ShowTime is Mandatory field. Please provide ShowId")
	private String showTime;
	
	@NotEmpty(message="ShowName is mandatory field. pleaser provide ShowName")
	private String showName;
	
	@NotEmpty(message="MovieName is mandatory field. pleaser provide MovieName")
	private String movieName;
	
	@NotNull(message ="ScreenId should not be null")
	@Min(value=1,message="screenId cannot be less than 1")
	@Max(value=3,message="screenId cannot be greater than 3")
	private int screenId;

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

}
