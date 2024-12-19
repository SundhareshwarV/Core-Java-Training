package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
     Set<Integer> set = new LinkedHashSet<>();
		
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(40);
		set.add(10);
		
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		System.out.println(set.contains(40));
		
		
		//set.clear();
		
		System.out.println(set);
		
		//Traversing using For each loop
		for(Integer x: set) {
			System.out.println(x);
		}
		
		//Traversing using Iterator
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		

	}

}
