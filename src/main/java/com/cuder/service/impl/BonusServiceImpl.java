package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Bonus;
import com.cuder.repository.BonusRepository;
import com.cuder.service.BonusService;

@Service
public class BonusServiceImpl implements BonusService {

	@Autowired
	private BonusRepository bonusRepo;

	@Override
	public List<Bonus> getAllBonus() {
		return bonusRepo.findAll();
	}

	@Override
	public Bonus findById(Integer id) {
		return bonusRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Bonus createBonus(Bonus bonus) {
		return bonusRepo.save(bonus);
	}

	@Override
	public Bonus updateBonus(Bonus newBonus, Integer id) {
		Bonus bonus = findById(id);
		if (bonus == null) {
			return null;
		}
		
		bonus.setBonuses(newBonus.getBonuses());
		bonus.setBonusType(newBonus.getBonusType());
		bonus.setSalary(newBonus.getSalary());
		
		return bonusRepo.save(bonus);
	}

	@Override
	public void deleteBonus(Integer id) {
		
		bonusRepo.deleteById(id);
	}

}
