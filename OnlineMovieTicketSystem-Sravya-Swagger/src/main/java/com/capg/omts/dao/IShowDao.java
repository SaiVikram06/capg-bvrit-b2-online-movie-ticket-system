package com.capg.omts.dao;
import java.util.List;

import com.capg.omts.entity.ShowBean;

public interface IShowDao {
	public ShowBean addShow(ShowBean bean);
	public void removeShow(int showId);
	public List<ShowBean> getAllShows();
}
