package com.capg.omts.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movies_Spring")

public class MovieBean {
	// do not insert movieId it will be auto generated
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int movieId;
	private String movieName;
	private String movieDirector;
	private int movieLength;

	// private LocalDate movieReleaseDate;
	// public List<Show> movieGenre = new ArrayList<Show>();
	// public List<String> languages = new ArrayList<String>();
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

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	/*
	 * public LocalDate getMovieReleaseDate() { return movieReleaseDate; } public
	 * void setMovieReleaseDate(LocalDate movieReleaseDate) { this.movieReleaseDate
	 * = movieReleaseDate; }
	 */
	/*
	 * public List<Show> getMovieGenre() { return movieGenre; } public void
	 * setMovieGenre(List<Show> movieGenre) { this.movieGenre = movieGenre; } public
	 * List<String> getLanguages() { return languages; } public void
	 * setLanguages(List<String> languages) { this.languages = languages; }
	 */
	@Override
	public String toString() {
		return "MovieBean [movieId=" + movieId + ", movieName=" + movieName + ", movieDirector=" + movieDirector
				+ ", movieLength=" + movieLength + "]";
	}

}
