package com.stm.repo;

import java.util.List;

import com.stm.model.Classes;

public interface ClassesRepo {
	public boolean doInsertClasses(Classes classes);

	public boolean doDeleteClasses(int id);

	public boolean doUpdateClasses(Classes classes);

	public Classes doFindClasses(int id);

	public List<Classes> doFindAllClasses();

}
