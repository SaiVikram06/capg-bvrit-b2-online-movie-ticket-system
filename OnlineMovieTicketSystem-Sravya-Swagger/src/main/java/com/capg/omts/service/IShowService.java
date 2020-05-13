package com.capg.omts.service;

import java.util.List;

import com.capg.omts.entity.ShowBean;

public interface IShowService {

	public ShowBean addShow(ShowBean Bean);
	public void removeShow(int showid);
}
