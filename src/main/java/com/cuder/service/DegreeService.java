package com.cuder.service;

import java.util.List;

import com.cuder.model.Degree;

public interface DegreeService{
	List<Degree> getAllDegree();

	Degree findById(Integer id);
	
	Degree createDegree(Degree degree);

	Degree updateDegree(Degree newDegree, Integer id);

	void deleteDegree(Integer id);
	
}
