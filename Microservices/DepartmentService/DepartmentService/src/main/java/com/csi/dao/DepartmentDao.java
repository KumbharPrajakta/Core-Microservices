package com.csi.dao;

import com.csi.model.Department;
import com.csi.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DepartmentDao {
    @Autowired
    DepartmentRepo repo;

    public Department saveData(Department department){
        return repo.save(department);
    }

    public Optional<Department> getDataById(int deptId){
        return repo.findById(deptId);
    }
}
