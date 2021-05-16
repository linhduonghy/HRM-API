package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.DetailContract;
import com.cuder.repository.DetailContractRepository;
import com.cuder.service.DetailContractService;

@Service
public class DetailContractServiceImpl implements DetailContractService {

	@Autowired
	private DetailContractRepository detailContractRepo;

	@Override
	public List<DetailContract> getAllDetailContract() {
		return detailContractRepo.findAll();
	}

	@Override
	public DetailContract findById(Integer id) {
		return detailContractRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public DetailContract createDetailContract(DetailContract detailContract) {
		return detailContractRepo.save(detailContract);
	}

	@Override
	public DetailContract updateDetailContract(DetailContract newDetailContract, Integer id) {
		DetailContract detailContract = findById(id);
		if (detailContract == null) {
			return null;
		}
		
		detailContract.setContract(newDetailContract.getContract());
		detailContract.setContract_end_date(newDetailContract.getContract_end_date());
		detailContract.setContract_signing_date(newDetailContract.getContract_signing_date());
		detailContract.setManager(newDetailContract.getManager());
		
		return detailContractRepo.save(detailContract);
	}

	@Override
	public void deleteDetailContract(Integer id) {
		
		detailContractRepo.deleteById(id);
	}

}
