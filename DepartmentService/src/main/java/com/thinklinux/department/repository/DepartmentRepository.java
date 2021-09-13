package com.thinklinux.department.repository;

import com.thinklinux.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department getDepartmentById(Long id);
}
