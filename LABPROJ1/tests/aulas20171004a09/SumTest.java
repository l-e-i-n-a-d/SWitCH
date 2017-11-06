package aulas20171004a09;

import org.junit.Assert;
import org.junit.Test;

import algoritmia.Sum;

public class SumTest {

	// To get 100% testing coverage needed to test the default constructor method
	@Test
	public void constructSumObjTest() {
		Sum sum = new Sum();
		assert (sum instanceof Sum);
	}

	@Test
	public void somaParesTest() {

		long sum = Sum.somaPares(0, 10);
		Assert.assertTrue(sum == 30);

		sum = Sum.somaPares(10, 20);
		Assert.assertTrue(sum == 90);
	}

	@Test
	public void somaMultTest() {

		long sum = Sum.somaMult(3, 0, 10);
		Assert.assertTrue(sum == 18);

		sum = Sum.somaMult(3, 10, 20);
		Assert.assertTrue(sum == 45);
	}
}
