package unit.binTree;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

	private BinaryTree<Mitarbeiter> binTree;
	private Node<Mitarbeiter> root;
	
	@Before
	public void before() {
		Node<Mitarbeiter> node1 = new Node<Mitarbeiter>(null, null, new Mitarbeiter(1));
		Node<Mitarbeiter> node2 = new Node<Mitarbeiter>(node1, null, new Mitarbeiter(2));
		Node<Mitarbeiter> node3 = new Node<Mitarbeiter>(node2, null, new Mitarbeiter(3));
		Node<Mitarbeiter> node4 = new Node<Mitarbeiter>(node3, null, new Mitarbeiter(4));
		Node<Mitarbeiter> node6 = new Node<Mitarbeiter>(null, null, new Mitarbeiter(6));
		Node<Mitarbeiter> node8 = new Node<Mitarbeiter>(node6, null, new Mitarbeiter(8));

		root = new Node<Mitarbeiter>(node4, node8, new Mitarbeiter(5));
		binTree = new BinaryTree<Mitarbeiter>(root);	
	}
	
	@Test
	public void shouldFind() {
		assertTrue(binTree.find(8).getValue().getId() == 8);
	}
	
	@Test
	public void shouldPrintBinTree() {
		//System.out.println(binTree.toString());
	}
	
	@Test
	public void test() {
		binTree.sort();
		List<Node<? extends BinTreeModel>> list = Collections.singletonList(binTree.getRoot());
		System.out.println(list);
	}
	
	@Test
	public void shouldAddNode() {
		Mitarbeiter m = new Mitarbeiter(10);
		binTree.sort();
		assertTrue(4 == binTree.getRoot().getValue().getId());
		binTree.add(m);
		assertTrue(5 == binTree.getRoot().getValue().getId()); //complete rotation of tree because of arithmetic value is 4,75
		assertTrue(10 == binTree.getRoot().getRight().getRight().getValue().getId());
	}
	
	@Test
	public void shouldSort() {		
		assertTrue(5 == binTree.getRoot().getValue().getId());
		assertTrue(6 == binTree.getRoot().getRight().getLeft().getValue().getId());
		assertNull(binTree.getRoot().getRight().getRight());
		binTree.sort();
		assertTrue(4 == binTree.getRoot().getValue().getId());
		assertTrue(5 == binTree.getRoot().getRight().getLeft().getValue().getId());
		assertTrue(8 == binTree.getRoot().getRight().getRight().getValue().getId());	
	}
	
	@Test
	public void shouldInitializeEmptyTree() {
		BinaryTree<Mitarbeiter> emptyTree = new BinaryTree<Mitarbeiter>();
		assertNotNull(emptyTree);
	}
	
	@Test
	public void shouldGetRoot() {
		assertEquals(root, binTree.getRoot());
	}
	
	@Test
	public void shouldTestIsEmpty() {
		BinaryTree<Mitarbeiter> emptyTree = new BinaryTree<Mitarbeiter>();
		assertTrue(!emptyTree.isNotEmpty());
	}
	
	@Test
	public void shouldSetRoot() {
		BinaryTree<Mitarbeiter> emptyTree = new BinaryTree<Mitarbeiter>();
		emptyTree.setRoot(root);
		assertEquals(root, emptyTree.getRoot());
	}
	
	@Test
	public void shouldCountNodes() {
		assertTrue(7 == binTree.getSize());
	}
	
	@Test
	public void shouldReturnDepthOfTree() {
		assertTrue(5 == binTree.getDepth());
	}

}
