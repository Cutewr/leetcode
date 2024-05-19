package AAAoffer.Exist_10;

public class solution {
    int rows;
    int cols;
    int length;
    boolean [][]visited;
    public boolean exist(char [][] board,String word){
        this.rows=board.length;
        this.cols=board[0].length;
        this.length=word.length();
        visited=new boolean[rows][cols];
    
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (dfs(board,i,j,word,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char [][]board,int i,int j,String word,int k){
        if (i<0 || i>=rows || j<0 || j>=cols || visited[i][j] || board[i][j]!=word.charAt(k)) {
            return false;
        }
        if (k==length-1) {
            return true;
        }
        visited[i][j]=true;
        boolean res=dfs(board,i+1,j,word,k+1)||dfs(board,i,j+1,word,k+1)||dfs(board,i-1,j,word,k+1)||dfs(board,i,j-1,word,k+1);
        visited[i][j]=false;
        return res;         
    }


}
