
package unit.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListElementTest {

	private ListElement le;
	
	@Before
	public void before() {
		le = new ListElement("Hallo");	
	}
	
	@Test
	public void shouldCreateListElement() {
		assertNotNull(le);
	}
	
	@Test
	public void shouldGetValue() {
		assertEquals(le.getValue(), "Hallo");
	}
	
	@Test
	public void shouldGetTail() {
		le.setTail("Welt!");
		assertNotNull(le.next());
	}
	
	@Test
	public void shouldReturnNull() {
		assertNull(le.next());
	}
	
	@Test
	public void shouldRetunTrue() {
		le.setTail("Hallo");
		assertTrue(le.hasNext());
	}
	
	@Test
	public void shouldGiveTail() {
		le.setTail("Hallo");
		assertEquals("Hallo", le.next().getValue());
	}
	
	@Test
	public void shouldReturnLastElement() {
		le.setTail("Welt");
		le.next().setTail("!");
		assertEquals(le.getTailIfNotNull().getValue(), "!");
	}
	
	@Test
	public void shouldReturnIfGivenEqualsIncrementedNumber() {
		le.setTail("Welt!");
		int incremented = 1;
		int searched = 2;
		assertEquals(le.getListElementOfIndex(incremented, searched), le.next());
	}
	
}
