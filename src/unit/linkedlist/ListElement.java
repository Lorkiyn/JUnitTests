package unit.linkedlist;

public class ListElement {

	private String value;
	private ListElement tail;

	public ListElement(String value, ListElement tail) {
		super();
		this.value = value;
		this.tail = tail;
	}

	public ListElement(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setTail(String value) {
		this.tail = new ListElement(value);
	}

	public void setTail(ListElement listElement) {
		this.tail = listElement;
	}
	
	public ListElement getTailIfNotNull() {
		if (tail == null) {
			return this;
		}
		return tail.getTailIfNotNull();
	}

	public ListElement getListElementOfIndex(int incremented, int searched) {
		if (incremented == searched) {
			return this;
		} else {
			if (tail != null) {
				incremented++;
				return tail.getListElementOfIndex(incremented, searched);
			}
			return null;
		}
	}
	
	public boolean hasNext() {
		if (tail == null) {
			return false;
		} else {
			return true;
		}
	}

	public ListElement next() {
		return tail;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
