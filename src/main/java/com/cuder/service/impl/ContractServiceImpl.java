package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Contract;
import com.cuder.repository.ContractRepository;
import com.cuder.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ContractRepository contractRepo;

	@Override
	public List<Contract> getAllContract() {
		return contractRepo.findAll();
	}

	@Override
	public Contract findById(Integer id) {
		return contractRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Contract createContract(Contract contract) {
		return contractRepo.save(contract);
	}

	@Override
	public Contract updateContract(Contract newContract, Integer id) {
		Contract contract = findById(id);
		if (contract == null) {
			return null;
		}
		
		contract.setContractType(newContract.getContractType());
		contract.setDescription(newContract.getDescription());
		contract.setNote(newContract.getNote());
		contract.setStaff(newContract.getStaff());
		
		return contractRepo.save(contract);
	}

	@Override
	public void deleteContract(Integer id) {
		
		contractRepo.deleteById(id);
	}

}
