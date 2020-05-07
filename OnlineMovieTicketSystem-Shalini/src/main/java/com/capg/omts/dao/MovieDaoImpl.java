package com.capg.omts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.omts.entity.MovieBean;

@Repository
@Transactional
public class MovieDaoImpl implements IMovieDao {
	// EntityManager is used to access a database in a particular application
	@PersistenceContext
	EntityManager entitymanager;

	/*
	 * this method will add movie to the database and return bean to the service
	 * layer
	 */
	@Override
	public MovieBean addMovie(MovieBean bean) {
		entitymanager.persist(bean);
		return bean;
	}
	/*
	 * this method will delete the movie from database by movie id and returns the
	 * value in service layer
	 */

	@Override
	public void removeMovie(int movieId) {
		MovieBean bean = entitymanager.find(MovieBean.class, movieId);
		 entitymanager.remove(bean);
		

	}

	/*
	 * In this method All the movie details are displayed which are stored in the
	 * database and returning to the service layer
	 */
	@Override
	public List<MovieBean> listOfMovies() {

		TypedQuery<MovieBean> query = entitymanager.createQuery("from MovieBean", MovieBean.class);
		return query.getResultList();
	}

}
