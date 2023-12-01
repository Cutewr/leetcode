package Medium.FirstCompleteIndex_2661;

import java.util.HashMap;
/*
 * 给你一个下标从 0 开始的整数数组 arr 和一个 m x n 的整数 矩阵 mat 。
 * arr 和 mat 都包含范围 [1，m * n] 内的 所有 整数。
从下标 0 开始遍历 arr 中的每个下标 i ，并将包含整数 arr[i] 的 mat 单元格涂色。
请你找出 arr 中在 mat 的某一行或某一列上都被涂色且下标最小的元素，并返回其下标 i 。
 */
public class solution {
    public static void main(String[] args) {
        int []arr=new int[]{1,4,5,2,6,3};
        int [][]mat=new int[][]{{4,3,5},{1,2,6}};
        int res=firstCompleteIndex(arr,mat);
        System.out.println(res);
    }
    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int len=mat.length;
        int len2=mat[0].length;
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<len;i++){
            for(int j=0;j<len2;j++){
                map.put(mat[i][j], new int[]{i,j});
            }
        }
        int []row=new int[len];
        int []col=new int[len2];
        int i=0;
        for(i=0;i<len*len2;i++){
            int []flag=map.get(arr[i]);
            System.out.println(arr[i]);
            System.out.println(flag[1]);
            col[flag[1]]++;
            row[flag[0]]++;
            if(col[flag[1]]==len2 || row[flag[0]]==len) return i;
        }
        return i;
    }

}
