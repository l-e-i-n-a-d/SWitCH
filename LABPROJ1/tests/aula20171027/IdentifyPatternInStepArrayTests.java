package aula20171027;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class IdentifyPatternInStepArrayTests {

//==========identifyPatterns(...) tests================
	@Test
	public void testIdentifyPatternsTwoR() {
			
		char[] steps = {'F','P', 'F', 'R', 'R', 'F', 'P'};
		ArrayList<Character> expected = new ArrayList<Character>();
		expected.add('F');
		expected.add('P');
		expected.add('F');
		expected.add('I');
		expected.add('F');
		expected.add('P');
		
		assertEquals(expected, IdentifyPatternInStepArray.identifyPatterns(steps));
	}
	
	@Test
	public void testIdentifyPatternsThreeR() {
			
		char[] steps = {'F','P', 'R', 'R', 'R', 'F', 'P'};
		ArrayList<Character> expected = new ArrayList<Character>();
		expected.add('F');
		expected.add('P');
		expected.add('L');
		expected.add('F');
		expected.add('P');
		
		assertEquals(expected, IdentifyPatternInStepArray.identifyPatterns(steps));
	}
	
//==========isValidArray(...) tests================	
	@Test
	public void testIsValidArray1() {
			
		char[] steps = {'F','P', 'R', 'R', 'R', 'F', 'P'};
		
		assertTrue(IdentifyPatternInStepArray.isValidArray(steps));
	}
	
	@Test
	public void testIsValidArray2() {
			
		char[] steps = {'F'};
		
		assertFalse(IdentifyPatternInStepArray.isValidArray(steps));
	}
	
	@Test
	public void testIsValidArray3() {
			
		char[] steps = {};
		
		assertFalse(IdentifyPatternInStepArray.isValidArray(steps));
	}
	
//==========transformStepArray(...) tests================		
	@Test
	public void testTransformStepArray() {
			
		ArrayList<Character> stepList = new ArrayList<Character>();
		stepList.add('F');
		stepList.add('P');
		stepList.add('F');
		stepList.add('R');
		stepList.add('R');
		stepList.add('F');
		stepList.add('P');
		
		ArrayList<Character> expected = new ArrayList<Character>();
		expected.add('F');
		expected.add('P');
		expected.add('F');
		expected.add('I');
		expected.add('F');
		expected.add('P');
		
		assertEquals(expected, IdentifyPatternInStepArray.transformStepArray(stepList));
	}
	

}
