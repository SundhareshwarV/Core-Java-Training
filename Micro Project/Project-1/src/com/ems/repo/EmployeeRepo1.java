package com.ems.repo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Sundhareshwar-V 
 * @version 1.0
 * It is Performing all the CRUD Operations on Map DB
 * 
 */

public class EmployeeRepo1 {

	/**
	 * 
	 * @param employee
	 * @return boolean
	 * 
	 * doInsert Method performing Inserting Employee Object into MapDatabase
	 */

	public boolean doInsert(Employee employee) {

		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		map.put(employee.getEid(), employee);
		return true;

	}
	
	/**
	 * 
	 * @param id
	 * @return boolean
	 * 
	 * doDelete Method performing Detele Employee Object into MapDatabase based on employee id
	 */

	public boolean doDelete(int id) {

		boolean flag = false;

		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			map.remove(id);
			flag = true;
		}

		return flag;
	}
	
	/**
	 * 
	 * @param employee
	 * @return boolean
	 * 
	 * doUpdate Method performing Update Employee Object into MapDatabase based on employee id
	 */

	public boolean doUpdate(Employee employee) {

		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		boolean flag = false;

		if (map.containsKey(employee.getEid())) {
			map.put(employee.getEid(), employee);
			flag = true;
		}

		return flag;

	}
	
	/**
	 * 
	 * @param id
	 * @return Employee Object
	 * 
	 * doFind Method performing Find Employee Object into MapDatabase based on employee id
	 */

	public Employee doFind(int id) {

		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		Employee employee = null;

		if (map.containsKey(id)) {
			employee = map.get(id);
		}
		return employee;

	}
	/**
	 * 
	 * @return Employee Object
	 * 
	 * doFindAll Method performing Display All Employee Object into MapDatabase
	 */

	public List<Employee> doFindAll() {

		Map<Integer, Employee> map = DBUtil.getMapDBInstance();

		Collection<Employee> collection = map.values();
		List<Employee> list = new LinkedList<>();
		for (Employee e : collection) {
			list.add(e);
		}
		return list;

	}

}
