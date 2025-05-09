package com.fullstack.service;

import com.fullstack.entity.Employee;
import com.fullstack.repository.EmployeeRepository;
import com.fullstack.vo.Department;
import com.fullstack.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentClient departmentClient;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public ResponseVO findById(int empId) {

        ResponseVO responseVO = new ResponseVO();
        Employee employee = employeeRepository.findById(empId).get();

        Department department = departmentClient.findById(employee.getDeptId());

        responseVO.setEmployee(employee);
        responseVO.setDepartment(department);

        return responseVO;
    }

}
