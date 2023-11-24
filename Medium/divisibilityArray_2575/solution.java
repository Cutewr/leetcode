package Medium.divisibilityArray_2575;

/*
 * 给你一个下标从 0 开始的字符串 word ，长度为 n ，由从 0 到 9 的数字组成。另给你一个正整数 m 。
word 的 可整除数组 div  是一个长度为 n 的整数数组，并满足：
如果 word[0,...,i] 所表示的 数值 能被 m 整除，div[i] = 1
否则，div[i] = 0
返回 word 的可整除数组。
 */
public class solution {
    public static void main(String[] args) {
        String word="1010";
        int len=word.length();
        int m=10;
        int []a=new int[len];
        a=divisibilityArray(word, m);
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }
    }

    //word的长度n 1 <= n <= 105，不能直接存数字%,按照除法思路
    public static int[] divisibilityArray(String word, int m) {
        int len=word.length();
        int []result=new int[len];
        for(int i=0;i<len;i++){
            if(countNum(word, i)%m==0)  result[i]=1;
        }
        return result;
    }
    public static long countNum(String word,int position){
        long result=0;
        for(int i=0;i<=position;i++){
            char count=word.charAt(i);
            int temp=Character.getNumericValue(count);
            result*=10;
            result+=temp;
        }
        return result;
    }
}
