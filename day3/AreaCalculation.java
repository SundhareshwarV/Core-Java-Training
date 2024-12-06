package com.day3;

class Shapes {

	int length;
	int breath;
	int side;
	int height;

	public Shapes(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public Shapes(int side) {
		super();
		this.side = side;
	}

	public Shapes(int length, int breath, int height) {
		super();
		this.length = length;
		this.breath = breath;
		this.height = height;
	}

	void area() {

		System.out.println("Cannot define area for Shape");

	}

}

class Rectangle extends Shapes {

	public Rectangle(int length, int breath) {
		super(length, breath);
		
	}

	void area() {

		System.out.println("Area of Rectangle is :" + (length * breath));

	}

}

class Square extends Shapes {

	public Square(int side) {
		super(side);
	}

	void area() {

		System.out.println("Area of Square is :" + (side * side));

	}

}

class Triangle extends Shapes {

	public Triangle(int length, int breath, int height) {
		super(length, breath, height);
	}

	void area() {

		System.out.println("Area of Triangle is :" + (length * breath * height));

	}

}

public class AreaCalculation {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(3, 5);
		rectangle.area();

		Square square = new Square(10);
		square.area();

		Triangle triangle = new Triangle(2, 4, 8);
		triangle.area();

	}

}
