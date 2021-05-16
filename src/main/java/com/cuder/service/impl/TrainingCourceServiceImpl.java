package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.TrainingCource;
import com.cuder.repository.TrainingCourceRepository;
import com.cuder.service.TrainingCourceService;

@Service
public class TrainingCourceServiceImpl implements TrainingCourceService {

	@Autowired
	private TrainingCourceRepository trainingCourceRepo;
	
	@Override
	public List<TrainingCource> getAllTrainingCource() {
		return trainingCourceRepo.findAll();
	}

	@Override
	public TrainingCource findById(Integer id) {
		return trainingCourceRepo.findById(id).map(tc -> {
			return tc;
		}).orElseGet(() -> {
			return null;
		});
	}

	@Override
	public TrainingCource createTrainingCource(TrainingCource tc) {
		return trainingCourceRepo.save(tc);
	}

	@Override
	public TrainingCource updateTrainingCource(TrainingCource newTC, Integer id) {
		
		TrainingCource tc = findById(id);
		if (tc == null) {
			return null;
		}
		
		tc.setContent(newTC.getContent());
		tc.setDuration(newTC.getDuration());
		tc.setNumber_of_attendance(newTC.getNumber_of_attendance());
		tc.setTraining_cource_name(newTC.getTraining_cource_name());
		
		return trainingCourceRepo.save(tc);
	}

	@Override
	public void deleteTrainingCource(Integer id) {
		
		trainingCourceRepo.deleteById(id);
	}

}
