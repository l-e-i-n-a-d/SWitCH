package aula20171107;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AdressTest {

	Adress adress = new Adress("Rua de S. Tomé", "4250-541", "Porto", "Portugal");

	@Test
	public void testAdressConstructor() {
		assertTrue(adress instanceof Adress);
	}

	@Test
	public void testGetStreetName() {
		assertEquals("Rua de S. Tomé", adress.getStreetName());
	}

	@Test
	public void testSetStreetName() {
		adress.setStreetName("Rua do Lado");
		assertEquals("Rua do Lado", adress.getStreetName());

	}

	@Test
	public void testGetPostalCode() {
		assertEquals("4250-541", adress.getPostalCode());
	}

	@Test
	public void testSetPostalCode() {
		adress.setPostalCode("4250-250");
		assertEquals("4250-250", adress.getPostalCode());
	}

	@Test
	public void testGetCity() {
		assertEquals("Porto", adress.getCity());
	}

	@Test
	public void testSetCity() {
		adress.setCity("Viana");
		assertEquals("Viana", adress.getCity());
	}

	@Test
	public void testGetCountry() {
		assertEquals("Portugal", adress.getCountry());
	}

	@Test
	public void testSetCountry() {
		adress.setCountry("Brasil");
		assertEquals("Brasil", adress.getCountry());

	}

}
