package Medium.FindtheCity_1334;

public class solution {
    public static void main(String[] args) {
        int [][]edges={{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
        int result=findTheCity(5, edges, 2);
        System.out.println(result);
    }

    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int max=10000;
        int [][]weight=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                weight[i][j]=max;
            }
        }
        for(int i=0;i<edges.length;i++){
            int from=edges[i][0];
            int to=edges[i][1];
            int w=edges[i][2];
            weight[from][to]=w;
            weight[to][from]=w;
        }
        for(int i=0;i<n;i++){
            weight[i][i]=0;
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                for (int k=0;k<n;k++){
                    if(weight[j][k]>weight[j][i]+weight[i][k]){
                        weight[j][k]=weight[j][i]+weight[i][k];
                    }
                }
            }
        }
    
        int []maxCount=new int[n];
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                if(weight[i][k]<=distanceThreshold&&i!=k){
                    maxCount[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(maxCount[i]);
        }
        return argmin(maxCount);
    }

    public static int argmin(int []nums){
        int flags=-1,min=Integer.MAX_VALUE;
        int len=nums.length;
        for (int i = len-1; i >= 0; i--) {
            if(nums[i]<min){
                min=nums[i];
                flags=i;
            }
        }
        return flags;
    }
}

