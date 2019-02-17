package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class U548 {
    static HashMap<String,Integer> map;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new HashMap<>();
        Tree t = new Tree();
        String[] inString = br.readLine().split(" ");
        String[] preString = br.readLine().split(" ");
        for(int i = 0 ; i < inString.length ; i++)
            map.putIfAbsent(inString[i],map.size());

        t.root = buildTree(inString,preString);
        t.setup(inString.length);
        t.bfs();
        System.out.println(Arrays.toString(t.distTo));

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
        int[] distTo;
        int nv;
        public void inOrder(Node root)
        {
            if(root == null)
                return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);

        }
        public void setup(int n)
        {
            distTo = new int[n];
            nv = n;
        }
        public void bfs()
        {
            for(int i = 0 ; i < nv; i++)
                distTo[i] = Integer.MAX_VALUE;

            ArrayDeque<Node> q = new ArrayDeque<>();
            distTo[map.get(root.data)] = 0;
            q.add(root);
            while (!q.isEmpty())
            {
                Node temp = q.remove();

                if(temp.left!=null)
                {
                    distTo[map.get(temp.left.data)] = distTo[map.get(temp.data)]+Integer.parseInt(temp.data);
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    distTo[map.get(temp.right.data)] = distTo[map.get(temp.data)]+Integer.parseInt(temp.data);
                    q.add(temp.right);
                }
            }
        }
    }
}
