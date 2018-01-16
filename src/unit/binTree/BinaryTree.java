package unit.binTree;

public class BinaryTree<T extends BinTreeModel> {

	private Node<? extends BinTreeModel> root = null;

	public BinaryTree() {
		super();
	}

	public BinaryTree(Node<T> root) {
		this.root = root;
	}

	public Node<? extends BinTreeModel> getRoot() {
		return root;
	}

	public int getSize() {
		int sum = 0;
		if (root != null) {
			sum++;
			sum += root.getCount();
		}
		return sum;
	}

	public int getDepth() {
		int depth = 0;
		if (root != null) {
			depth++;
			depth += root.getDepth();
		}
		return depth;
	}
	
	public void sort() {
		root = root.sort();
	}
	
	public Node<? extends BinTreeModel> find(int id) {
		if (root == null) 
			return null;
		return root.find(id);
	}

	public boolean isNotEmpty() {
		if (root == null) {
			return false;
		}
		return true;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public void add(T value) {
		Node<? extends BinTreeModel> node = new Node<BinTreeModel>(null, null, value);
		add(node);
		sort();
	}

	public void add(Node<? extends BinTreeModel> node) {
		if (root == null) {
			root = node;
		} else {
			root.add(root, node);
		}
	}
}
