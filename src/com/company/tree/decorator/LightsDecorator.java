package com.company.tree.decorator;

import com.company.tree.ITree;

public class LightsDecorator extends TreeDecorator {

    public LightsDecorator(ITree tree) {
        super(tree);
    }

    public String decorate() {
        return decorateWithLights(super.decorate());
    }

    private String decorateWithLights(String treeAsString) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        String decoratedTree = "";
        decoratedTree = treeAsString.replace("d", ANSI_RED+"@"+ANSI_RESET).replace("b", ANSI_RED+"@"+ANSI_RESET);
        decoratedTree = decoratedTree.replace("&", ANSI_PURPLE+"@"+ANSI_RESET).replace("b", ANSI_PURPLE+"@"+ANSI_RESET);
        decoratedTree = decoratedTree.replace("$", ANSI_CYAN+"$"+ANSI_RESET);

        return decoratedTree;
    }
}