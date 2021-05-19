package com.cuder.service;

import java.util.List;

import com.cuder.model.Allowance;

public interface AllowanceService{

	List<Allowance> getAllAllowance();

	Allowance createAllowance(Allowance allowance);

	Allowance findById(String a_id);

	Allowance updateAllowance(Allowance newAllowance, String a_id);

	void deleteAllowance(String a_id);
}
