package Easy.MajorityElement_169;

public class solution3 {
    public static void main(String[] args) {
        int []nums={1,1,2,1,2,3,3,3,3,3};
        int res=majorityElement(nums);
        System.out.println(res);
    }
    //摩尔投票
    public static int majorityElement(int[] nums) {
        int m=0,cnt=0;
        for(int num:nums){
            if (cnt==0) {
                m=num;
                cnt++;
            }
            else{
                if (m!=num) {
                    cnt--;
                }
                if (m==num) {
                    cnt++;
                }
            }
        }
        return m;
    }
}
