package com.capg.omts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.omts.dao.IScreenDao;
import com.capg.omts.entity.ScreenBean;

@Service
public class ScreenServiceImpl implements IScreenService {
	@Autowired
	IScreenDao dao;

	@Override
	public ScreenBean addScreen(ScreenBean bean) {

		return dao.addScreen(bean);
	}

	@Override
	public void deleteScreen(int screenId) {

		dao.deleteScreen(screenId);

	}

	@Override
	public List<ScreenBean> getAllScreens() {

		return dao.getAllScreens();
	}

}
