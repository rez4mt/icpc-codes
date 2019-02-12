package com.Judges.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BST1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        BSTree bsTree = new BSTree();
        while (st.hasMoreTokens())
            bsTree.insert(Integer.parseInt(st.nextToken()));
        String op = br.readLine().trim();
        if(op.equals("pre"))
           op = bsTree.preOrder(bsTree.root);
        else op = bsTree.postOrder(bsTree.root);
        System.out.println(op.substring(0,op.length()-1));
    }
    static class Node{
        int data;
        Node left,right;
        public Node(int node)
        {
            this.data = node;
            left = right = null;
        }
    }
    static class Tree{
        Node root;
    }
    static class BSTree extends Tree{
        void insert(int data)
        {
            root = insert(root,data);
        }
        Node insert(Node root,int data)
        {

            if(root == null) root = new Node(data);
            else if(root.data > data) root.left = insert(root.left,data);
            else if(root.data < data) root.right = insert(root.right,data);
            return root;
        }
        public String preOrder(Node root)
        {
            if(root == null)
                return "";
            StringBuilder b = new StringBuilder();
            b.append(root.data);
            b.append(" ");
            b.append(preOrder(root.left));
            b.append(preOrder(root.right));
            return b.toString();
        }
        public String postOrder(Node root)
        {
            if(root == null)
                return "";
            StringBuilder b = new StringBuilder();
            b.append(preOrder(root.left));
            b.append(preOrder(root.right));
            b.append(root.data);
            b.append(" ");
            return b.toString();
        }
    }
}
