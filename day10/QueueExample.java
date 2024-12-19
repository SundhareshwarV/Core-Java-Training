package com.day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		//Adding objects Specific Queue method
		queue.offer(10);
		queue.offer(30);
		queue.offer(60);
		queue.offer(20);
		queue.offer(10);
		
		
		queue.add(40);
		System.out.println(queue);
		
		//It will also used remove
		queue.remove();
		
		//Remove The First element
		queue.poll();
		
		
		System.out.println(queue);
		
		

	}

}
