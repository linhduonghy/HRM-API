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

import com.cuder.model.Title;
import com.cuder.service.TitleService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/title")
public class TitleController {

	@Autowired 
	TitleService titleService;
	
	@GetMapping
	public List<Title> getTitleList() {
		return titleService.getAllTitle();
	}
	
	@GetMapping("/{id}")
	public Title getById(@PathVariable Integer id) {
		return titleService.findById(id);
	}
	
	@PostMapping
	public Title createTitle(@RequestBody Title title) {
		return titleService.createTitle(title);
	}
	
	@PutMapping("/{id}")
	public Title updateTitle(@RequestBody Title newT, @PathVariable Integer id) {
		return titleService.updateTitle(newT, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTitle(@PathVariable Integer id) {
		titleService.deleteTitle(id);
	}
	
}
