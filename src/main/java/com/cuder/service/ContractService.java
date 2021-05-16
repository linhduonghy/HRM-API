package com.cuder.service;

import java.util.List;

import com.cuder.model.Contract;

public interface ContractService{
	List<Contract> getAllContract();

	Contract findById(Integer id);
	
	Contract createContract(Contract contract);

	Contract updateContract(Contract newContract, Integer id);

	void deleteContract(Integer id);
}
