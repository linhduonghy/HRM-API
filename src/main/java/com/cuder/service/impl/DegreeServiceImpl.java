package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Degree;
import com.cuder.repository.DegreeRepository;
import com.cuder.service.DegreeService;

@Service
public class DegreeServiceImpl implements DegreeService {

	@Autowired
	private DegreeRepository degreeRepo;

	@Override
	public List<Degree> getAllDegree() {
		return degreeRepo.findAll();
	}

	@Override
	public Degree findById(Integer id) {
		return degreeRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Degree createDegree(Degree degree) {
		return degreeRepo.save(degree);
	}

	@Override
	public Degree updateDegree(Degree newDegree, Integer id) {
		Degree degree = findById(id);
		if (degree == null) {
			return null;
		}
		
		degree.setDegree_name(newDegree.getDegree_name());
		degree.setDescription(newDegree.getDescription());
		degree.setEffectiveTime(newDegree.getEffectiveTime());
		degree.setMember(newDegree.getMember());
		
		return degreeRepo.save(degree);
	}

	@Override
	public void deleteDegree(Integer id) {
		
		degreeRepo.deleteById(id);
	}

}
