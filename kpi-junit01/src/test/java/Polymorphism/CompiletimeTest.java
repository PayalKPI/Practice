package Polymorphism;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class CompiletimeTest {
	@Test
	public void test1() {
		Addition1 a = new Addition1();
		int ans= a.Addition(4, 5);
		assertEquals(9, ans);

}
}


	

