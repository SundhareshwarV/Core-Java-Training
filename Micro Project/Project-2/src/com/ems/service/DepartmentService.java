package com.ems.service;

import com.ems.model.Department;
import com.ems.repo.DepartmentRepo;




/**
 * @version 1.0
 * It is Performing all the Validations
 * 
 */

public class DepartmentService {
	
	/**
	 *@param employee
	 *@return String
	 * It is Validating the objects while inserting
	 * 
	 */


	// This is for Using List
	// EmployeeRepo employeeRepo = new EmployeeRepo();

	// This is for Map  
	DepartmentRepo departmentRepo = new DepartmentRepo();

	public String insertDepartmentValidation(Department department) {

		String result;

		if (department == null) {

			result = "Department Object is Null";
		} else if (department.getDno() == 0 || department.getDname() == null ) {

			result = "Invalid Department Data";
		} else {

			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Department Object Saved";
			} else {
				result = "Department Object Not Saved";
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

	public String deleteDepartmentValidation(int dno) {
		String result = "";
		if (dno == 0) {
			result = "Invalid Department Number";

		} else {
			boolean flag = departmentRepo.doDeleteDepartment(dno);
			if (flag) {
				result = "Department Object Deleted";
			} else {
				result = "Department Object Not Found";
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

	public String updateDepartmentValidation(Department department) {
		String result = "";
		if (department == null) {
			result = "Employee Object is null";
		} else if (department.getDno() == 0 || department.getDname()==null) {
			result = "Invalid Employee Data";
		} else {
 
			boolean flag = departmentRepo.doUpdateDepartment(department);
 
			if (flag) {
				result = "Department Object Updated";
			} else {
				result = "Department Object Not Found";
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

	public String findDepartmentValidation(int id) {
		String result = "";
		Department department;
		if (id == 0) {
			result = "Invalid Id";
		} else {
			department = departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Department Object Not Found";
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

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();

}
}
