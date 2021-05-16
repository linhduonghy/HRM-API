package com.cuder.service;

import java.util.List;

import com.cuder.model.Report;

public interface ReportService {
	List<Report> getAllReport();

	Report findById(Integer id);
	
	Report createReport(Report report);

	Report updateReport(Report newReport, Integer id);

	void deleteReport(Integer id);
}
