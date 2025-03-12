package com.test;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Test.*;

public class Test1 {
	@Test
	public void testName()
	{
		String name="manisha";
		String name1="manisha";
		
		assertEquals(name, name1);
		
	}
	@Test
	public void testCmp()
	{
		String c1="Eviden";
		String c2="Eviden";		
		assertEquals(c1,c2);
		
	}

	@Test
	public void testLocation()
	{
		String c1="India";
		String c2="India";		
		assertEquals(c1,c2);
		
	}
}
