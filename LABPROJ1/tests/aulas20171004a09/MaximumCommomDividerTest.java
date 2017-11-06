package aulas20171004a09;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import aula20171009.MaximumCommomDivider;

class MaximumCommomDividerTest {

	@Test
	void testMCd() {
		assertEquals(5, MaximumCommomDivider.mCd(10, 15));
		assertEquals(10, MaximumCommomDivider.mCd(10, 20));
		assertEquals(200, MaximumCommomDivider.mCd(200, 400));

	}

}
