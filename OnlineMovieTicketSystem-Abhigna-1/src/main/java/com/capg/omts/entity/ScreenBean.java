package com.capg.omts.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Screen_Spring")
public class ScreenBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
     private int screenId;
    private String screenName;
	private int rows;
	private int theatreId;
	private String movieEndDate;

	public int getScreenId() {

		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(String movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	
}
