package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{

}
