package unit.linkedlist;

public class LinkedList {

	private ListElement anchor;

	public LinkedList(ListElement anchor) {
		super();
		this.anchor = anchor;
	}
	
	public LinkedList() {
		super();
	}

	public ListElement next() {
		return anchor;
	}

	public ListElement get(int i) {
		if (i == 0) {
			return anchor;
		}
		return anchor.getListElementOfIndex(0, i);
	}
	
	public void add(String value) {
		if (anchor == null) {
			anchor = new ListElement(value);
		} else {
			anchor.getTailIfNotNull().setTail(value);
		}
	}

	public void addFront(String string) {
		addBefore(0, string);
	}
	
	public void addBefore(int i, String string) {
		ListElement newAnchor = new ListElement(string);
		if (i == 0) {
			newAnchor.setTail(next());
			anchor = newAnchor;
		} else {
			newAnchor.setTail(get(i));
			get(i-1).setTail(newAnchor);
		}
	}

	public void addAfter(int i, String string) {
		ListElement newAnchor = new ListElement(string);
		newAnchor.setTail(get(i+1));
		get(i).setTail(newAnchor);
	}

	public void remove(int i) {
		if (i == 0) {
			anchor = anchor.next();
		} else {
			anchor.getListElementOfIndex(0, i-1).setTail(anchor.getListElementOfIndex(0, i+1));			
		}
	}

	public boolean isEmpty() {
		if (anchor == null) {
			return true;
		}
		return false;
	}

	public ListElement find(String string) {
		if (isEmpty()) {
			return null;
		}
		ListElement elem = anchor;
		ListElement oldElem = elem;
		do {
			if (elem.getValue().equals(string)) {
				return elem;
			} else {
				oldElem = elem;
				elem = elem.next();
			}
		} while (oldElem.hasNext());
		return null;
	}

	public String first() {
		return anchor.getValue();
	}
	
	public String last() {
		return anchor.getTailIfNotNull().getValue();
	}

	public void chain(LinkedList li2) {
		if (li2.isEmpty()) {
			return;
		}
		ListElement elem = li2.next();
		ListElement oldElem = elem;
		do {
			add(elem.getValue());
			oldElem = elem;
			elem = elem.next();
		} while (oldElem.hasNext());
	}
	
	public void print() {
		if (isEmpty()) {
			return;
		}
		ListElement elem = anchor;
		ListElement oldElem = elem;
		do {
			System.out.println(elem);
			oldElem = elem;
			elem = elem.next();
		} while (oldElem.hasNext());
	}
	
}
