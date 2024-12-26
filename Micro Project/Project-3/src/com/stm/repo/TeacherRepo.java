package com.stm.repo;

import java.util.List;

import com.stm.model.Teacher;

public interface TeacherRepo {
	public boolean doInsertTeacher(Teacher teacher);

	public boolean doDeleteTeacher(int id);

	public boolean doUpdateTeacher(Teacher teacher);

	public Teacher doFindTeacher(int id);

	public List<Teacher> doFindAllTeacher();

}
