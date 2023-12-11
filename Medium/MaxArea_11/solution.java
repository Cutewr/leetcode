package Medium.MaxArea_11;
/*
 * 给定一个长度为 n 的整数数组 height 。
 * 有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 */

public class solution {
    public static void main(String[] args) {
        int []height={1,8,6,2,5,4,8,3,7};
        int res=maxArea(height);
        System.out.println(res);
    }
    public static int maxArea(int[] height) {
        int res=0;
        for(int i=0,j=height.length-1;i<j;){
            res=Math.max(Math.min(height[i], height[j])*(j-i), res);
            //双指针移动思路：向内移动长板肯定会减小容量
            //但是向内移动短板，短板可能因此增长，从而增加容量
            if (height[i]>=height[j]) {
                j--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
