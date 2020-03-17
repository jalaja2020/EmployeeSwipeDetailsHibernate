package com.hcl.daoImpl;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.dao.EmployeeSwipeDao;
import com.hcl.model.Employee;
@Repository
public class EmployeeSwipeDaoImpl implements EmployeeSwipeDao{

	@Autowired
	SessionFactory sessionFactory;
	
	protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
	
	@Override
	public int SaveEmployeeSwipeDetails(Employee employee) {
		getSession().persist(employee);
		return Objects.nonNull(employee) && Objects.nonNull(employee.getEmpId())?employee.getEmpId():null;
	}

}
