package com.company.tree.decorator;

import com.company.tree.ITree;

public class StarDecorator extends TreeDecorator {

    public StarDecorator(ITree tree) {
        super(tree);
    }

    public String decorate() {
        return decorateWithStar() + super.decorate();
    }

    private String decorateWithStar() {
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_RESET = "\u001B[0m";
        return  ANSI_BLUE+  "         /\\\n" +
                            "        <  >\n" +
                            "         \\/\n" + ANSI_RESET;
    }
}