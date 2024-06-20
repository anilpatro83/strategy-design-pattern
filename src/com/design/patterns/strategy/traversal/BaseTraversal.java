package com.design.patterns.strategy.traversal;

import com.design.patterns.strategy.structure.Structure;

public abstract class BaseTraversal<T extends Structure> implements Traversal {

	private Structure structure;

	public BaseTraversal(Structure structure) {
		this.structure = structure;
	}

	@SuppressWarnings("unchecked")
	protected T getStructure() {
		return (T) this.structure;
	}
}
