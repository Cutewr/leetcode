package BinaryTree.BuildTree_106;

import java.util.HashMap;

import BinaryTree.TreeNode;


public class solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inLen=inorder.length,postLen=postorder.length;
        if (inLen!=postLen) {
            throw new RuntimeException("Inconrrect Input Data!");
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < inLen; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(0,inLen-1,map, postorder,0,postLen-1);
    }

    private TreeNode buildTree(int inLeft, int inRight, HashMap<Integer, Integer> map, int[] postorder, int postLeft, int postRight) {
        if(inLeft>inRight||postLeft>postRight)  return null;
        int rootVal=postorder[postRight];
        TreeNode root=new TreeNode(rootVal);
        int pIndex=map.get(rootVal);
        root.left=buildTree(inLeft, pIndex-1,map,postorder,postLeft,postLeft+pIndex-1-inLeft);
        root.right=buildTree(pIndex+1, inRight,map,postorder,postRight+pIndex-inRight,postRight-1);
        return root;
    }
}
