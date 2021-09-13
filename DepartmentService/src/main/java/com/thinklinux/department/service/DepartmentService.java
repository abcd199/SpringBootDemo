package com.thinklinux.department.service;


import com.thinklinux.department.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long id);
}
