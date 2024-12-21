package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamAPIExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(9,5,6,8,2,4,1,7,2);
		//filter() is intermideate operation and forEach() is Termination Operation
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		
		//Count() is termination Operation to count the no.of Elements
		long count = numbers.stream().filter(x -> x % 2 == 0).count();
		System.out.println("Total no.of Even Numbers : "+count);
		
		//Collect() is a termination Operation used to collect the elements and store it to list
		List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		//Stroe to Set collection
		Set<Integer> evenNumbers1 = numbers.stream().filter(x -> x % 2 != 0).collect(Collectors.toSet());
		System.out.println(evenNumbers1);
		
		//After filtering even numbers multiple by 10 using Map()
		List<Integer> evenNumbers2 = numbers.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x*10)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(evenNumbers2);
	}

}
