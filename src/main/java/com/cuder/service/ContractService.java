package com.cuder.service;

import java.util.List;

import com.cuder.model.Contract;

public interface ContractService{
	List<Contract> getAllContract();

	Contract findById(String id);
	
	Contract createContract(Contract contract);

	Contract updateContract(Contract newContract, String id);

	void deleteContract(String id);
}
