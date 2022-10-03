package Inheritance;

public class Hyundaii10 extends Car{ //Hyundaii10 is derived class that extends 
	//car class and test class
	public int space;

	public Hyundaii10(int gear, int speed, int startspace) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		space = startspace;
	
	}
	public void space(int newValue) {
		space = newValue; }
	
public String toString()
{
	return (super.toString()+ "\nseat height is" + space);
}
}






