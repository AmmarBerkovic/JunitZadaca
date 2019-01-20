package vjezba;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatematikaTest {
	Matematika math;
	double prom;

	@Before
	public void prije() {
		math = new Matematika();
	}

	@After
	public void posle() {
		math = null;
		prom = 0;
	}

	@Test
	public void mnozenjeTest() {
		prom = math.mnozenje(5, 6);
		assertEquals(30, prom, 3);
		;
	}

	@Test
	public void sabiranjeTest() {
		prom = math.sabiranje(5, 6);
		assertEquals(11, prom, 3);
	}

	@Test
	public void oduzimanjeTest() {
		prom = math.oduzimanje(6, 5);
		assertEquals(1, prom, 3);
	}

	@Test
	public void dijeljenjeTest() {
		prom = math.dijeljenje(15, 5);
		assertEquals(3, prom, 3);
	}

}
