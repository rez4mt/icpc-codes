package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class U548 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Tree t = new Tree();
        String[] inString = br.readLine().split(" ");
        String[] preString = br.readLine().split(" ");

        t.root = buildTree(inString,preString);


    }
    public static Node buildTree(String[] inorder, String[] postorder) {

        int inStart = 0;
        int inEnd = inorder.length - 1;
        int postStart = 0;
        int postEnd = postorder.length - 1;

        return buildTree(inorder, inStart, inEnd, postorder, postStart, postEnd);
    }

    public static Node buildTree(String[] inorder, int inStart, int inEnd,
                          String[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd)
            return null;

        String rootValue = postorder[postEnd];
        Node root = new Node(rootValue);

        int k = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i]!=null && inorder[i].equals(rootValue)) {
                k = i;
                break;
            }
        }

        root.left = buildTree(inorder, inStart, k - 1, postorder, postStart,
                postStart + k - (inStart + 1));
        root.right = buildTree(inorder, k + 1, inEnd, postorder, postStart + k - inStart, postEnd - 1);

        return root;
    }
    static class Node{
        String data = "";
        Node left,right;
        public Node(String data)
        {
            this.data = data;
            left = right = null;
        }
    }
    static class Tree{
        Node root;
        public void inOrder(Node root)
        {
            if(root == null)
                return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);

        }
        boolean getPath(Node root, ArrayList<String> arr, String x)
        {
            if (root==null)
                return false;
            arr.add(root.data);
            if (root.data.equals(x))
                return true;
            if (getPath(root.left, arr, x) || getPath(root.right, arr, x))
                return true;
            arr.remove(arr.size()-1);
            return false;
        }
        ArrayList<String> path = new ArrayList<>();
        void pathBetweenNodes(Node root, String n1, String n2)
        {
            ArrayList<String> path1= new ArrayList<String>();
            ArrayList<String> path2=new ArrayList<String>();

            getPath(root, path1, n1);
            getPath(root, path2, n2);

            int intersection = -1;
            int i = 0, j = 0;
            while (i != path1.size() || j != path2.size()) {

                if (i == j && path1.size() > i && path2.size() > i && path1.get(i).equals(path2.get(i))) {
                    i++;
                    j++;
                }
                else {
                    intersection = j - 1;
                    break;
                }
            }
            for ( i = path1.size() - 1; i > intersection; i--)
                path.add( path1.get(i));

            for ( i = intersection; i < path2.size(); i++)
                System.out.print( path2.get(i) + " ");
        }
    }
}
