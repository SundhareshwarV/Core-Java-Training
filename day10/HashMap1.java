package com.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> hm = new HashMap<>();
		
		
		hm.put(20, "Java");
		hm.put(10, "C");
		hm.put(60, "C++");
		hm.put(90, "SQL");
		hm.put(null, null);
		
		hm.put(10, "Sundhar");
		
		System.out.println(hm);
		
		hm.remove(10);
		
		System.out.println(hm);
		
		System.out.println(hm.get(20));//java
		
		System.out.println(hm.size());//4
		
		System.out.println(hm.containsKey(20)); //true
		System.out.println(hm.containsValue("SQL"));//true
		

		//Way-1
		
		//Converting all the keys present in Map, to Set using KeySet() method
		Set<Integer> keys = hm.keySet();
		//Display 
		System.out.println(keys);
		
		//Using forEachLoop
		for(Integer x : keys) {
			
			System.out.println(x+" ---> "+hm.get(x));
		}
		
		System.out.println("----------------------------");
		//Using Iterator
		
		Iterator<Integer> itr = keys.iterator();
		
		while(itr.hasNext()) {
			Integer x = itr.next();
			System.out.println(x+" ===> "+hm.get(x));
		}
		
		
		System.out.println("***********************");
		//Way--2
		
	  Set<Entry<Integer, String>> entries	=hm.entrySet();
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
