package unit.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	private LinkedList li;
	
	@Before
	public void before() {
		li = new LinkedList();
	}
	
	@Test
	public void shouldCreateLinkedList() {
		assertNotNull(new LinkedList());
	}
	
	@Test
	public void shouldGetFirstElementValue() {
		li.add("Hallo");
		assertNotNull(li.next().getValue());
	}
	
	@Test
	public void shouldDeleteAnElementWithIndex() {
		li.add("Hallo1");
		li.remove(0);
		assertNull(li.get(0));
	}
	
	@Test
	public void shouldAddListElement() {
		li.add("Hallo");
		assertEquals("Hallo", li.get(0).getValue());
	}
	
	@Test
	public void shouldAddElementBefore() {
		li.add("Hallo1");
		li.addBefore(0, "Hallo0");
		assertEquals("Hallo0", li.get(0).getValue());
	}
	
	@Test
	public void shouldAddElementAfter() {
		li.add("Hallo1");
		li.addAfter(0, "Hallo0");
		assertEquals("Hallo0", li.get(1).getValue());
	}
	
	@Test
	public void shouldAddElementOnFront() {
		li.add("Hallo1");
		li.addFront("Hallo0");
		assertEquals("Hallo0", li.get(0).getValue());
	}
	
	@Test
	public void shouldCheckIfListIsEmpty() {
		assertTrue(li.isEmpty());
	}
	
	@Test
	public void shouldFindElementFirstElementThatEquals() {
		li.add("Hallo2");
		assertEquals("Hallo2", li.find("Hallo2").getValue());
	}
	
	@Test
	public void shouldReturnFirstElement() {
		li.add("Hallo");
		li.add("Hallo1");
		assertEquals("Hallo", li.first());
	}
	
	@Test
	public void shouldReturnLastElement() {
		li.add("Hallo");
		li.add("Hallo1");
		assertEquals("Hallo1", li.last());
	}
	
	@Test
	public void shouldReturnNull() {
		assertEquals(null, li.get(10));
	}
	
	@Test
	public void shouldChainTwoLinkedLists() {
		LinkedList li2 = new LinkedList();
		li.add("Hallo ");
		li2.add("Welt!");
		li.chain(li2);
		assertEquals("Welt!", li.last());
	}
	
}
