package com.day9;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(50);
		stack.push(30);
		stack.push(20);
		
		System.out.println(stack);
		
		//Remove the top element
		stack.pop();
		System.out.println(stack);
		
		//Display the top element
		System.out.println(stack.peek());

	}

}