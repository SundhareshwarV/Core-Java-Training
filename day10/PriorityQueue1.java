package com.day10;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(30);
		pq.offer(80);
		pq.offer(40);
		pq.offer(60);
		pq.offer(20);
		pq.offer(40);
		pq.offer(10);
		pq.offer(100);
		
		//We cannot use null
		//pq.offer(null);
		System.out.println(pq);
		
		pq.poll();
		
		System.out.println(pq.peek());
		
		System.out.println(pq);
		
		
		//If we want max elements as first
		
		System.out.println("-------------------------------------------");
		
       PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
		
		pq1.offer(30);
		pq1.offer(80);
		pq1.offer(40);
		pq1.offer(60);
		pq1.offer(20);
		pq1.offer(40);
		pq1.offer(10);
		pq1.offer(100);
		
		System.out.println(pq1);
		

	}

}
