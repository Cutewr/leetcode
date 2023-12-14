package BinaryTree.BuildTrees_105;

import java.util.HashMap;
import java.util.Map;

import BinaryTree.TreeNode;

public class solution {
    public static void main(String[] args) {
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen=preorder.length;
        int inLen=inorder.length;
        if (preLen!=inLen) {
            throw new RuntimeException( "Incorrect Input Data!");
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder,0,preLen-1,map,0,inLen-1);
    }

    private TreeNode buildTree(int []preorder, int preLeft, int preRight, Map<Integer, Integer> map, int inLeft, int inRight) {
        if(preLeft>preRight||inLeft>inRight)    return null;
        int rootVal=preorder[preLeft];
        TreeNode root=new TreeNode(rootVal);
        int pIndex=map.get(rootVal);
        root.left=buildTree(preorder, preLeft+1,pIndex-inLeft+preLeft,map,inLeft,pIndex-1);
        root.right=buildTree(preorder, preRight-inRight+pIndex+1,preRight,map,pIndex+1,inRight);
        return root;
    }
}
