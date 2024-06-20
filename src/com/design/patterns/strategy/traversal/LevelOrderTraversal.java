package com.design.patterns.strategy.traversal;

import java.util.LinkedList;
import java.util.Queue;

import com.design.patterns.strategy.structure.BST;
import com.design.patterns.strategy.structure.BST.Node;
import com.design.patterns.strategy.structure.Structure;

public class LevelOrderTraversal extends BaseTraversal<BST> {

	public LevelOrderTraversal(Structure structure) {
		super(structure);
	}

	@Override
	public void traverse() {
		StringBuilder builder = new StringBuilder("BST Level Order Traversal : ");
	    Queue<Node> queue = new LinkedList<Node>();
	    queue.add(getStructure().getRoot());
	    traverse(queue, builder);
		System.out.println(builder.toString());
	}

	
	private void traverse(Queue<Node> queue, StringBuilder builder) {
	    if(!queue.isEmpty()) {
	        Node node = queue.poll();
	        builder.append(node.getItem() + ", ");
	        if (node.getLeft() != null) {
	            queue.add(node.getLeft());
	        }
	        if (node.getRight() != null) {
	            queue.add(node.getRight());
	        }
	        traverse(queue, builder);
	    }
	}

}
