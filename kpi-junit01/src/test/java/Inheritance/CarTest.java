package Inheritance;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
	

	@Test
	public void test1() {
		Car car = new Car(10,200);
		int ans= car.speedUp(10);
		assertEquals(210, ans);
		
		}
	public void test() {
		Car car = new Car(5,200);
		int ans= car.applyBrake(5);
		assertEquals(195, ans);
	
	
	}		
		
		
}

