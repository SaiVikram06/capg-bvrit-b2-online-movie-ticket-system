package com.capg.omts.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Movie")

public class MovieBean {
	// do not insert movieId it will be auto generated
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private int movieId;

	@NotEmpty(message = "Movie Name is Mandatory")
	@NotBlank(message = "Movie Name cannot be blank")
	@Size(min = 2, message = "Name should have atleast 2 characters")
	@Pattern(regexp = "^[A-Za-z]*$")
	private String movieName;

	@NotEmpty(message = "Movie Director Name is Mandatory")
	@NotBlank(message = "Movie DirectorName cannot be blank")
	@Size(min = 3, message = "Name should have atleast 3 characters")
	@Pattern(regexp = "^[A-Za-z]*$")
	private String movieDirector;

	@NotNull(message = "Movie length can not be null")

	@Min(value = 60, message = "Movie Length can not be less than 60 minutes")
	@Max(value = 180, message = "Movie Length can not be more than 180 minutes")

	private int movieLengthInMinutes;

	@NotEmpty(message = "Movie Name is Mandatory")
	@NotBlank(message = "Movie Name cannot be blank")
	@Size(min = 4, message = "Name should have atleast 4 characters")
	@Pattern(regexp = "^[A-Za-z]*$")
	private String movieLanguage;

	@NotEmpty(message = "Movie Name is Mandatory")
	@NotBlank(message = "Movie Name cannot be blank")
	@Size(min = 4, message = "Name should have atleast 4 characters")
	@Pattern(regexp = "^[A-Za-z]*$")
	private String movieGenre;

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

	public int getMovieLengthInMinutes() {
		return movieLengthInMinutes;
	}

	public void setMovieLengthInMinutes(int movieLengthInMinutes) {
		this.movieLengthInMinutes = movieLengthInMinutes;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	@Override
	public String toString() {
		return "MovieBean [movieId=" + movieId + ", movieName=" + movieName + ", movieDirector=" + movieDirector
				+ ", movieLengthInMinutes=" + movieLengthInMinutes + ", movieLanguage=" + movieLanguage
				+ ", movieGenre=" + movieGenre + "]";
	}

	

}
