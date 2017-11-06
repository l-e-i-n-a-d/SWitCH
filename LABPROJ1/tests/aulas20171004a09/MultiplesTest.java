package aulas20171004a09;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Test;

import algoritmia.Multiples;

//Teste os resultados das fun��es com os conjuntos de valores que considere apropriados.

public class MultiplesTest {
	
	// To get 100% testing coverage needed to test the default constructor method
	@Test
	public void constructMultiplesObjTest() {
		Multiples multiple = new Multiples();
		assert (multiple instanceof Multiples);
	}

	@Test
	public void multiple3Test() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = Multiples.multiple3(0, 10);

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(3);
		expected.add(6);
		expected.add(9);

		assertEquals(expected, arr);

		arr = Multiples.multiple3(10, 20);

		expected = new ArrayList<>();
		expected.add(12);
		expected.add(15);
		expected.add(18);

		assertEquals(expected, arr);
	}

	@Test
	public void MultipleNumTest() {
		ArrayList<Integer> arr = new ArrayList<>();
		arr = Multiples.multipleNum(0, 10, 4);

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(4);
		expected.add(8);

		assertEquals(expected, arr);

		arr = Multiples.multipleNum(10, 20, 3);

		expected = new ArrayList<>();
		expected.add(12);
		expected.add(15);
		expected.add(18);

		assertEquals(expected, arr);

	}

	@Test
	public void ultiple3Or5Test() {
		ArrayList<Integer> arr = new ArrayList<>();
		arr = Multiples.multiple3Or5(0, 10);

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(3);
		expected.add(5);
		expected.add(6);
		expected.add(9);
		expected.add(10);

		assertEquals(expected, arr);

		arr = Multiples.multiple3Or5(10, 20);

		expected = new ArrayList<>();
		expected.add(10);
		expected.add(12);
		expected.add(15);
		expected.add(18);
		expected.add(20);

		assertEquals(expected, arr);
	}

	@Test
	public void MultipleNum1OrNum2Test() {

		ArrayList<Integer> arr = new ArrayList<>();
		arr = Multiples.multipleNum1OrNum2(0, 10, 3, 5);

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(3);
		expected.add(5);
		expected.add(6);
		expected.add(9);
		expected.add(10);

		assertEquals(expected, arr);

		arr = Multiples.multipleNum1OrNum2(10, 20, 3, 5);

		expected = new ArrayList<>();
		expected.add(10);
		expected.add(12);
		expected.add(15);
		expected.add(18);
		expected.add(20);

		assertEquals(expected, arr);

	}
	
	@Test
	public void MultipleNum1OrNum2DescTest() {

		ArrayList<Integer> arr = new ArrayList<>();
		arr = Multiples.multipleNum1OrNum2Desc(0, 10, 3, 5);

		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(10);
		expected.add(9);
		expected.add(6);
		expected.add(5);
		expected.add(3);

		assertEquals(expected, arr);

		arr = Multiples.multipleNum1OrNum2Desc(10, 20, 3, 5);

		expected = new ArrayList<>();
		expected.add(20);
		expected.add(18);
		expected.add(15);
		expected.add(12);
		expected.add(10);

		assertEquals(expected, arr);

	}
}
