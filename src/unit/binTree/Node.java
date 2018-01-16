package unit.binTree;

public class Node<T extends BinTreeModel> {

	private T value = null;
	private Node<? extends BinTreeModel> leftNode = null;
	private Node<? extends BinTreeModel> rightNode = null;

	public Node(Node<? extends BinTreeModel> leftNode, Node<? extends BinTreeModel> rightNode, T value) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setLeft(Node<? extends BinTreeModel> node) {
		leftNode = node;
	}

	public void setRight(Node<? extends BinTreeModel> node) {
		rightNode = node;
	}

	public Node<? extends BinTreeModel> getLeft() {
		return leftNode;
	}

	public Node<? extends BinTreeModel> getRight() {
		return rightNode;
	}

	public Node<? extends BinTreeModel> find(int id) {
		if (id < getValue().getId() && leftNode != null) {
			return leftNode.find(id);
		}

		if (id > getValue().getId() && rightNode != null) {
			return rightNode.find(id);
		}

		return this;
	}

	public Node<? extends BinTreeModel> sort() {
		double count = getCount() + 1;
		double sum = getSum();

		int arith = (int) Math.round(sum/count);
		Node<? extends BinTreeModel> node = find(arith);

		if (node.getValue().getId() < getValue().getId()) {
			node.setRight(this);
			if (leftNode != node) {
				leftNode.rightNode = null;
				node.setLeft(leftNode);				
			}
			leftNode = null;

		} else if (node.getValue().getId() > getValue().getId()) {
			node.setLeft(this);
			if (rightNode != node) {
				rightNode.leftNode = null;
				node.setRight(rightNode);				
			}
			rightNode = null;
		}			

		if (node.leftNode != null) {
			node.leftNode = node.leftNode.sort();
		}
		
		if (node.rightNode != null) {
			node.rightNode = node.rightNode.sort();			
		}

		return node;
	}
	
	public void add(Node<? extends BinTreeModel> root, Node<? extends BinTreeModel> node) {
		if (root != null) {
			if (node.getValue().getId() < root.getValue().getId()) {
				if (root.getLeft() == null) {
					root.setLeft(node);
				} else {
					add(root.getLeft(), node);
				}
			} else {
				if (root.getRight() == null) {
					root.setRight(node);
				} else {
					add(root.getRight(), node);
				}
			}
		}
	}

//	private int find(int old, int search) {
//		int val = Math.abs(search - getValue().getId());
//
//		if (search == getValue().getId()) {
//			return getValue().getId();
//		}
//
//		if (val < old || old == 0) {
//			old = val;
//		}
//
//		if (leftNode != null) {
//			return leftNode.find(old, search); 
//		}
//
//		if (rightNode != null) {
//			return rightNode.find(old, search); 
//		}
//
//		return getValue().getId();
//	}

	public int getSum() {		
		int sum = getValue().getId();

		if (leftNode != null) {
			sum += leftNode.getSum();
		}
		if (rightNode != null) {
			sum += rightNode.getSum();
		}
		return sum;
	}

	public int getCount() {
		int count = 0;
		if (leftNode != null) {
			count += leftNode.getCount() + 1;
		}
		if (rightNode != null) {
			count += rightNode.getCount() + 1;
		}
		return count;
	}

	private boolean hasChildren() {
		if (leftNode != null || rightNode != null) {
			return true;
		}
		return false;
	}

	public int getDepth() {
		int leftDepth = 0;
		int rightDepth = 0;

		if (leftNode != null) {
			leftDepth++;
			if (leftNode.hasChildren()) {
				leftDepth += leftNode.getDepth();
			}
		}

		if (rightNode != null) {
			rightDepth++;
			if (rightNode.hasChildren()) {
				rightDepth += rightNode.getDepth();
			}
		}

		return leftDepth < rightDepth ? rightDepth : leftDepth;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}

}
