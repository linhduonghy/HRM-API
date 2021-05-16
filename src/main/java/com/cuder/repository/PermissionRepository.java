package com.cuder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuder.model.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Integer>{

}
