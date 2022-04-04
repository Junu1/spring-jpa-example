package com.example.jpa.example.service.impl;

import com.example.jpa.example.dto.DepartmentDTO;
import com.example.jpa.example.entity.Department;
import com.example.jpa.example.repository.DepartmentRepository;
import com.example.jpa.example.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public boolean saveDepartment(DepartmentDTO departmentDTO) {
        Department department = new Department();
        department.setDepartmentName(departmentDTO.getDepartmentName());
        department.setDepartmentAddress(departmentDTO.getDepartmentAddress());
        department.setDepartmentCode(departmentDTO.getDepartmentCode());
        departmentRepository.save(department);
        return true;
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentDTO> departmentDTOList = new ArrayList<>();
        for (Department department : departments) {
            DepartmentDTO departmentDTO = new DepartmentDTO();
            departmentDTO.setDepartmentId(department.getDepartmentId());
            departmentDTO.setDepartmentName((department.getDepartmentName()));
            departmentDTO.setDepartmentAddress(department.getDepartmentAddress());
            departmentDTO.setDepartmentCode(department.getDepartmentCode());
            departmentDTOList.add(departmentDTO);
        }
        return departmentDTOList;
    }

    @Override
    public DepartmentDTO updateDepartment(DepartmentDTO departmentDTO) {
        Department department = departmentRepository.getById(departmentDTO.getDepartmentId());
        department.setDepartmentId(departmentDTO.getDepartmentId());
        department.setDepartmentName(departmentDTO.getDepartmentName());
        department.setDepartmentAddress(departmentDTO.getDepartmentAddress());
        department.setDepartmentCode(departmentDTO.getDepartmentCode());
        departmentRepository.save(department);
        return departmentDTO;
    }
}
