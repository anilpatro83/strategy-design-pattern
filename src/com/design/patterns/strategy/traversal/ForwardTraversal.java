package com.design.patterns.strategy.traversal;

import com.design.patterns.strategy.structure.LinkedList;
import com.design.patterns.strategy.structure.LinkedList.Node;
import com.design.patterns.strategy.structure.Structure;

public class ForwardTraversal extends BaseTraversal<LinkedList> {

	public ForwardTraversal(Structure structure) {
		super(structure);
	}

	@Override
	public void traverse() {
		StringBuilder builder = new StringBuilder("LL Forward traversal : ");
		traverse(getStructure().getHead(), builder);
		System.out.println(builder.toString());

	}

	private void traverse(Node node, StringBuilder builder) {
		Node current = node;
		builder.append(current.getItem() + ", ");
		while (current.getNext() != null) {
			current = current.getNext();
			builder.append(current.getItem() + ", ");
		}
	}

}
