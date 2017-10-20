package aula20171011;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

import aula20171011.ArraysSum;

class ArraysSumTests {

	@Test
	void testArraySum1() {
		int[] array = new int[] {1,2,3,4};
		assertEquals(10, ArraysSum.sum(array));
	}
	
	@Test
	void testArraySum2() {
		int[] array = new int[] {-5,-5,-5};
		assertEquals(-15, ArraysSum.sum(array));
	}
	
	@Test
	void testArraySum3() {
		int[] array = new int[5];
		assertEquals(0, ArraysSum.sum(array));
	}
	
	@Test
	void testArraySum4() {
		int[] array = new int[0];
		assertEquals(0, ArraysSum.sum(array));
	}
	
//	@Test(expected = Exception.class)
//	void testArraySum5() throws Exception{
//		int a = 2;
//		ArraysSum.sum(a);
//	}

}
