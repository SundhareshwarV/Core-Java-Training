package com.day10;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {

		Map<Integer,String> ht = new Hashtable<>();
		
		
		ht.put(20, "Java");
		ht.put(10, "C");
		ht.put(60, "C++");
		ht.put(90, "SQL");
	//	ht.put(null, null);
		
		ht.put(10, "Sundhar");
		
		System.out.println(ht);
		
		ht.remove(10);
		
		System.out.println(ht);
		
		System.out.println(ht.get(20));//java
		
		System.out.println(ht.size());//4
		
		System.out.println(ht.containsKey(20)); //true
		System.out.println(ht.containsValue("SQL"));//true
		

		//Way-1
		
		//Converting all the keys present in Map, to Set using KeySet() method
		Set<Integer> keys = ht.keySet();
		//Display 
		System.out.println(keys);
		
		//Using forEachLoop
		for(Integer x : keys) {
			
			System.out.println(x+" ---> "+ht.get(x));
		}
		
		System.out.println("----------------------------");
		//Using Iterator
		
		Iterator<Integer> itr = keys.iterator();
		
		while(itr.hasNext()) {
			Integer x = itr.next();
			System.out.println(x+" ===> "+ht.get(x));
		}
		
		
		System.out.println("***********************");
		//Way--2
		
	  Set<Entry<Integer, String>> entries	=ht.entrySet();
	  System.out.println(entries);
	  
	  for(Entry<Integer, String> entry : entries) {
		  System.out.println(entry.getKey()+" --> "+entry.getValue());
	  }
	  
	  
	  Iterator<Entry<Integer, String>> it1 = entries.iterator();
	  while(it1.hasNext()) {
		  Entry<Integer, String> entry = it1.next();
		  System.out.println(entry.getKey()+" --> "+entry.getValue());
	  }
	  
	

	}

}
