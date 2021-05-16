package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.TrainingCourse;
import com.cuder.repository.TrainingCourceRepository;
import com.cuder.service.TrainingCourceService;

@Service
public class TrainingCourceServiceImpl implements TrainingCourceService {

	@Autowired
	private TrainingCourceRepository trainingCourceRepo;
	
	@Override
	public List<TrainingCourse> getAllTrainingCource() {
		return trainingCourceRepo.findAll();
	}

	@Override
	public TrainingCourse getById(Integer id) {
		return trainingCourceRepo.findById(id).map(tc -> {
			return tc;
		}).orElseGet(() -> {
			return null;
		});
	}

	@Override
	public TrainingCourse createTrainingCource(TrainingCourse tc) {
		return trainingCourceRepo.save(tc);
	}

	@Override
	public TrainingCourse updateTrainingCource(TrainingCourse newTC, Integer id) {
		
		TrainingCourse tc = getById(id);
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
