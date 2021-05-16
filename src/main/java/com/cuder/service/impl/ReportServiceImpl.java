package com.cuder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuder.model.Report;
import com.cuder.repository.ReportRepository;
import com.cuder.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository reportRepo;

	@Override
	public List<Report> getAllReport() {
		return reportRepo.findAll();
	}

	@Override
	public Report findById(Integer id) {
		return reportRepo.findById(id).map(a -> {
			return a;
		}).orElseGet(() -> {
			return null;
		});
	}
	
	@Override
	public Report createReport(Report report) {
		return reportRepo.save(report);
	}

	@Override
	public Report updateReport(Report newReport, Integer id) {
		Report report = findById(id);
		if (report == null) {
			return null;
		}
		
		report.setManager(newReport.getManager());
		report.setDescription(newReport.getDescription());
		report.setReport_name(newReport.getReport_name());
		
		return reportRepo.save(report);
	}

	@Override
	public void deleteReport(Integer id) {
		
		reportRepo.deleteById(id);
	}

}
