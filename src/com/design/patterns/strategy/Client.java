package com.design.patterns.strategy;

import java.util.Random;

import com.design.patterns.strategy.structure.BST;
import com.design.patterns.strategy.structure.LinkedList;
import com.design.patterns.strategy.structure.Structure;
import com.design.patterns.strategy.traversal.BackwardTraversal;
import com.design.patterns.strategy.traversal.ForwardTraversal;
import com.design.patterns.strategy.traversal.InOrderTraversal;
import com.design.patterns.strategy.traversal.LevelOrderTraversal;
import com.design.patterns.strategy.traversal.PostOrderTraversal;
import com.design.patterns.strategy.traversal.PreOrderTraversal;

public class Client {

	public static void main(String[] args) {
		// Binary tree
		Structure bst = new BST();
		addItems(bst);

		// In-Order traversal strategy
		bst.setTraversal(new InOrderTraversal(bst));
		bst.traverse();

		// Pre-Order traversal strategy
		bst.setTraversal(new PreOrderTraversal(bst));
		bst.traverse();

		// Post-Order traversal strategy
		bst.setTraversal(new PostOrderTraversal(bst));
		bst.traverse();

		// Level-Order traversal strategy
		bst.setTraversal(new LevelOrderTraversal(bst));
		bst.traverse();

		
		
		// Double Linked List
		Structure linkedList = new LinkedList();
		addItems(linkedList);

		// Forward traversal strategy
		linkedList.setTraversal(new ForwardTraversal(linkedList));
		linkedList.traverse();

		// Backward traversal strategy
		linkedList.setTraversal(new BackwardTraversal(linkedList));
		linkedList.traverse();
	}

	private static void addItems(Structure structure) {
		for (int i = 1; i <= 10; i++) {
			structure.addItem(random.nextInt(max - min + i) + min);
		}
	}

	static Random random = new Random();
	static int max = 100, min = 50;

}
