package com.cuder.service;

import java.util.List;

import com.cuder.model.DetailContract;

public interface DetailContractService{
	List<DetailContract> getAllDetailContract();

	DetailContract findById(Integer id);
	
	DetailContract createDetailContract(DetailContract datailContract);

	DetailContract updateDetailContract(DetailContract newDetailContract, Integer id);

	void deleteDetailContract(Integer id);
}
