package com.capg.omts.dao;

import java.util.List;

import com.capg.omts.entity.ScreenBean;

public interface IScreenDao {

	public ScreenBean addScreen(ScreenBean bean);

	public void deleteScreen(int screenId);

	public List<ScreenBean> getAllScreens();

}
