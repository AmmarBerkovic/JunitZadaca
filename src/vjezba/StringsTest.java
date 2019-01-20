package vjezba;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringsTest {
	Strings str;
	int broj;
	String poruka;
	@Before
	public void pre() {
		str=new Strings();
	}
	@After
	public void posle() {
		broj=0;
		poruka="";
		str=null;
	}
	
	@Test
	public void duzTest() {
		broj=str.duz("Duzina");
		assertEquals(6, broj);
	}
	@Test
	public void parniTest() {
		poruka=str.parni("Ammar");
		assertEquals("ma",poruka);
	}
	@Test
	public void neparniTest() {
		poruka=str.neparni("Ammar");
		assertEquals("Amr",poruka);
	}
	@Test
	public void upTest() {
		poruka=str.up("Ammar");
		assertEquals("A",poruka);
	}
	@Test
	public void lowTest() {
		poruka=str.low("Ammar");
		assertEquals("mmar",poruka);
	}
	@Test
	public void nonCharsTest() {
		poruka=str.nonChars("Ammar!");
		assertEquals("!",poruka);
	}
}
