package Polymorphism;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



	
	public class RuntimeTest {
		@Test
		public void test1() {
			Parent1 r = new Parent1();
			String ans= r.show();
			assertEquals("Parent1", ans);

}
		
	}
