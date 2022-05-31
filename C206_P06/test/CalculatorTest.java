import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Lucius Neo Tze Hean
 * Student ID: 21016412
 * Class: W64M
 * Date/Time created: Tuesday 31-05-2022 11:05
 */

/**
 * @author 21016412
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddNormal() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAddBoundary() {
		int a = 0;
		int b = 9999;
			
		Calculator cal = new Calculator();
		boolean actual = cal.boundary(a, b);
		
		boolean expected = true;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAddError() {
		int a = 1234;
		int b = -1;
			
		Calculator cal = new Calculator();
		boolean actual = cal.boundary(a, b);
		
		boolean expected = false;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractNormal() {
		int a = 9876;
		int b = 4321;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractBoundary() {
		int a = 0;
		int b = 9999;
			
		Calculator cal = new Calculator();
		boolean actual = cal.boundary(a, b); 
		
		boolean expected = true;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractError() {
		int a = 1234;
		int b = 12345;
			
		Calculator cal = new Calculator();
		boolean actual = cal.boundary(a, b); 
		
		boolean expected = false;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyNormal() {
		int a = 12;
		int b = 345;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 4140;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyBoundary() {
		int a = 0;
		int b = 9999;
			
		Calculator cal = new Calculator();
		boolean actual = cal.boundary(a, b);
		
		boolean expected = true;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyError() {
		int a = -1;
		int b = 1234;
			
		Calculator cal = new Calculator();
		boolean actual = cal.boundary(a, b);
		
		boolean expected = false;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideNormal() {
		int a = 4140;
		int b = 12;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 345;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideBoundary() {
		int a = 0;
		int b = 9999;
			
		Calculator cal = new Calculator();
		boolean actual = cal.boundary(a, b);
		
		boolean expected = true;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideError() {
		int a = 10000;
		int b = -1;
			
		Calculator cal = new Calculator();
		boolean actual = cal.boundary(a, b);
		
		boolean expected = false;
		assertEquals (expected, actual);
	}
}
