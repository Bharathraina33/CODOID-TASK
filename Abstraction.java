package Programmings;

abstract class Shape {
	   abstract void draw();
	}

	class Circle extends Shape {
	   void draw() {
	      System.out.println("Drawing Circle");
	   }
	}

	class Rectangle extends Shape {
	   void draw() {
	      System.out.println("Drawing Rectangle");
	   }
	}

	public class Abstraction {
	   public static void main(String[] args) {
	      Shape s = new Circle(); 
	      s.draw(); 
	      s = new Rectangle(); 
	      s.draw(); 
	   }
	}

