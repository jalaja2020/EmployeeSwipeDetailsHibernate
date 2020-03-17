package com.hcl.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.EmployeeSwipeDao;
import com.hcl.model.Employee;
import com.hcl.service.EmployeeSwipeService;

@Service
@Transactional
public class EmployeeSwipeServiceImpl  implements EmployeeSwipeService{

	@Autowired
	EmployeeSwipeDao employeeSwipeDao;
	
	@Override
	public int SaveEmployeeSwipeDetails(Employee employee) {
		return employeeSwipeDao.SaveEmployeeSwipeDetails(employee);
	}

}
