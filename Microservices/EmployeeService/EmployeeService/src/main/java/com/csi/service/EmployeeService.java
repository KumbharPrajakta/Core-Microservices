package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import com.csi.vo.RestTemplateVO;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao dao;

    public Employee saveData(Employee employee){
        return dao.saveData(employee);
    }

    public RestTemplateVO getDataById(int empId){
        return dao.getDataById(empId);
    }
}
