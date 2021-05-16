package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.ContractType;
import com.cuder.repository.ContractTypeRepository;
import com.cuder.service.ContractTypeService;

@Service
public class ContractTypeServiceImpl implements ContractTypeService {

	@Autowired
	private ContractTypeRepository contractTypeRepo;

	@Override
	public List<ContractType> getAllContractType() {
		return contractTypeRepo.findAll();
	}

	@Override
	public ContractType findById(Integer id) {
		return contractTypeRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public ContractType createContractType(ContractType contractType) {
		return contractTypeRepo.save(contractType);
	}

	@Override
	public ContractType updateContractType(ContractType newContractType, Integer id) {
		ContractType contractType = findById(id);
		if (contractType == null) {
			return null;
		}
		
		contractType.setContract_type_name(newContractType.getContract_type_name());
		contractType.setContracts(newContractType.getContracts());
		contractType.setDescription(newContractType.getDescription());
		
		return contractTypeRepo.save(contractType);
	}

	@Override
	public void deleteContractType(Integer id) {
		
		contractTypeRepo.deleteById(id);
	}

}
