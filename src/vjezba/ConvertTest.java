package vjezba;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConvertTest {

	Convert converter;
	double unit;

	@Before
	public void pre() {
		converter = new Convert();

	}

	@After
	public void posle() {
		converter = null;
		unit = 0;
	}

	@Test
	public void poundUKiloTest() {
		unit = converter.poundUKilo(5);
		assertEquals(11.0231, unit, 3);
	}

	@Test
	public void kiloUPoundTest() {
		unit = converter.kiloUPound(3);
		assertEquals(1.3607, unit, 3);
	}

	@Test
	public void cmUInchTest() {
		unit = converter.cmUInch(3);
		assertEquals(1.1811, unit, 3);
	}

	@Test
	public void inchUCmTest() {
		unit = converter.inchUCm(2);
		assertEquals(4.08, unit, 3);
	}

	@Test
	public void cUFTest() {
		unit = converter.cUF(5);
		assertEquals(41, unit, 3);
	}

	@Test
	public void fUC() {
		unit = converter.fUC(41);
		assertEquals(5, unit, 3);
	}
}
