package AAAoffer.Codec_32;

import java.util.LinkedList;
import java.util.Queue;

import AAAoffer.Component.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public static void main(String[] args) {
        String data="[1,2,3,null,null,4,5]";
        String []res=data.substring(1, data.length() - 1).split(",");
        int a=Integer.parseInt(res[0]);
            System.out.println(a);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        // 序列化成字符串 ，1，2，3，null,null,4,5
        if(root == null){
            return "";
        }
        StringBuilder builder=new StringBuilder();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp=queue.poll();
            if(tmp!=null){
                queue.add(root.left);
                queue.add(root.right);
                builder.append(tmp.val+",");
            }else{
                builder.append("null,");
            }
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.length()<=0)  return null;
        String []s=data.split(",");
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(s[0]));
        int i=1;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp=queue.poll();
            //构建左子节点
            if(!s[i].equals("null")){
                TreeNode left=new TreeNode(Integer.parseInt(s[i]));
                tmp.left=left;
                queue.add(left);
            }
            i++;
            if(!s[i].equals("null")){
                TreeNode right=new TreeNode(Integer.parseInt(s[i]));
                tmp.right=right;
                queue.add(right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
