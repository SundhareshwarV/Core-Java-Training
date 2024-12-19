package com.day10;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueExample {

	public static void main(String[] args) {
		
     Deque<Integer> queue = new LinkedList<>();
		
		//Adding objects Specific Queue method
		queue.offerFirst(10);
		queue.offerFirst(30);
		queue.offerLast(60);
		queue.offerLast(20);
		queue.offerLast(10);
		
		
		queue.addFirst(40);
		queue.addLast(30);
		System.out.println(queue);
		
		//It will also used remove
		queue.removeFirst();
		queue.pollFirst();
		
		//Remove The First element
		queue.pollLast();
		queue.removeLast();
		
		
		System.out.println(queue);
		
		//Iterator
		
//		Iterator itr = queue.iterator();
//		
//		while(Integer x: itr) {
//		
//		}
		
		

	}

}
