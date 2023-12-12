import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {
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
        if (nums==null || nums.length<3) {
            return null;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) {
                break;
            }
            if (i>=1&&nums[i]==nums[i-1]) continue;    
            int k=i+1,j=nums.length-1;
            while (k<j) {
                int sum=nums[i]+nums[k]+nums[j];
                if (sum<0)  while (k<j&&nums[k]==nums[++k]);    
                else if(sum>0)  while (k<j&&nums[j]==nums[--j]);
                else{
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[k], nums[j])));
                    while(k < j && nums[k] == nums[++k]);
                    while(k < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }
}
