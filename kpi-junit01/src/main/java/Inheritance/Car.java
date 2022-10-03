package Inheritance;

public class Car { //base class
	public int gear;
	public int speed;
	
	public Car(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
		
	}
	
	public int applyBrake(int decrement) {
		speed -= decrement; 
		return gear;
	}
	public int speedUp(int increment) {
		 speed+= increment;
		 return speed;
	}
	public String toString() {
		return("Number of gears are" + gear + "\n" + "speed of car is" + speed);
	}

}

