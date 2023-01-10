package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService serivce;

    @PostMapping("/")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
        return ResponseEntity.ok(serivce.saveData(employee));
    }

    @GetMapping("/{empId}")
    public ResponseEntity<RestTemplateVO> getEmpById(@PathVariable int empId){
        return ResponseEntity.ok(serivce.getDataById(empId));
    }
}
