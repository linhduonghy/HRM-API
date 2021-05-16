package com.cuder.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuder.model.Bonus;
import com.cuder.service.BonusService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/bonus")
public class BonusController {

	@Autowired 
	BonusService bonusService;
	
	@GetMapping
	public List<Bonus> getBonusList() {
		return bonusService.getAllBonus();
	}
	
	@GetMapping("/{id}")
	public Bonus getById(@PathVariable Integer id) {
		return bonusService.findById(id);
	}
	
	@PostMapping
	public Bonus createBonus(@RequestBody Bonus bonus) {
		return bonusService.createBonus(bonus);
	}
	
	@PutMapping("/{id}")
	public Bonus updateBonus(@RequestBody Bonus newBonus, @PathVariable Integer id) {
		return bonusService.updateBonus(newBonus, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBonus(@PathVariable Integer id) {
		bonusService.deleteBonus(id);
	}
}
