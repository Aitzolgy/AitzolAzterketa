package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import modelo.*;



public class LiburuaTest {

	Liburua liburua;
	Liburua liburua2;
	
	@Before
	public void before() {
		
		 liburua = new Liburua("tantto","980" , "kepa");
		 liburua2 = new Liburua();
			
	}
	
	
	@Test
	public void testLiburuaEraiki() {
		
		assertEquals(liburua.getidazlea(),"kepa");
		
	}
	
	@Test
	public void testLiburua1Eraiki() {
		
		assertEquals(liburua2.getisbn(),"XXXX");
	}
	
	
	@Test
	public void testGeterSetterIsbn() {
		liburua.setisbn("cc");
		assertEquals("cc",liburua.getisbn());
	}
	
	@Test
	public void testGeterSetterIdazlea() {
		liburua.setidazlea("oier");
		assertEquals("oier",liburua.getidazlea());
	}
	
	@Test
	public void testGeterSetterIzenburua() {
		liburua.setizenburua("lagrimas");
		assertEquals("lagrimas",liburua.getizenburua());
	}
	
	@Test
	public void testToString() {
		System.out.println(liburua);
		assertEquals(liburua.toString(),"Liburua [izenburua=tantto, isbn=980, idazlea=kepa]");	
	}
	
	
	

}
