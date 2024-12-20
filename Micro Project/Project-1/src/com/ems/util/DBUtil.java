package com.ems.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;

/**
 *It is used to store the datas Using ListDB and MapDB
 */

public class DBUtil {
	
	/**
	 * Creating a ListDb
	 */

	// Creating List to Store Employee Objects
	private static List<Employee> list = new LinkedList<>();
	
	/**
	 * Creating a MapDb
	 */

	private static Map<Integer, Employee> map = new HashMap<>();

	public static List<Employee> getListDBInstance() {

		return list;
    }

	public static Map<Integer, Employee> getMapDBInstance() {

		return map;
	}

}
