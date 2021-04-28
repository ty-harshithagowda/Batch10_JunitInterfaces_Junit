package com.te.mathutil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilTest {
	private MathUtil m;
	
//	@BeforeAll
//	public static void initBeforeAll() {
//		System.out.println("before all...");
//	}
	@BeforeEach
	public void initBeforeEach() {
		m=new MathUtil();
	}

	@Test
	void testAddNumber() {
		MathUtil m=new MathUtil();
		int exp=10;
		int act=m.addNumber(5, 5);
		assertEquals(exp,act,"actual value is not matching");
		System.out.println("succesfull..");
	}

	@Test
	void testAreaOfCircle() {
		MathUtil m=new MathUtil();
		assertEquals(314.15926535589793, m.computeCircleArea(10));
		}
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class,() -> m.divide(10,0));
	}
}
