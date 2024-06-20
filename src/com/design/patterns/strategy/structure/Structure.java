package com.design.patterns.strategy.structure;

import com.design.patterns.strategy.traversal.Traversal;

public interface Structure{
	public void setTraversal(Traversal traversal);
	public void traverse();
	public void addItem(Object item);
}
