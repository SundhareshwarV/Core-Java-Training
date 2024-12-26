package com.stm.service;

import com.stm.model.Classes;
import com.stm.repo.ClassesRepoImpl;
import com.stm.repo.ClassesRepo;

/**
 * Service class for validating the Classes Objects
 */
public class ClassesServiceImpl implements ClassesService {

	ClassesRepo classesRepo = new ClassesRepoImpl();

	public String insertClassesValidation(Classes classes) {

		String result = "";

		if (classes == null) {
			result = "Classes Object is null";
		} else if (classes.getCid() == 0 || classes.getCname() == null || classes.getTeacher().getTid() == 0) {
			result = "Invalid Classes Datas";
		} else {
			boolean temp = classesRepo.doInsertClasses(classes);
			if (temp) {
				result = "Classes Object Inserted";
			} else {
				result = "Classes Object Not Inserted";
			}
		}

		return result;

	}

	public String deleteClassesValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";

		} else {
			boolean flag = classesRepo.doDeleteClasses(id);
			if (flag) {
				result = "Classes Object Deleted";
			} else {
				result = "Classes Object Not Found";
			}
		}
		return result;

	}

	public String updateClassesValidation(Classes classes) {

		String result = "";

		if (classes == null) {
			result = "Classes Object is null";
		} else if (classes.getCid() == 0 || classes.getCname() == null || classes.getTeacher().getTid() == 0) {
			result = "Invalid Classes Datas";
		} else {
			boolean temp = classesRepo.doUpdateClasses(classes);
			if (temp) {
				result = "Classes Object Inserted";
			} else {
				result = "Classes Object Not Found";
			}
		}

		return result;

	}

	public String findClassesValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";

		} else {
			Classes classes = classesRepo.doFindClasses(id);
			if (classes != null) {
				result = classes.toString();
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;

	}

	public String displayAllClassesValidation() {

		return classesRepo.doFindAllClasses().toString();

	}

}
