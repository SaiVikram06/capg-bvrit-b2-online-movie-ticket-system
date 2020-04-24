package com.capg.omts.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.omts.entity.ShowBean;
@Repository
@Transactional
public class ShowDaoImpl implements IShowDao{
	@PersistenceContext
	EntityManager entitymanager;
	/**
	 * @author sravya:
	 * this method addShow will 
	 * insert details into the entity of ShowBean**/
	 
	@Override
	public ShowBean addShow(ShowBean bean) {
		
		entitymanager.persist(bean);
		 
		 return bean;
		 }
/**
 *  @author sravya:
 *  This method removeShow will
 *  delete the details(object) of ShowBean present in particular id**/
	
	@Override                                                                 
	public void removeShow(int showId) {
		// TODO Auto-generated method stub
		ShowBean showbean=entitymanager.find(ShowBean.class,showId);
		entitymanager.remove(showbean);
	}
	/**
	 *  @author sravya:
	 *  This method getAllShows will
	 *  retrieve the details(object) of ShowBean **/
	@Override
	public List<ShowBean> getAllShows() {
		// TODO Auto-generated method stub
		TypedQuery<ShowBean> query =entitymanager.createQuery("from ShowBean", ShowBean.class);
		return query.getResultList();
	}

}
