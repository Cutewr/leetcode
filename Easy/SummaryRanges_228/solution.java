package Easy.SummaryRanges_228;

import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        int []nums={0,1,2,4,5,7};
        List<String> res=new ArrayList<>();
        res=summaryRanges(nums);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i)+" ");
        }
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        int i=0;
        for (i = 0; i < nums.length-1; i++) {
            if (nums[i+1]-nums[i]==1) {
                String a=String.valueOf(nums[i]);
                i++;
                while (i < nums.length-1 && nums[i+1]-nums[i]==1) {
                    i++;
                }
                a+="->";
                a+=String.valueOf(nums[i]);
                res.add(a);
            }
            else{
                res.add(String.valueOf(nums[i]));
            }
        }
        if(i==nums.length-1)    res.add(String.valueOf(nums[nums.length-1]));
        return res;
    }
}
