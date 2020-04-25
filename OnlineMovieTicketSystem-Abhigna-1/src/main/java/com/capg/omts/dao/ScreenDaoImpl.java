package com.capg.omts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.omts.entity.ScreenBean;

@Repository
@Transactional
public class ScreenDaoImpl implements IScreenDao {

	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public ScreenBean addScreen(ScreenBean bean) {

		entitymanager.persist(bean);

		return bean;

	}

	@Override
	public void deleteScreen(int screenId) {

		ScreenBean screen = entitymanager.find(ScreenBean.class, screenId);

		entitymanager.remove(screen);

	}

	@Override
	public List<ScreenBean> getAllScreens() {

		TypedQuery<ScreenBean> query = entitymanager.createQuery("from ScreenBean", ScreenBean.class);
		return query.getResultList();
	}
}
