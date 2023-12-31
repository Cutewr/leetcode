package Easy.Merge_88;

/*
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，
 * 分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
 * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class solution {
    public static void main(String[] args) {
        int []nums1={0};
        int []nums2={1};
        int n=nums2.length;
        merge(nums1,0,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int []res=new int[m+n];
        int i=0;
        int t1=0,t2=0;
        while (i<m+n) {
            if(t1!=m && (t2==n||nums1[t1]<nums2[t2])){
                res[i]=nums1[t1];
                t1++;
                i++;
            }
            if(t2!=n && (t1==m||nums1[t1]>=nums2[t2])){
                res[i]=nums2[t2];
                t2++;
                i++;
            }
        }
        for(i=0;i<m+n;i++){
            nums1[i]=res[i];
        }
    }
}
