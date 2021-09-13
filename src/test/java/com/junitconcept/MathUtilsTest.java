package com.junitconcept;

import org.junit.Test;

import junit.framework.TestCase;

public class MathUtilsTest extends TestCase {
	@Test
	public void testAdd() {
		assertEquals(4,MathUtils.add(2,2));  
	}

}
