package com.design.patterns.strategy.structure;

import com.design.patterns.strategy.traversal.Traversal;

public class LinkedList implements Structure {

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
		addNode((int) item);
	}

	public class Node {
		private int item;
		private Node next;
		private Node prev;

		public Node(int item) {
			setItem(item);
		}

		public int getItem() {
			return item;
		}

		public void setItem(int item) {
			this.item = item;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}
	}

	private Node head;
	private Node tail;

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	private void addNode(int item) {
		Node newNode = new Node(item);
		if (this.head == null) {
			setHead(newNode);
			setTail(newNode);
		} else {
			Node current = getHead();
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
			newNode.setPrev(current);
			setTail(newNode);
		}
	}

}
