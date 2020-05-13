package com.capg.omts.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.omts.Entity.Movies;

@Repository
@Transactional
public class MovieTheatersDaoImpl implements IMovieTheatersDao {

	// EntityManager is used to access a database in a particular application
	@PersistenceContext
	EntityManager entityManager;

	// In this Dao layer, in this searchMovie method business logic is performed and
	// it is returned to service layer
	@Override
	public List<Movies> searchMovie(String movieName) {
		TypedQuery<Movies> query = entityManager.createQuery("from Movies where movieName='" + movieName.toLowerCase()+"'", Movies.class);

		return query.getResultList();
		/* return entityManager.find(Movies.class, movieName); */
	}

	// In this Dao layer, in this getAll method business logic is performed and it
	// is returned to service layer
	@Override
	public List<Movies> getAllMovies() {
		TypedQuery<Movies> query = entityManager.createQuery("from Movies", Movies.class);
		return query.getResultList();
	}
	@Override
	public List<Movies> searchTheater(String theaterName){
		TypedQuery<Movies> query = entityManager.createQuery("from Movies where TheaterName='" + theaterName.toLowerCase()+"'", Movies.class);

		return query.getResultList();
	}
}
