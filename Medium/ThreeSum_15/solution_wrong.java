/*
 * 给你一个整数数组 nums ，
 * 判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
 * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 * 你返回所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution_wrong {
    public static void main(String[] args) {
        int []nums={-2,0,1,1,2};
        List<List<Integer>> res=new ArrayList<>();
        res=threeSum(nums);
        for (int i = 0; i < res.size(); i++) {
            for(int j=0;j<3;j++){
                System.out.print(res.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int a=0,b=nums.length-1;
        int c=0;
        Boolean flag=true;
        while (a<b-1) {
            if (nums[a]+nums[b]<0) {
                c=b-1;
                if (nums[a]+nums[b]+nums[c]<0) {
                    a++;
                }else{
                    while (c>a&&nums[a]+nums[b]+nums[c]>0) {
                        c--;
                    }
                    if (nums[a]+nums[b]+nums[c]>0) {
                        b--;
                        flag=false;
                    }else if (nums[a]+nums[b]+nums[c]<0) {
                        a++;
                        flag=false;
                    }
                }
            }
            else if (nums[a]+nums[b]>=0) {
                c=a+1;
                if (nums[a]+nums[b]+nums[c]>0) {
                    b--;
                }else{
                    while (c<b&&nums[a]+nums[b]+nums[c]<0) {
                        c++;
                    }
                    if (nums[a]+nums[b]+nums[c]<0) {
                        a++;
                        flag=false;
                    }else if (nums[a]+nums[b]+nums[c]>0) {
                        b--;
                        flag=false;
                    }
                }
            }
            if (flag && nums[a]+nums[b]+nums[c]==0){
                List<Integer> triplet = Arrays.asList(nums[a], nums[c], nums[b]);
                if (!res.contains(triplet)) {
                    res.add(triplet);
                }
                a++;    b--;
            }
        }
        return res;
    }
}