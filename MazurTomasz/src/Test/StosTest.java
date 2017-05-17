package Test;

import static org.junit.Assert.*;
import org.junit.Test;

import Program.*;

public class StosTest {

	
	@Test
	public void TestCzyPusty(){
		
		Stos<String> s = new Stos<>();
		assertTrue(s.czyPusty());
		s.push("element");
		assertEquals(false,s.czyPusty());
		
	}
	
	@Test(expected = Exception.class)
	public void testTop() throws Exception{
		
		Stos<String> s = new Stos<>();
		s.peek();
	}
	
	@Test(expected = Exception.class)
	public void testPop() throws Exception{
		
		Stos<String> s = new Stos<>();
		s.pop();
	}
	
	@Test 
	public void testPush() throws Exception{
		Stos<String> s = new Stos<>();
		String element = "element";
		s.push(element);
		assertEquals(element,s.pop());
		
		
	}
	
	@Test(expected = Exception.class)
	public void testStos() throws Exception{
		
		Stos<String> s = new Stos<>();
		String element = "testowy";
		s.push(element);
		
		for(int i=0; i<5; i++)
			assertEquals(element,s.peek());
		
		assertEquals(false,s.czyPusty());
		assertSame(element,s.pop());
		assertTrue(s.czyPusty());
		s.pop();
		
	}
	
	@Test
	public void testStos2() throws Exception{
		
		Stos<String> s = new Stos<>();
		
		for(int i=0; i<4; i++)
			s.push("el"+i);
		for(int i=3; i>=0; i--)
			assertEquals("el"+i,s.pop());
		assertEquals(true,s.czyPusty());
		s.push(null);
		assertSame(null,s.pop());
		try{
		s.pop();
		}catch(Exception e){
			assertTrue(s.czyPusty());
			s.push("element");
			assertFalse(s.czyPusty());
		}
		
	}
}
