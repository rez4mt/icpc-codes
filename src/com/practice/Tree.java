package com.practice;

import java.util.ArrayDeque;

public class Tree {

    class Node{

        int data;
        Node left,right;
        public Node(int data)
        {
            this.data = data;
            left = right = null;

        }
    }

    Node root;

    public void inorder(Node root)
    {
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void levelOrder()
    {
        if(root == null)
            return;
        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(root);
        Node temp;
        while (!q.isEmpty())
        {
            temp = q.remove();
            System.out.println(temp.data);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);

        }
    }

    public int height(Node root)
    {
        if(root == null)
            return -1;
        return 1+ Math.max(height(root.left),height(root.right));

    }

    class BSTree extends Tree{
        public boolean search(Node root,int x)
        {
            if(root == null) return false;
            if(x == root.data) return true;
            if(x < root.data) return search(root.left,x);
            return search(root.right,x);
        }
        public void insert(int x)
        {
            root = insert(root,x);
        }
        public Node insert(Node root,int x)
        {
            if(root == null) root = new Node(x);
            //some data
            else if(false)return null;
            else if( root.data > x ) root.left = insert(root.left,x);
            else if( root.data < x ) root.right= insert(root.right,x);
            return root;
        }
        public int max(Node root)
        {
            return root.right == null ? root.data : max(root.left);
        }
        public Node delete(Node root,int x)
        {
            if(root == null) ;

            else if(x < root.data) root.left = delete(root.left,x);
            else if(x > root.data) root.right = delete(root.right,x);
            else {
                if(root.left == null && root.right == null) root = null;
                else if(root.left == null) root = root.right;
                else if(root.right == null)root = root.left;
                else
                {
                    int max = max(root.left);
                    root.data = max;
                    root.left = delete(root.left,max);
                }
            }
            return root;

        }

    }
}
