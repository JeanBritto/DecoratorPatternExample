package com.company.tree.decorator;

import com.company.tree.ITree;

public class BellDecorator extends TreeDecorator {

    public BellDecorator(ITree tree) {
        super(tree);
    }

    public String decorate() {
        return decorateWithBells(super.decorate());
    }

    private String decorateWithBells(String treeAsString) {
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_RESET = "\u001B[0m";
        String tree = "";
        tree = treeAsString.replace(".", ANSI_YELLOW+"\u237E"+ANSI_RESET);
        return tree;
    }
}