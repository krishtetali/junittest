package ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class multtest {

	@Test
	public void test() {
		mult te= new mult();
		int result=te.mul(2,3);
	    int expected=6;
		assertEquals(result, expected);
	}
}	
	


