package Diamond;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Inheritance.Car;



public class DiamondTest {
	@Test
	public void test1() {
		Helper p = new Helper();
		String ans= p.show();
		assertEquals("Parent2", ans);
		

}

}
