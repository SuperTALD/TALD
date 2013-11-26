package main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestNumbers {
	
	int a;
	int b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = 45;
		b = 15;
		}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Numbers num = new Numbers();
		assertEquals(num.add(a,b), 60);
	}
	
	@Test
	public void testDivNotNull() {
		Numbers num = new Numbers();
		assertNotNull(num.div(a,b));
	}
	
	@Test
	public void testDiv() {
		Numbers num = new Numbers();
		assertEquals(num.div(a,b), 3);
	}
	
	@Test
	public void testDivFalse() {
		Numbers num = new Numbers();
		assertFalse(num.div(a,b) == 4);
	}
	
	@Test
	public void testSub() {
		Numbers num = new Numbers();
		assertEquals(num.sub(a,b), 30);
	}
	
	@Test
	public void testSubTrue() {
		Numbers num = new Numbers();
		assertTrue(num.sub(a, b) == 30);
	}
	
	@Test
	public void testMul() {
		Numbers num = new Numbers();
		assertEquals(num.mul(a,b), 675);
	}
	
	
}
