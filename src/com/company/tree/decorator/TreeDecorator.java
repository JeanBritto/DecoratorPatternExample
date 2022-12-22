package com.company.tree.decorator;

import com.company.tree.ITree;

public abstract class TreeDecorator implements ITree {

    private ITree tree;

    public TreeDecorator(ITree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}