package unit.binTree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
	
	private Node<? extends BinTreeModel> node;
	private Mitarbeiter value = new Mitarbeiter(10);
	private Mitarbeiter leftValue = new Mitarbeiter(5);
	private Mitarbeiter rightValue = new Mitarbeiter(15);
	
	@Before
	public void before() {
		Node<Mitarbeiter> leftNode = new Node<Mitarbeiter>(null, null, leftValue);
		Node<Mitarbeiter> rightNode = new Node<Mitarbeiter>(null, null, rightValue);
		node = new Node<Mitarbeiter>(leftNode, rightNode, value);
	}
	
	@Test
	public void shouldAdd() {
		Node<? extends BinTreeModel> newNode = new Node<BinTreeModel>(null, null, new Mitarbeiter(14));
		node.add(node, newNode);
		assertTrue(node.getRight().getLeft().getValue().getId() == 14);
	}
	
	@Test
	public void shouldGetValue() {
		assertTrue(value == node.getValue());
	}
	
	@Test
	public void shouldGetLeftNode() {
		assertTrue(leftValue == node.getLeft().getValue());
	}
	
	@Test
	public void shouldGetRightNode() {
		assertTrue(rightValue == node.getRight().getValue());
	}
	
}
