package com.stm.service;

import com.stm.model.Classes;

public interface ClassesService {
	public String insertClassesValidation(Classes classes);

	public String deleteClassesValidation(int id);

	public String updateClassesValidation(Classes classes);

	public String findClassesValidation(int id);

	public String displayAllClassesValidation();

}
