package com.day9;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		
	List<Integer> ll1 = new LinkedList<>();
		
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		
		ll1.add(10);
		ll1.add(40);
		
		System.out.println(ll1);
		ll1.add(1, 100);
		
		System.out.println(ll1.get(2)); //20
		
		ll1.remove(0);
		
		//ll1.set(3, "Program"); //Change the value
		
		System.out.println(ll1.contains(30)); //true
		
		System.out.println(ll1.size());//6
		
		System.out.println(ll1.isEmpty()); //false
		//System.out.println(ll1.equals(al)); // false
		
		System.out.println(ll1);
		
		
		
		//Traversing List Elements 
		
		// 1.ForLoop
		
		for(int i = 0 ; i < ll1.size() ; i++) {
			System.out.print(ll1.get(i)+" ");
		}
		System.out.println();
		
		//2. ForEach
		
		for(Object x : ll1) {
			System.out.print(x+" ");
		}
		
		//3. Iterator 
		
		Iterator<Integer> itr = ll1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//Using Iterator remove odd Numbers
		
		Iterator<Integer> it = ll1.iterator();
		while(it.hasNext()) {
			Integer x = it.next();
			if(x % 2 == 1) {
				it.remove();
			}
		}
		System.out.println("After removing Odd values : "+ll1);
			
	}

}
