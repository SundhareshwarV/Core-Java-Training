package com.stm.service;

import com.stm.model.Teacher;
import com.stm.repo.TeacherRepo;
import com.stm.repo.TeacherRepoImpl;


/**
 * Service class for validating the Teacher Objects
 */
public class TeacherServiceImpl implements TeacherService {

	TeacherRepo teacherRepo = new TeacherRepoImpl();

	public String insertTeacherValidation(Teacher teacher) {

		String result = "";

		if (teacher == null) {
			result = "Teacher Object is null";
		} else if (teacher.getTid() == 0 || teacher.getName() == null || teacher.getSubject() == null) {
			result = "Invalid Teacher Datas";
		} else {
			boolean temp = teacherRepo.doInsertTeacher(teacher);
			if (temp) {
				result = "Teacher Object Inserted";
			} else {
				result = "Teacher Object Not Inserted";
			}
		}

		return result;

	}

	public String deleteTeacherValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";

		} else {
			boolean flag = teacherRepo.doDeleteTeacher(id);
			if (flag) {
				result = "Teacher Object Deleted";
			} else {
				result = "Teacher Object Not Found";
			}
		}
		return result;

	}

	public String updateTeacherValidation(Teacher teacher) {

		String result = "";

		if (teacher == null) {
			result = "Teacher Object is null";
		} else if (teacher.getTid() == 0 || teacher.getName() == null || teacher.getSubject() == null) {
			result = "Invalid Teacher Datas";
		} else {
			boolean temp = teacherRepo.doUpdateTeacher(teacher);
			if (temp) {
				result = "Teacher Object Updated";
			} else {
				result = "Teacher Object Not Updated";
			}
		}

		return result;

	}

	public String findTeacherValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";

		} else {
			Teacher teacher = teacherRepo.doFindTeacher(id);
			if (teacher != null) {
				result = teacher.toString();
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;

	}

	public String displayAllTeacherValidation() {

		return teacherRepo.doFindAllTeacher().toString();

	}

}
