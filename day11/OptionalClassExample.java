package com.day11;

import java.util.Optional;

//Optional Class
public class OptionalClassExample {

	public static void main(String[] args) {
		
		String name = "Sundhar";
		
		Optional<String> nameOptional = Optional.ofNullable(name);
		
		if(nameOptional.isPresent()) {
			//Value is present, You can access it using get()
			String value = nameOptional.get();
			System.out.println(value);
		}
		else {
			//Value is Absent
			System.out.println("Value Not present");
		}
		

	}

}
