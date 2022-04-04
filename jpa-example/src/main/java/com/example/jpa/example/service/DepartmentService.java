package com.example.jpa.example.service;

import com.example.jpa.example.dto.DepartmentDTO;;
import java.util.List;
public interface DepartmentService {
    boolean saveDepartment(DepartmentDTO departmentDTO);

    List<DepartmentDTO> getAllDepartments();

    DepartmentDTO updateDepartment(DepartmentDTO departmentDTO);

}

