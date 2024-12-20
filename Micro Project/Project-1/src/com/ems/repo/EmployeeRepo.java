package com.ems.repo;

import java.util.Iterator;
import java.util.List;

import com.ems.model.Employee;
import com.ems.util.DBUtil;


/**
 * @author Sundhareshwar-V 
 * 
 * It is Performing all the CRUD Operations on List DB
 * 
 */
public class EmployeeRepo {
	
	/**
	 * 
	 * @param employee
	 * @return boolean
	 * 
	 * doInsert Method performing Inserting Employee Object into ListDatabase
	 */


	public boolean doInsert(Employee employee) {

		List<Employee> list = DBUtil.getListDBInstance();
		return list.add(employee);

	}
	
	/**
	 * 
	 * @param id
	 * @return boolean
	 * 
	 * doDelete Method performing Detele Employee Object into ListDatabase based on employee id
	 */

	public boolean doDelete(int id) {

		List<Employee> list = DBUtil.getListDBInstance();
		boolean flag = false;

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getEid() == id) {
				itr.remove();
				flag = true;
				break;
			}
		}
		return flag;

	}
	
	/**
	 * 
	 * @param employee
	 * @return boolean
	 * 
	 * doUpdate Method performing Update Employee Object into ListDatabase based on employee id
	 */


	public boolean doUpdate(Employee employee) {

		List<Employee> list = DBUtil.getListDBInstance();
		boolean flag = false;
		int index = 0;

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getEid() == employee.getEid()) {
				list.set(index, employee);
				flag = true;
				break;
			}
			index++;
		}
		return flag;

	}
	
	/**
	 * 
	 * @param id
	 * @return Employee Object
	 * 
	 * doFind Method performing Find Employee Object into ListDatabase based on employee id
	 */

	public Employee doFind(int id) {

		List<Employee> list = DBUtil.getListDBInstance();
		Employee employee = null;

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getEid() == id) {
				employee = emp;
				break;
			}
		}
		return employee;

	}
	
	/**
	 * 
	 * @return Employee Object
	 * 
	 * doFindAll Method performing Display All Employee Object into ListDatabase
	 */

	public List<Employee> doFindAll() {

		return DBUtil.getListDBInstance();

	}

}
