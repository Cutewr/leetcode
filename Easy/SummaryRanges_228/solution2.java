package Easy.SummaryRanges_228;

import java.util.ArrayList;
import java.util.List;

public class solution2 {
    public static void main(String[] args) {
        int []nums={0,1,2,4,5,7};
        List<String> res=new ArrayList<>();
        res=summaryRanges(nums);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i)+" ");
        }
    }
    //因为这里涉及到区间
    //可以使用双指针，一个用于确定初始位置
    //一个用于确定结束的位置
    public static List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        int i,j;
        int len=nums.length;
        for(i=0;i<len;i=j+1){
            j=i;
            while (j<len-1 && nums[j+1]-nums[j]==1) {
                j++;
            }
            res.add(f(nums,i,j));
        }
        return res;
    }
    public static String f(int []nums,int i,int j){
        return i==j?String.valueOf(nums[i]) :String.format("%d->%d", nums[i],nums[j]);
    }
}
