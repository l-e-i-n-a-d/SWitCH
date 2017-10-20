package aula20171011;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayMeanTests {

	@Test
	public void arrayMeanTest1() {
		double[] arrTest = {1,2,3};
		assertEquals(2, ArrayMean.mean(arrTest), 0.0001);
	}
	
	@Test
	public void arrayMeanTest2() {
		double[] arrTest = {0,0};
		assertEquals(0.0, ArrayMean.mean(arrTest), 0.0001);
	}
	
	@Test
	public void arrayMeanTest3() {
		double[] arrTest = new double[] {};
		assertEquals(Double.NaN, ArrayMean.mean(arrTest), 0.0001);
	}
	
	@Test
	public void arrayMeanTest4() {
		double[] arrTest = new double[] {1,2};
		assertEquals(1.5, ArrayMean.mean(arrTest), 0.0001);
	}

}
