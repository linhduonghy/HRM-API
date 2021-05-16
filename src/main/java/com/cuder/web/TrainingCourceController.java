package com.cuder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuder.model.TrainingCourse;
import com.cuder.service.TrainingCourceService;

@RestController
@RequestMapping("/training_cource")
public class TrainingCourceController {

	@Autowired
	private TrainingCourceService trainingCourceService;
	
	@GetMapping
	public List<TrainingCourse> getTrainingCourceList() {
		return trainingCourceService.getAllTrainingCource();
	}
	
	@GetMapping("/{id}")
	public TrainingCourse getById(@PathVariable Integer id) {
		return trainingCourceService.getById(id);
	}
	
	@PostMapping
	public TrainingCourse createTrainingCource(@RequestBody TrainingCourse tc) {
		return trainingCourceService.createTrainingCource(tc);
	}
	
	@PutMapping("/{id}")
	public TrainingCourse updateTrainingCource(@RequestBody TrainingCourse newTC, @PathVariable Integer id) {
		return trainingCourceService.updateTrainingCource(newTC, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTrainingCource(@PathVariable Integer id) {
		trainingCourceService.deleteTrainingCource(id);
	}
}
