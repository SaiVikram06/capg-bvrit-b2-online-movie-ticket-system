package com.capg.omts.service;

import java.util.List;

import com.capg.omts.entity.ScreenBean;

public interface IScreenService {

	public ScreenBean addScreen(ScreenBean bean);

	public void deleteScreen(int screenId);

	public List<ScreenBean> getAllScreens();

}
