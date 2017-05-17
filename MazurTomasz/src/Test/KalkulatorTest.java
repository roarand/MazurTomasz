package Test;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.*;
public class KalkulatorTest {
	
	@Test
	public void testDodawanie() throws Exception{
		
		ONP wyrazenie = new ONP();
		String rownanie = wyrazenie.tworzONP("3+2+8=");
		Kalkulator kalkulator = new Kalkulator(rownanie);
		assertEquals(13.0,kalkulator.oblicz(),0);
	}
	
	@Test
	public void testOdejmowanie() throws Exception{
		
		ONP wyrazenie = new ONP();
		String rownanie = wyrazenie.tworzONP("15+1-3=");
		Kalkulator kalkulator = new Kalkulator(rownanie);
		assertEquals(13.0,kalkulator.oblicz(),0);
	}
	
	@Test
	public void testMnozenie() throws Exception{
		
		ONP wyrazenie = new ONP();
		String rownanie = wyrazenie.tworzONP("3+4*5=");
		Kalkulator kalkulator = new Kalkulator(rownanie);
		assertEquals(23.0,kalkulator.oblicz(),0);
	}
	
	@Test
	public void testDzielenie() throws Exception{
		
		ONP wyrazenie = new ONP();
		String rownanie = wyrazenie.tworzONP("5/2=");
		Kalkulator kalkulator = new Kalkulator(rownanie);
		assertEquals(2.5,kalkulator.oblicz(),0);
	}
	
	@Test
	public void testPotegowanie() throws Exception{
		
		ONP wyrazenie = new ONP();
		String rownanie = wyrazenie.tworzONP("5^3-8=");
		Kalkulator kalkulator = new Kalkulator(rownanie);
		assertEquals(117.0,kalkulator.oblicz(),0);
	}
	
	@Test
	public void testPierwiastek() throws Exception{
		
		ONP wyrazenie = new ONP();
		String rownanie = wyrazenie.tworzONP("v2=");
		Kalkulator kalkulator = new Kalkulator(rownanie);
		assertEquals(1.41,kalkulator.oblicz(),0.01);
	}
	

}
