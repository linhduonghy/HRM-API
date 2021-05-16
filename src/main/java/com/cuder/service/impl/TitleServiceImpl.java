package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Title;
import com.cuder.repository.TitleRepository;
import com.cuder.service.TitleService;

@Service
public class TitleServiceImpl implements TitleService {

	@Autowired
	private TitleRepository titleRepo;
	
	@Override
	public List<Title> getAllTitle() {
		return titleRepo.findAll();
	}

	@Override
	public Title findById(Integer id) {
		
		return titleRepo.findById(id).map( title -> {
			return title;
		}).orElseGet(() -> {
			return null;
		});
		
	}

	@Override
	public Title createTitle(Title t) {
		
		return titleRepo.save(t);
	}

	@Override
	public Title updateTitle(Title new_t, Integer t_id) {
		
		Title t = findById(t_id);
		if (t == null) {
			return null;
		}
		t.setTitle_name(new_t.getTitle_name());
		t.setDescription(new_t.getDescription());
		t.setAppointments(new_t.getAppointments());
		
		return titleRepo.save(t);
	}

	@Override
	public void deleteTitle(Integer t_id) {
		
		titleRepo.deleteById(t_id);
		
	}
	
	

}
