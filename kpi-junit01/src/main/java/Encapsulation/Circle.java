package Encapsulation;

public class Circle {
	int pi;
	int radius;
	
	Circle(int pi, int radius) {
		this.pi = pi;
		this.radius = radius; }
	
	public int circleArea() {
		int circle = pi * radius * radius;
		System.out.println("Circle" + circle);
		return circle;
	}

}
