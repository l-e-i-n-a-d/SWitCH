package aulas20171004a09;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import aula20171006.Palindrome;

public class PalindromeTest {
	
	@Test
	public void testPalindrome1() {
		assertEquals(true, Palindrome.isPalindrome(2332L));
	}
	
	@Test
	public void testPalindrome2() {
		assertEquals(true, Palindrome.isPalindrome(23332L));
	}
	
	@Test
	public void testPalindrome3() {
		assertEquals(false, Palindrome.isPalindrome(23322L));
	}
}
