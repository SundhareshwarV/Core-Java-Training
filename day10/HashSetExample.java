package com.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
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
		
		//Iterator remove Lessthan 30
		
		System.out.println();
		Iterator<Integer> itr1 = set.iterator();
		while(itr1.hasNext()) {
			Integer t = itr1.next();
			if(t <= 30 && t != null) {
				itr1.remove();
			}
		}
		
		System.out.println(set);
		
		
	}

}
