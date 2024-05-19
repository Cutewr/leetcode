package AAAoffer.findNumberIn2DArray_2;

public class solution {
    public boolean findNumberIn2DArray(int [][]matrix,int target){
        if (matrix==null || matrix.length<=0 || matrix[0].length==0) {
            return false;
        }
        int rows=matrix.length;
        int cols=matrix[0].length;

        int row=rows-1;
        int col=0;
        while (row>=0 && col<cols) {
            if (target<matrix[row][col]) {
                col++;
            }else if (target>matrix[row][col]) {
                row--;
            }else{
                return true;
            } 
        }
        return false;
    }
}
