package com.company;

import com.company.tree.ITree;
import com.company.tree.Tree;
import com.company.tree.decorator.*;

public class Main {

    public static void main(String[] args) {

        ITree arv = new Tree();
        ITree myXmasTree = new LightsDecorator(arv);
        System.out.println(myXmasTree.decorate());
        System.out.println(arv.decorate());
    }
}

