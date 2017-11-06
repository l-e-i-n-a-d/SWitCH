package aula20171024;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterCountingTests {

	@Test
	public void testOcorrencies1() {
		char[][] arr1 = {{'a', 'b', 'c', 'd', 'e'},
						 {'a', 'b', 'c', 'd', 'e'},
						 {'a', 'b', 'a', 'd', 'e'},
						 {'a', 'b', 'c', 'd', 'e'},
						 {'a', 'b', 'a', 'd', 'e'}};
		
		assertEquals(7, CharacterCounting.ocurrencies(arr1, 'a'));
	}

	@Test
	public void testOcorrencies2() {
		char[][] arr1 = {{'a', 'b', 'c', 'd', 'e'},
						 {'a', 'b', 'c', 'd', 'e'},
						 {'a', 'b', 97, 'd', 'e'}, //97 is the ASCII code for character 'a'
						 {'a', 'b', 'c', 'd', 'e'},
						 {'a', 'b', 'a', 'd', 'e'}};
		
		assertEquals(7, CharacterCounting.ocurrencies(arr1, 'a'));
	}

}
