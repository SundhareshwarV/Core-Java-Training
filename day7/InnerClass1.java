package com.day7;

interface Inner4 {
	void display();
}

public class InnerClass1 {

	
	//Non static inner class
	class Inner1 {
		
		void display() {
			System.out.println("Inside Non static class");
		}
	}
		
		//Non static inner class
		static class Inner2 {
			
			void display() {
				System.out.println("Inside static class");
			}
	}
	public static void main(String[] args) {
		
		//Local Inner Class
		class Inner3 {
			void display() {
				System.out.println("Inside Local Inner Class");
			}
		}
		
		//Accessing NonStatic Inner Class
		InnerClass1 obj1 = new InnerClass1();
		Inner1 inner = obj1.new Inner1();
		inner.display();
		
		//Accessing Static Inner Class
		Inner2 inner2 = new InnerClass1.Inner2();
		inner2.display();
		
		//Accessing Local Inner Class
		Inner3 inner3 = new Inner3();
		inner3.display();
		
		Inner4 inner4 = new Inner4() {
			public void display() {
				System.out.println("Annonymous Inner Class");
			}
		};
		
		inner4.display();
		
	}

}

