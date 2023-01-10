package com.csi.controller;

import com.csi.model.Department;
import com.csi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    DepartmentService service;

    @PostMapping("/")
    public ResponseEntity<Department> saveData(@RequestBody Department department){
        return ResponseEntity.ok(service.saveData(department));
    }

    @GetMapping("/{deptId}")
    public ResponseEntity<Optional<Department>> getDeptById(@PathVariable int deptId){
        return ResponseEntity.ok(service.getDataById(deptId));
    }

}
