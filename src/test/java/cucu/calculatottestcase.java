package cucu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculatottestcase {
	 calculator cal;

	@Before
	public void setUp() throws Exception {
		cal=new calculator();
	}

	@After
	public void tearDown() throws Exception {
		cal =null;
	}

	@Test
	public void testadd() {
	assertEquals(8,cal.add(5,3));
	}
	
	@Test
	public void testmul() {
	assertEquals(8,cal.mul(5,3));
	}
}
