package com.design.patterns.strategy.traversal;

import com.design.patterns.strategy.structure.BST;
import com.design.patterns.strategy.structure.BST.Node;
import com.design.patterns.strategy.structure.Structure;

public class InOrderTraversal extends BaseTraversal<BST> {
	
	public InOrderTraversal(Structure structure) {
		super(structure);
	}

	@Override
	public void traverse() {
		StringBuilder builder = new StringBuilder("BST Inorder traversal : ");
		traverse(getStructure().getRoot(), builder);
		System.out.println(builder.toString());
	}

	private void traverse(Node node, StringBuilder builder) {
		if (node != null) {
			traverse(node.getLeft(), builder);
			builder.append(node.getItem() + ", ");
			traverse(node.getRight(), builder);
		}
	}
}
