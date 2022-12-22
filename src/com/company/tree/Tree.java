package com.company.tree;

public class Tree implements ITree {

    @Override
    public String decorate() {
        return
                "        d$$b\n" +
                "      .d$&&$b.\n" +
                "    .d$$&$$&$$b.\n" +
                "       d$$$$b\n" +
                "      d$&$$&$b\n" +
                "    .d$$&$$&$$b\n" +
                "  .d$&$$$&&$$$&$b.\n" +
                "      d$$&$$b\n" +
                "     d$$&$$&$$b\n" +
                "  .d$&$$$$$$$$&$b.\n" +
                ".d$$&$$$$&$$$$&$$$b.\n" +
                "        ###\n" +
                "        ###\n" +
                "        ###\n" +
                "     ######### \n" +
                "     ######### ";
    }
}