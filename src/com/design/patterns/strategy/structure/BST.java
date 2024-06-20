package com.design.patterns.strategy.structure;

import com.design.patterns.strategy.traversal.Traversal;

public class BST implements Structure {

	private Traversal traversal;

	@Override
	public void setTraversal(Traversal traversal) {
		this.traversal = traversal;
	}

	@Override
	public void traverse() {
		this.traversal.traverse();
	}

	@Override
	public void addItem(Object item) {
		if (root == null) {
			this.root = addNode(root, (int) item);
		} else {
			addNode(root, (int) item);
		}
	}

	public class Node {
		private int item;
		Node left;
		Node right;

		public Node(int item) {
			this.item = item;
		}

		public Node(int item, Node left, Node right) {
			this(item);
			this.left = left;
			this.right = right;
		}

		public int getItem() {
			return item;
		}

		public void setItem(int item) {
			this.item = item;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
	}

	private Node root;

	Node addNode(Node node, int item) {
		if (node == null) {
			node = new Node(item);
		} else if (item < node.getItem())
			node.setLeft(addNode(node.getLeft(), item));
		else if (item > node.getItem())
			node.setRight(addNode(node.getRight(), item));
		return node;
	}

	public Node getRoot() {
		return root;
	}
}
