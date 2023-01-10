package com.csi.service;

import com.csi.dao.DepartmentDao;
import com.csi.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    DepartmentDao dao;

    public Department saveData(Department department){
        return dao.saveData(department);
    }

    public Optional<Department> getDataById(int deptId){
        return dao.getDataById(deptId);
    }
}
