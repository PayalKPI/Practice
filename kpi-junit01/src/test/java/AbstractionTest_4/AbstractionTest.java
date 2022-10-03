package AbstractionTest_4;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Abstraction_4.Thor;

public class AbstractionTest {

	@Test
	public void test1() {
		Thor t = new Thor();
	    String ans= t.name();
		assertEquals("Thor", ans);

}
}
