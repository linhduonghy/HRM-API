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
	public Contract findById(String id) {
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
	public Contract updateContract(Contract newContract, String id) {
		Contract contract = findById(id);
		if (contract == null) {
			return null;
		}
		
		contract.setContract_end_date(newContract.getContract_end_date());
		contract.setContract_signing_date(newContract.getContract_signing_date());
		contract.setContractType(newContract.getContractType());
		contract.setNote(newContract.getNote());
		contract.setManager(newContract.getManager());
		contract.setStaff(newContract.getStaff());
		
		return contractRepo.save(contract);
	}

	@Override
	public void deleteContract(String id) {
		
		contractRepo.deleteById(id);
	}

}
