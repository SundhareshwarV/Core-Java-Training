package com.stm.service;

import com.stm.model.Teacher;

public interface TeacherService {

	public String insertTeacherValidation(Teacher teacher);

	public String deleteTeacherValidation(int id);

	public String updateTeacherValidation(Teacher teacher);

	public String findTeacherValidation(int id);

	public String displayAllTeacherValidation();

}
