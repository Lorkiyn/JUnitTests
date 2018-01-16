
package unit.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackElementTest {

	private StackElement<String> le;
	
	@Before
	public void before() {
		le = new StackElement<String>("Hallo");	
	}
	
	@Test
	public void shouldCreateStackElement() {
		assertNotNull(le);
	}
	
	@Test
	public void shouldGetValue() {
		assertEquals("Hallo", le.getValue());
	}
	
	@Test
	public void shouldGetNext() {
		le.setNext("Welt!");
		assertEquals("Welt!", le.next().getValue());
	}
	
	@Test
	public void shouldSetNext() {
		le.setNext("Hallo");
		assertNotNull(le.hasNext());
	}
	
	@Test
	public void shouldSetNextWithObject() {
		StackElement<String> elem = new StackElement<String>("Hallo");
		le.setNext(elem);
		assertNotNull(le.hasNext());
	}
	
	@Test
	public void shouldReturnNull() {
		assertNull(le.next());
	}
	
	@Test
	public void shouldRetunTrue() {
		le.setNext("Hallo");
		assertTrue(le.hasNext());
	}
}
