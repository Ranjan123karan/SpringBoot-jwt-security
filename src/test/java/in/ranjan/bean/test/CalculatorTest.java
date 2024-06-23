package in.ranjan.bean.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import in.ranjan.bean.Calculator;

public class CalculatorTest {
	private static Calculator c=null;
	
	@BeforeClass
	public static void beforeAll(){
		c=new Calculator();
	}
	@AfterClass
	public static void afterAll() {
		c=null;
	}
	
	@Test
	public void testAdd() {
		 
		Integer actualResult = c.add(10, 20);
		Integer expectedResult=30;
		
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testMultiply() {
	 
		Integer actualResult = c.multiply(10, 20);
		Integer expectedResult=200;
		
		assertEquals(expectedResult, actualResult);
	}
}
