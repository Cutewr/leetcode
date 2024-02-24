package Easy.BalanceStringSplit_1221;

public class solution {
    public static void main(String[] args) {
        String s="LRLLLRRR";
        int res=balancedStringSplit(s);
        System.out.println(res);
    }
    public static int balancedStringSplit(String s) {
        int count=0;
        int countL=0,countR=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L')   countL++;   else    countR++;
            if (countL==countR) {
                count++;    countL=0;   countR=0;
            }
        }
        return count;
    }

    public static int balancedStringSplit2(String s) {
        int count=0;
        int countL=0,countR=0;
        for(char ch:s.toCharArray()){
            if (ch=='L') {
                countL++;
            }
            else{
                countR++;
            }
            if (countL==countR) {
                count++;
            }
        }
        return count;
    }
}
