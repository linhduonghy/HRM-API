package com.cuder.service;

import java.util.List;

import com.cuder.model.TrainingCource;

public interface TrainingCourceService {

	List<TrainingCource> getAllTrainingCource();

	TrainingCource findById(Integer id);

	TrainingCource createTrainingCource(TrainingCource tc);

	TrainingCource updateTrainingCource(TrainingCource newTC, Integer id);

	void deleteTrainingCource(Integer id);

	

}
