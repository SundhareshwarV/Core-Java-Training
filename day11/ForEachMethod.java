package com.day11;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		
		List<Object> numbers = Arrays.asList(1,"Sundhar",4,6,"Vishnu",5);
		
		numbers.forEach(number -> System.out.println(number));

	}

}
