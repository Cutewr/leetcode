package Medium.divisibilityArray_2575;

public class solution_right {
    public static void main(String[] args) {
        String word="4868438856666666";
        int len=word.length();
        int m=6;
        int []a=new int[len];
        a=divisibilityArray(word, m);
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static int[] divisibilityArray(String word, int m) {
        int len=word.length();
        int []result=new int[len];
        long temp=0;
        for(int i=0;i<len;i++){
            int currentInt=Character.getNumericValue(word.charAt(i));
            temp+=currentInt;
            long diviend=(temp%m);
            if(diviend==0)  result[i]=1;
            temp=(diviend*10);
        }
        return result;
    }
}
