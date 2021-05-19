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
	public Allowance findById(String a_id) {
		return allowanceRepo.findById(a_id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}

	@Override
	public Allowance updateAllowance(Allowance newAllowance, String a_id) {
		Allowance allowance = findById(a_id);
		if (allowance == null) {
			return null;
		}
		allowance.setAllowance_code(newAllowance.getAllowance_code());
		allowance.setAllowance_name(newAllowance.getAllowance_name());
		allowance.setAllowance_value(newAllowance.getAllowance_value());
		allowance.setSalaries(newAllowance.getSalaries());
		
		return allowanceRepo.save(allowance);
	}

	@Override
	public void deleteAllowance(String a_id) {
		
		allowanceRepo.deleteById(a_id);
	}

}
