package com.cuder.service;

import java.util.List;

import com.cuder.model.ContractType;

public interface ContractTypeService {
	List<ContractType> getAllContractType();

	ContractType findById(Integer id);
	
	ContractType createContractType(ContractType ContractType);

	ContractType updateContractType(ContractType newContractType, Integer id);

	void deleteContractType(Integer id);
}
