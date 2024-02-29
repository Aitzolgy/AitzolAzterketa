package test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import modelo.LibZerrenda;
import modelo.Liburua;

public class libZerrendaTest {

	LibZerrenda libZerrenda;
	Liburua liburua;
	Liburua liburua2;
	Liburua liburua3;
	@Before
	public void before() {
	
		libZerrenda = new LibZerrenda();
		liburua = new Liburua("tantto","980" , "kepa");
		liburua2 = new Liburua("hunter","900" , "aitzol");
		liburua3 = new Liburua("lagrimas","200" , "oier");
	}
	
	@Test
	public void testGehitu() {
		
		libZerrenda.gehitu(liburua);
		
		assertEquals(libZerrenda.bilatuisbn("980"),0);
		
	}
	
	
	@Test
	public void testBilatuIsbn() {
		
		libZerrenda.gehitu(liburua);
		
		assertEquals(libZerrenda.bilatuisbn("980"),0);
		
	}
	
	
	@Test
	public void testBilatuTit() {
		
		libZerrenda.gehitu(liburua);
		
		assertEquals(libZerrenda.bilatutit("tantto"),0);
		
	}
	
	
	
	@Test
	public void testBeteta() {
		
		libZerrenda.gehitu(liburua);
		libZerrenda.gehitu(liburua2);
		libZerrenda.gehitu(liburua3);
		
		assertTrue(libZerrenda.beteta());
		
	}
	
	@Test
	public void testEzabatu() {
		
		libZerrenda.gehitu(liburua);
		libZerrenda.ezabatu("980");
		assertNull(libZerrenda.eskuratu(libZerrenda.bilatutit("tantto")));
		
	}
	
	@Test
	public void testlzerrendaEskuratu() {
		libZerrenda.gehitu(liburua);
		assertEquals("Liburua [izenburua=tantto, isbn=980, idazlea=kepa]",libZerrenda.lzerrendaEskuratu());
	}
	
	
	
	@Test
	public void testEskuratu() {
		
		libZerrenda.gehitu(liburua);
		
		assertEquals(liburua,libZerrenda.eskuratu(libZerrenda.bilatutit("tantto")));
	}
	
	
	
	
	
}
