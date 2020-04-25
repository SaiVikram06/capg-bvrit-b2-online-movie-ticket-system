package com.capg.omts.dao;

import com.capg.omts.entity.TheatreBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TheatreDaoImpl implements ITheatreDao {
	// EntityManager is used to access a database in a particular application
	@PersistenceContext
	EntityManager em;


	/*
	 * this method will add theatre to the database and return bean to the service
	 * layer
	 */
	@Override
	
	public TheatreBean addTheatre(TheatreBean bean) {
		em.persist(bean);
		return bean;

	/*
	 * this method will delete the theatre from database by movie id and returns the
	 * value in service layer
	 */

	}


	@Override
	public TheatreBean removeTheatre(int theatreId) {
		// TODO Auto-generated method stub
		TheatreBean bean = em.find(TheatreBean.class, theatreId);
		em.remove(bean);
		return bean;
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
}