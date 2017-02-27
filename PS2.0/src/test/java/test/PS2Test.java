package test;

import static org.junit.Assert.*;

import org.junit.Test;

import base.MyInteger;

public class PS2Test {

	MyInteger testcase = new MyInteger(4);
	MyInteger testcase2 = new MyInteger(3);

	@Test
	public void testMyInteger() {

		assertEquals(4, testcase.getiValue());
		assertEquals(3, testcase2.getiValue());

	}

	@Test
	public void testIsEven() {
		assertEquals(true, testcase.isEven());
		assertEquals(false, testcase2.isEven());

	}

	@Test
	public void testIsOdd() {
		assertEquals(false, testcase.isOdd());
		assertEquals(true, testcase2.isOdd());
	}

	@Test
	public void testIsPrime() {
		assertEquals(false, testcase.isPrime());
		assertEquals(true, testcase2.isPrime());
	}

	@Test
	public void testIsEvenint() {
		assertEquals(true, MyInteger.isEven(2));
		assertEquals(false, MyInteger.isEven(3));
	}

	@Test
	public void testIsOddint() {
		assertEquals(false, MyInteger.isOdd(2));
		assertEquals(true, MyInteger.isOdd(3));
	}

	@Test
	public void testIsPrimeint() {
		assertEquals(false, MyInteger.isPrime(4));
		assertEquals(true, MyInteger.isPrime(3));
	}

	@Test
	public void testIsEvenMI() {
		assertEquals(true, MyInteger.isEven(testcase));
		assertEquals(false, MyInteger.isEven(testcase2));
	}

	@Test
	public void testIsOddMI() {
		assertEquals(false, MyInteger.isOdd(testcase));
		assertEquals(true, MyInteger.isOdd(testcase2));
	}

	@Test
	public void testIsPrimeMI() {
		assertEquals(false, MyInteger.isPrime(testcase));
		assertEquals(true, MyInteger.isPrime(testcase2));
	}

	@Test
	public void testEqualsInt() {
		assertEquals(true, testcase.equals(4));
		assertEquals(false, testcase2.equals(5));

	}

	@Test
	public void testEqualsMI() {
		assertEquals(true, testcase.equals(4));
		assertEquals(false, testcase2.equals(6));
	}
}