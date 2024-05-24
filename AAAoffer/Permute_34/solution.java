package AAAoffer.Permute_34;

import java.util.ArrayList;
import java.util.List;

public class solution {
    List<Integer> tmpList;
    List<List<Integer>> res;
    boolean[] visited;
    public List<List<Integer>> permuteUnique(int[] nums) {
        tmpList=new ArrayList<>();
        res=new ArrayList<>();
        visited=new boolean[nums.length-1];
        dfs(nums,0);
        return res;
    }
 
    private void dfs(int[] nums, int k) {
        if (k==nums.length) {
            res.add(new ArrayList<>(tmpList));
            return;
        }

        for(int i=0;i<nums.length;i++){
            //剪枝 112
            if (i>0 && nums[i]==nums[i-1] && visited[i-1]==true) {
                continue;
            }
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
