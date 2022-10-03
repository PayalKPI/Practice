package Abstraction;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class DestinationTest {
	@Test
	public void test1() {
		Paris p = new Paris();
		String ans= p.fun();
		assertEquals("Paris is beautiful", ans);
	

}
}