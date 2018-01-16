package unit.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	Stack<String> stack;
	
	@Before
	public void before() {
		stack = new Stack<String>();
	}
	
	@Test
	public void shouldCreateStack() {
		assertNotNull(stack);
	}
	
	@Test
	public void shouldPushElement() {
		stack.push("Hallo");
		assertTrue(!stack.isEmpty());
	}
	
	@Test
	public void shouldPeek() {
		stack.push("Hallo");
		assertEquals("Hallo", stack.peek());
	}
	
	@Test
	public void shouldPeekNull() {
		assertEquals(null, stack.peek());
	}

	@Test
	public void shouldPop() {
		stack.push("Hallo");
		assertEquals("Hallo", stack.pop());
	}
	
	@Test
	public void shouldPopNull() {
		stack.pop();
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void shouldClearStack() {
		stack.push("Hallo ");
		stack.push("Welt!");
		stack.clear();
	}
	
	@Test
	public void shouldReturnCapacity() {
		stack.push("Hallo ");
		stack.push("Welt!");
		assertTrue(2 == stack.capacity());
	}
	
	@Test
	public void shouldAddArray() {
		String[] values = { "Hallo", "wie", "gehts" };
		stack.addAll(values);
		assertEquals("gehts", stack.peek());
	}	
}
