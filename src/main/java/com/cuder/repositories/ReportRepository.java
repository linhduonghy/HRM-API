package com.cuder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cuder.entities.Report;

public interface ReportRepository extends JpaRepository<Report, Integer>{

}
