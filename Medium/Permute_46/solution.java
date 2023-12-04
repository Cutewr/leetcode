package Medium.Permute_46;

import java.util.ArrayList;
import java.util.List;

public class solution {
    static List<List<Integer>> res;
    static List<Integer> numT;

    public static void main(String[] args) {
        int []nums={1,2,3};
        res=permute(nums);
        for(int i=0;i<res.size();i++){
            List<Integer> temp=new ArrayList<>(res.get(i));
            for(int j=0;j<nums.length;j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        numT=new ArrayList<>();
        res=new ArrayList<>();
        for(int num:nums){
            numT.add(num);
        }
        dfs(0);
        return res;
    }

    public static void dfs(int x){
        if(x==numT.size()-1){
            res.add(new ArrayList<>(numT));
            return;
        }
        for (int i = x; i < numT.size(); i++) {
            swap(i, x);
            dfs(x+1);
            swap(i, x);
        }
    }

    public static void swap(int i,int j){
        int temp=numT.get(i);
        numT.set(i, numT.get(j));
        numT.set(j, temp);
    }
}
