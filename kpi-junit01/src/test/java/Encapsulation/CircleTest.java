package Encapsulation;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CircleTest {
	@Test

	

	public void test1() {
		Circle c = new Circle(4, 5);
		int ans= c.circleArea();
		assertEquals(100, ans);
		

	}
}
