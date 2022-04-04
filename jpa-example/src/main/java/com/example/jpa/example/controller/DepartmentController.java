package com.example.jpa.example.controller;

import com.example.jpa.example.dto.DepartmentDTO;
import com.example.jpa.example.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping(value = "departments")
public class DepartmentController {
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

    @PostMapping
    public ResponseEntity<String> addDepartment(@RequestBody DepartmentDTO departmentDTO) {
        departmentService.saveDepartment(departmentDTO);
        return ResponseEntity.ok("Department successfully added");

    }

    @PutMapping
    public ResponseEntity<String> updateDepartment(@RequestBody DepartmentDTO departmentDTO) {
        departmentService.saveDepartment(departmentDTO);
        return ResponseEntity.ok("Department successfully updated");

    }
}
