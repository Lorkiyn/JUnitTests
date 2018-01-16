package unit.stack;

public class StackElement<T> {

	private T value;
	private StackElement<T> next;

	public StackElement(T value, StackElement<T> next) {
		super();
		this.value = value;
		this.next = next;
	}
	
	public StackElement(T value) {
		super();
		this.value = value;
		this.next = null;
	}

	public T getValue() {
		return value;
	}
	
	public StackElement<T> next() {
		return next;
	}

	public void setNext(T value) {
		this.next = new StackElement<T>(value);
	}
	
	public void setNext(StackElement<T> next) {
		this.next = next;
	}
	
	public boolean hasNext() {
		if (next == null) {
			return false;
		} else {
			return true;
		}
	}
}
