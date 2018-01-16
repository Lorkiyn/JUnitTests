package unit.stack;

public class Stack<T> {

	private StackElement<T> anchor;
	
	public Stack() {
		super();
	}

	public T peek() {
		if (anchor == null) {
			return null;
		}
		return anchor.getValue();
	}
	
	public void push(T value) {
		StackElement<T> currAnchor = anchor;
		StackElement<T> newAnchor = new StackElement<T>(value);
		newAnchor.setNext(currAnchor);
		anchor = newAnchor;
	}

	public T pop() {
		if (anchor == null) {
			return null;
		}
		StackElement<T> elem = anchor;
		anchor = anchor.next();
		return elem.getValue();
	}

	public boolean isEmpty() {
		if (anchor == null) {
			return true;
		}
		return false;
	}

	public void clear() {
		anchor = null;
	}

	public int capacity() {
		if (anchor == null) {
			return 0;
		}
		int capacity = 1;
		StackElement<T> elem = anchor;
		while(elem.hasNext()) {
			capacity++;
			elem = anchor.next();
		}
		return capacity;
	}

	public void addAll(T[] values) {
		for(T value : values) {
			push(value);
		}
	}
	
	
}
