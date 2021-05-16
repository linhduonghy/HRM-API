package com.cuder.service;

import java.util.List;

import com.cuder.model.Bonus;

public interface BonusService {
	List<Bonus> getAllBonus();

	Bonus findById(Integer id);
	
	Bonus createBonus(Bonus bonus);

	Bonus updateBonus(Bonus newBonus, Integer id);

	void deleteBonus(Integer id);
}
