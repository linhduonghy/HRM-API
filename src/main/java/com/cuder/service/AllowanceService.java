package com.cuder.service;

import java.util.List;

import com.cuder.model.Allowance;

public interface AllowanceService{

	List<Allowance> getAllAllowance();

	Allowance createAllowance(Allowance allowance);

	Allowance findById(Integer a_id);

	Allowance updateAllowance(Allowance newAllowance, Integer a_id);

	void deleteAllowance(Integer a_id);
}
