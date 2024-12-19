package com.day10;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

//Sorted Set Example TreeSet
public class TreeSet1 {

	public static void main(String[] args) {
       SortedSet<Integer> set = new TreeSet<>();
		
       
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(40);
		set.add(10);
		
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
		
		System.out.println();
		//If we want reverse order
		
		SortedSet<Integer> set1 = new TreeSet<>(Collections.reverseOrder());
         
		set1.add(10);
		set1.add(30);
		set1.add(50);
		set1.add(40);
		set1.add(10);
		
		System.out.println(set1);
	}

}
