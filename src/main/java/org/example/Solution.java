package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public void solution() {
        Tree t4 = new Tree(4, new Tree(1, null, null), new Tree(98, null, null));
        Tree t7 = new Tree(7, new Tree(5, null, null), new Tree(2, null, null));
        Tree tree = new Tree(10, t4, t7);
        inWidth(tree);
    }

    public void inWidth(Tree root) {
        if (root == null) {
            return;
        }
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        int size = queue.size();
        while (!queue.isEmpty()) {
            while (size != 0) {
                Tree tempTree = queue.poll();
                System.out.print(tempTree.val + " ");
                if (tempTree.left != null) {
                    queue.add(tempTree.left);
                }
                if (tempTree.right != null) {
                    queue.add(tempTree.right);
                }
                size--;
            }
            System.out.println();
            size = queue.size();
        }
    }

    public void inDeep(Tree root){
        if (root == null) {
            return;
        }
        System.out.println(root.val);

        inDeep(root.left);

        inDeep(root.right);
    }
}

class Tree {
    public final int val;
    public final Tree left;
    public final Tree right;

    public Tree(int val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}