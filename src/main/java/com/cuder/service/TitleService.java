package com.cuder.service;

import java.util.List;

import com.cuder.model.Title;

public interface TitleService {

	List<Title> getAllTitle();

	Title findById(Integer id);
	
	Title createTitle(Title t);
	
	Title updateTitle(Title t, Integer t_id);
	
	void deleteTitle(Integer t_id);
}
