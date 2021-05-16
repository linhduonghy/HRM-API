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

import com.cuder.model.Report;
import com.cuder.service.ReportService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping(value = "/report")
public class ReportController {

	@Autowired 
	ReportService reportService;
	
	@GetMapping
	public List<Report> getReportList() {
		return reportService.getAllReport();
	}
	
	@GetMapping("/{id}")
	public Report getById(@PathVariable Integer id) {
		return reportService.findById(id);
	}
	
	@PostMapping
	public Report createReport(@RequestBody Report report) {
		return reportService.createReport(report);
	}
	
	@PutMapping("/{id}")
	public Report updateReport(@RequestBody Report newReport, @PathVariable Integer id) {
		return reportService.updateReport(newReport, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteReport(@PathVariable Integer id) {
		reportService.deleteReport(id);
	}
}
