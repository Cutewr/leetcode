package AAAoffer.SpiralOrder_27;

public class solution {
    public static void main(String[] args) {
        int [][]matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int []res=spiralOrder(matrix);
        for (int data : res) {
            System.out.print(data+" ");
        }
    }
    public static int[] spiralOrder(int [][] matrix){
        if (matrix==null || matrix.length==0 || matrix[0].length==0) {
            return new int[0];
        }
        int t=0,l=0,r=matrix[0].length-1,b=matrix.length-1;
        int []res=new int[(b+1)*(r+1)];
        int k=0;
        while (true) {
            //从左到右
            for(int i=t,j=l;j<=r;j++){
                res[k++]=matrix[i][j];
            }
            if (++t>b) break;
            //从上往下
            for(int i=t,j=r;i<=b;i++){
                res[k++]=matrix[i][j];
            } 
            if (--r<l) {
                break;
            }
            //从右往左
            for(int i=b,j=r;j>=l;j--){
                res[k++]=matrix[i][j];
            }
            if (--b<t) {
                break;
            }
            //从下往上
            for(int i=b,j=l;i>=t;i--){
                res[k++]=matrix[i][j];
            }
            if (++l>r) {
                break;
            }
        }
        return res;
    }
}
