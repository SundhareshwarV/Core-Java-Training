package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
	//	ArrayList<Integer> al = new ArrayList();//This is not recommended
		
		
     List<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(25);
		al.add(30);
		al.add(15);
		al.add(40);
		
		System.out.println(al);
		
//---------------------------------------------------------
		
		List<Object> al1 = new ArrayList<>();
		
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add("Java");
		al1.add(10);
		al1.add(40);
		
		System.out.println(al1);
		al1.add(1, 100);
		
		System.out.println(al1.get(2)); //20
		
		al1.remove(0);
		
		al1.set(3, "Program"); //Change the value
		
		System.out.println(al1.contains(30)); //true
		
		System.out.println(al1.size());//6
		
		System.out.println(al1.isEmpty()); //false
		System.out.println(al1.equals(al)); // false
		
		System.out.println(al1);
		
		
		
		//Traversing List Elements 
		
		// 1.ForLoop
		
		for(int i = 0 ; i < al1.size() ; i++) {
			System.out.print(al1.get(i)+" ");
		}
		System.out.println();
		
		//2. ForEach
		
		for(Object x : al1) {
			System.out.print(x+" ");
		}
		
		//3. Iterator 
		
		Iterator<Object> itr = al1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//Using Iterator remove odd Numbers
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			Integer x = it.next();
			if(x % 2 == 1) {
				it.remove();
			}
		}
		System.out.println("After removing Odd values : "+al);
		
		
		
		
		
	}

}
