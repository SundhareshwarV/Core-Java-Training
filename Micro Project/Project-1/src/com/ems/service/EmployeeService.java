package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;
import com.ems.repo.EmployeeRepo1;


/**
 * @version 1.0
 * It is Performing all the Validations
 * 
 */

public class EmployeeService {
	
	/**
	 *@param employee
	 *@return String
	 * It is Validating the objects while inserting
	 * 
	 */


	// This is for Using List
	// EmployeeRepo employeeRepo = new EmployeeRepo();

	// This is for Map  
	EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	public String insertValidation(Employee employee) {

		String result;

		if (employee == null) {

			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0) {

			result = "Invalid Employee Data";
		} else {

			boolean flag = employeeRepo.doInsert(employee);
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not Saved";
			}

		}
		return result;

	}
	
	/**
	 *@param id
	 *@return String
	 * It is Validating the objects while Deleting
	 * 
	 */

	public String deleteValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";

		} else {
			boolean flag = employeeRepo.doDelete(id);
			if (flag) {
				result = "Employee Object Deleted";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;

	}
	
	/**
	 *@param employee
	 *@return String
	 * It is Validating the objects while Updating
	 * 
	 */

	public String updateValidation(Employee employee) {

		String result;

		if (employee == null) {

			result = "Employee Object is Null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0) {

			result = "Invalid Employee Data";
		} else {

			boolean flag = employeeRepo.doUpdate(employee);
			if (flag == true) {
				result = "Employee Object Updated";
			} else {
				result = "Employee Object Not Found";
			}

		}
		return result;

	}
	
	/**
	 *@param id
	 *@return String
	 * It is Validating the objects while Find the Particular Object
	 * 
	 */

	public String findValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";

		} else {
			Employee employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;

	}
	
	/**
	 *@param employee
	 *@return String
	 * It is Validating the objects while Display All the Object
	 * 
	 */

	public String findAllValidation() {

		return employeeRepo.doFindAll().toString();

	}

}
