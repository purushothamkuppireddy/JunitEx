package com.cg.JunitEx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculationExTest {

	static CalculationEx calculationEx;

	@BeforeAll
	public static void init() {
		calculationEx = new CalculationEx();
	}

	@Test
	void testAdd() {
		assertEquals(10, calculationEx.add(3, 7));
	}

	@Test
	void testAdd1() {
		assertEquals(2, calculationEx.add(1, 1));
	}

	@Test
	void testsub() {
		assertEquals(0, calculationEx.sub(1, 1));
	}

	@Test
	void testsub1() {
		assertEquals(-6, calculationEx.sub(9, 15));
	}

	/*@Test
	void testInsert() {
		int i = calculationEx.insert(110, "Divya", "CSE", 918, "Mumbai", 21, 23500);
		assertEquals(1, i);
	}

	@Test
	void testupdate() {
		int i = calculationEx.update(109, "Ramu");
		assertEquals(1, i);
	}
	
	@Test
	void testdelete() {
		int i = calculationEx.delete(110);
		assertEquals(1, i);
	}*/
	@Test
	void testdelete() {
	String i = calculationEx.select(110);
		assertEquals("Divya", i);
	}
	
	
	
	

}
