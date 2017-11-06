package aulas20171004a09;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import aula20171009.PerfectNumber;

class PerfectNumberTest {

	@Test
	void testIsPerfect() {
		assertEquals(true, PerfectNumber.isPerfect(1));
		assertEquals(true, PerfectNumber.isPerfect(153));
		assertEquals(false, PerfectNumber.isPerfect(200));
	}
}
