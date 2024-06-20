package com.design.patterns.strategy.traversal;

import com.design.patterns.strategy.structure.BST;
import com.design.patterns.strategy.structure.Structure;
import com.design.patterns.strategy.structure.BST.Node;

public class PostOrderTraversal extends BaseTraversal<BST> {
	
	public PostOrderTraversal(Structure structure) {
		super(structure);
	}

	@Override
	public void traverse() {
		StringBuilder builder = new StringBuilder("BST Postorder Traversal : ");
		traverse(getStructure().getRoot(), builder);
		System.out.println(builder.toString());
	}

	private void traverse(Node node, StringBuilder builder) {
		if(node != null) {
			traverse(node.getLeft(), builder);
			traverse(node.getRight(), builder);
			builder.append(node.getItem()+", ");
		}
	}

}
