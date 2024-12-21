package com.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;


class Employee {
	int id; 
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class Java8AdditionalPractice {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,6,19,34,2,1,5,11,7,9,8,4,11,18,16);
		
		//1. program
		List<Integer> evenNumber= numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		
		System.out.println("Even Numbers List : "+evenNumber);
		
		//String.valueOf() to convert any type to String
		//2. Program
		List<Integer> startNumber= numbers.stream().filter(x -> String.valueOf(x).startsWith("1")).collect(Collectors.toList());
		System.out.println("Start With 1 Value List :"+startNumber);
		
		//3. Program
		Set<Integer> duplicate = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x)).collect(Collectors.toSet());
		System.out.println("Duplicate Values : "+duplicate);
		
		//3. Program Another way using Distinct
		List<Integer> duplicate1 = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x))
				.distinct()
				.collect(Collectors.toList());
		System.out.println("Duplicate Values : "+duplicate1);
		
		Long count = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x))
				.distinct()
				.count();
		System.out.println("Duplicate Count : "+count);
		
		//4. find first element using 
		
		int first = numbers.stream().findFirst().get();
		System.out.println("First Element in List :"+first);
		
		//5. Count total
		long count1 = numbers.stream().count();
		System.out.println("Total List Count : "+count1);
		
		
		//6. Maximum Elements 
		int max = numbers.stream().max((x,y) -> x-y).get();
		System.out.println("Maximum Element in List : "+max);
		
		//7. Sort Employee Object Using Salary
		
		List<Employee> shortList = Arrays.asList(new Employee(101,"Sundhar",35000),
				new Employee(102,"Praveen",100000), new Employee(103,"Ram",1000));
		
		List<Employee> result = shortList.stream().sorted((e1,e2) -> e1.salary-e2.salary ).collect(Collectors.toList());
		System.out.println(result);
		
		
       //8. sort the integer List Using Sorted
		
		List<Integer> sort = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		//9. Sort the integer List in Reverse order
		
		List<Integer> reverse = numbers.stream().sorted((x,y) -> y-x).collect(Collectors.toList());
		System.out.println(reverse);
		
		//10. Using set Performing Activities
		
		Set<Integer> newSet = new HashSet<>();
		//1 st Way
		boolean temp = numbers.stream().filter(x -> newSet.add(x) == false).count()>0?true:false;
		System.out.println(temp);
		
		//2 nd way
		
		boolean temp2 = numbers.stream().filter(x -> numbers.indexOf(x) != numbers.lastIndexOf(x)).distinct()
				.count()>0?true:false;
				
		System.out.println(temp2);	
		
		
		// 11. Factorial
		
		List<Integer> fact1 = Arrays.asList(1,3,2,5,4);
		List<Integer> factorial = fact1.stream().map(x -> {
			int fact =1;
			for(int i = 1; i <= x; i++) {
				fact*=i;
			}
			return fact;
		}).collect(Collectors.toList()); 
		
		System.out.println(factorial);
		
		//12. Sort the Array and convert it into Stream 
		
		int arr[] = {20,10,30,5,25};
		Arrays.sort(arr);
		//Store it into Stream and Printing
		Arrays.stream(arr).forEach(System.out::println);
		
		//13. Convert a List of String into upper case using stream
		
		List<String> string = Arrays.asList("Sundhar","Praveen","Raja","Kumar");
		
		List<String> upperCase = string.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCase);
		
		
		//14 .Convert a List of String into a Map key and it's length as Map Value using Java 8 Stream
		
		Map<String,Integer> map = string.stream().collect(Collectors.toMap(x -> x , x -> x.length()));
		System.out.println(map);
		
		
		//15 . flatMap
		
		List<Integer> even = Arrays.asList(2,4,6,8);
		List<Integer> odd = Arrays.asList(1,3,7,5,9);
		
		List<List<Integer>> evenOdd = Arrays.asList(even,odd);
		
		System.out.println("Before Flattering");
		System.out.println(evenOdd);
		List<Integer> result1 = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattering");
		System.out.println(result1);
		
		
		//16. Java 8 : Consumer
		
		List<String> string1 = Arrays.asList("Sundhar","Praveen");
		
		Consumer<String> consumer = str -> System.out.println(str);
		
		string1.forEach(consumer);
		
		
		
		Consumer<Integer> evenConsumer = n -> {
			if(n %2 ==0) {
				System.out.println(n);
			}
		};
		
		numbers.forEach(evenConsumer);
		
	
		
    //17
	Predicate<String> predicate = str -> str.contains("P") || str.contains("R");
	string.stream().filter(predicate).forEach(System.out::println);
	
	Predicate<Integer> evenPredicate = n -> n % 2 == 0;
	numbers.stream().filter(evenPredicate).forEach(System.out::println);
	
	//18. Java 8 : Function
	
	Function<String, Character> function = str -> str.charAt(0);
	string.stream().map(function).forEach(System.out::println);

	Function<Integer, String> function1 = n -> {
	if (n % 2 == 0)
	return "Even";
	else

	return "Odd";
	};
	numbers.stream().map(function1).forEach(System.out::println);

	}	

}
 