package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Allowance;
import com.cuder.repository.AllowanceRepository;
import com.cuder.service.AllowanceService;

@Service
public class AlowanceServiceImpl implements AllowanceService {

	@Autowired
	private AllowanceRepository allowanceRepo;

	@Override
	public List<Allowance> getAllAllowance() {
		return allowanceRepo.findAll();
	}

	@Override
	public Allowance createAllowance(Allowance allowance) {
		return allowanceRepo.save(allowance);
	}

	@Override
	public Allowance findById(Integer a_id) {
		return allowanceRepo.findById(a_id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}

	@Override
	public Allowance updateAllowance(Allowance newAllowance, Integer a_id) {
		Allowance allowance = findById(a_id);
		if (allowance == null) {
			return null;
		}
		allowance.setLevelOfAllowance(newAllowance.getLevelOfAllowance());
		allowance.setSalary(newAllowance.getSalary());
		allowance.setTypeAllowance(newAllowance.getTypeAllowance());
		
		return allowanceRepo.save(allowance);
	}

	@Override
	public void deleteAllowance(Integer a_id) {
		
		allowanceRepo.deleteById(a_id);
	}

}
