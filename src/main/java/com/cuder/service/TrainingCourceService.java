package com.cuder.service;

import java.util.List;

import com.cuder.model.TrainingCourse;

public interface TrainingCourceService {

	List<TrainingCourse> getAllTrainingCource();

	TrainingCourse getById(Integer id);

	TrainingCourse createTrainingCource(TrainingCourse tc);

	TrainingCourse updateTrainingCource(TrainingCourse newTC, Integer id);

	void deleteTrainingCource(Integer id);

}
