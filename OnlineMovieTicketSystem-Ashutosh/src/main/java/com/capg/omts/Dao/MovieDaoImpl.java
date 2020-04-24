package com.capg.omts.Dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.omts.Entity.Movies;
import com.capg.omts.Entity.Theaters;

@Repository
@Transactional
public class MovieDaoImpl implements IMovieTheatreDao {
	
	//EntityManager is used to access a database in a particular application
	@PersistenceContext
	EntityManager entityManager;
	
	// In this Dao layer, in this addMovie method business logic is performed and it is returned to service layer
	//Here in addMovie method movie details can be added
	/*
	 * @Override public Movies addMovie(Movies movie) {
	 * entityManager.persist(movie); return movie; } // In this Dao layer, in this
	 * deleteMovie method business logic is performed and it is returned to service
	 * layer //
	 * 
	 * @Override public Movies deleteMovie(int movieId) { Movies
	 * movies=entityManager.find(Movies.class, movieId); if(movies!=null)
	 * entityManager.remove(movies); return movies;}
	 */
	
	// In this Dao layer, in this searchMovie method business logic is performed and it is returned to service layer 
	@Override
	public Movies searchMovie(int movieId) {
		Movies movies=entityManager.find(Movies.class, movieId);
		return movies;
		
		
	}
	// In this Dao layer, in this addTheatre method business logic is performed and it is returned to service layer 
	/*
	 * @Override public Theaters addTheatre(Theaters theatre) {
	 * entityManager.persist(theatre); return theatre; } // In this Dao layer, in
	 * this deleteTheatre method business logic is performed and it is returned to
	 * service layer
	 * 
	 * @Override public Theaters deleteTheatre(int TheatreId) { Theaters
	 * theatre=entityManager.find(Theaters.class, TheatreId); if(theatre!=null)
	 * entityManager.remove(theatre); return theatre;}
	 */
	
	// In this Dao layer, in this searchTheatre method business logic is performed and it is returned to service layer 
	@Override
	public Theaters searchTheatre(int TheatreId) {
		Theaters theaters=entityManager.find(Theaters.class, TheatreId);
		return theaters;
		
	}
	// In this Dao layer, in this getAll method business logic is performed and it is returned to service layer 
	@Override
	public List<Movies> getAllMovies() {
		TypedQuery<Movies> query=entityManager.createQuery("from Movies",Movies.class);
		return query.getResultList();
	}
	// In this Dao layer, in this addMovie method business logic is performed and it is returned to service layer 
	@Override
	public List<Theaters> getAllTheaters() {
		TypedQuery<Theaters> query=entityManager.createQuery("from Theaters",Theaters.class);
		return query.getResultList();
	}
}
