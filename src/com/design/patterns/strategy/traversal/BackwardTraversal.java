package com.design.patterns.strategy.traversal;

import com.design.patterns.strategy.structure.LinkedList;
import com.design.patterns.strategy.structure.Structure;
import com.design.patterns.strategy.structure.LinkedList.Node;

public class BackwardTraversal extends BaseTraversal<LinkedList> {

	public BackwardTraversal(Structure structure) {
		super(structure);
	}

	@Override
	public void traverse() {
		StringBuilder builder = new StringBuilder("LL Backward traversal : ");
		traverse(getStructure().getTail(), builder);
		System.out.println(builder.toString());

	}

	private void traverse(Node node, StringBuilder builder) {
		Node current = node;
		builder.append(current.getItem() + ", ");
		while (current.getPrev() != null) {
			current = current.getPrev();
			builder.append(current.getItem() + ", ");
		}
	}

}
