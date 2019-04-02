package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5,3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(3,4), 12);
	}
	
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(15,3), 5);
	}
}
