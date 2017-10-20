package aula20171010;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class FunctionsTests {

	@Test
	void testFactorial1() throws Exception {

		int result = Functions.fatorial(3);
		assertEquals("factorial de 3 � 6", 6, result);
	}

	@Test
	void testFactorial2() throws Exception {

		int result = Functions.fatorial(0);
		assertEquals("factorial de 0 � 1", 1, result);
	}

	@Test
	void testFactorial3() throws Exception {

		int result = Functions.fatorial(1);
		assertEquals("factorial de 1 � 1", 1, result);
	}

	// @Test
	// void testFactorial4() throws Exception{
	// Assertions.assertThrows(Exception.class);
	// }

	@Test
	void testbiggest1() throws Exception {
		int result = Functions.biggest(2, 4);
		assertEquals("O maior n�mero de 2 e 4 �", 4, result);
	}

	@Test
	void testbiggest2() throws Exception {
		int result = Functions.biggest(2, 4, 6);
		assertEquals("O maior n�mero de 2, 4 e 6 �", 6, result);
	}

	@Test
	void testbiggest3() throws Exception {
		int result = Functions.biggest(2, 4, 6, 10);
		assertEquals("O maior n�mero de 2, 4, 6 e 10 �", 10, result);
	}

	@Test
	void testbiggest4() throws Exception{
		int[] nums = {2, 4, 6, 10};
		int result = Functions.biggest(nums);
		assertEquals("O maior n�mero de 2, 4, 6 e 10 �", 10, result);
	}
	
	@Test
	void testbiggest5() throws Exception{
		int[] nums = {-2, 4, -6, 10};
		int result = Functions.biggest(nums);
		assertEquals("O maior n�mero de 2, 4, 6 e 10 �", 10, result);
	}
}
