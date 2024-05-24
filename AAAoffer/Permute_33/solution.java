package AAAoffer.Permute_33;

import java.util.ArrayList;
import java.util.List;

public class solution {
    List<List<Integer>> res;
    List<Integer> tmpList;
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        tmpList=new ArrayList<>();
        visited=new boolean[nums.length];

        dfs(nums, 0);

        return res;
    }
    void dfs(int []nums,int k){
        if (nums.length==k) {
            res.add(new ArrayList<>(tmpList));
            return;
        } 
        // 进行n叉树搜索
        for(int i=0;i<nums.length;i++){
            //如果该节点没有被访问过
            if (visited[i]==false) {
                visited[i]=true;
                tmpList.add(nums[i]);
                dfs(nums, k+1);
                tmpList.remove(tmpList.size()-1);
                visited[i]=false;
            }
        }
    }
}
