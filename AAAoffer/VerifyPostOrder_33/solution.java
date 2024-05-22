package AAAoffer.VerifyPostOrder_33;

public class solution {
    public static void main(String[] args) {
        int []postOrder=new int[]{4,8,6,12,16,14,7};
        boolean res=verifyPostOrder(postOrder);
        System.out.println(res);
    }

    // 验证是否为二叉搜索树的后序遍历
    public static boolean verifyPostOrder(int []postOrder){
        if (postOrder == null) {
            return true;
        }
        return f(postOrder,0,postOrder.length-1);
    }

    private static boolean f(int[] postOrder, int i, int j) {
        //如果只有一个元素，返回true
        if (i>=j) {
            return true;    
        }
        //从左到右找到第一个大于等于postOrder[j]的元素
        int temp=i;
        while(postOrder[temp]<postOrder[j]) {temp++;}
        //判断temp+1~j 内的数是否都大于等于postOrder[j]
        for(int k=temp+1;k<j;k++){
            if (postOrder[k]<postOrder[j]) {
                return false;
            }
        }
        return f(postOrder, i, temp-1) && f(postOrder, temp, j-1);
    }
}
