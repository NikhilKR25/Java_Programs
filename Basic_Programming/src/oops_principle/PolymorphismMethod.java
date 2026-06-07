package oops_pinciple;

class Shape {
	void draw() {
		System.out.println("draw Any Shape..here");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class PolymorphismMethod {
	public static void main(String args[]) {
		Shape s = new Shape();
		s.draw();
		s = new Rectangle();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}