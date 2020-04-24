package com.capg.omts.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movies implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int movieId;
	private String movieName;
	private String movieDirector;
	private String movieLength;
	private String languages;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Theater_Name", referencedColumnName="Theater_Name")
	private Theaters theaters;

	
	
	public Theaters getTheaters() {
		return theaters;
	}

	public void setTheaters(Theaters theaters) {
		this.theaters = theaters;
	}

	public int getMovieId() {
		return movieId;
	}
	
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(String movieLength) {
		this.movieLength = movieLength;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", movieDirector=" + movieDirector
				+ ", movieLength=" + movieLength + ", languages=" + languages + "]";
	}
}
