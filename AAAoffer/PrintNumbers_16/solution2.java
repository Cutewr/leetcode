package AAAoffer.PrintNumbers_16;

public class solution2 {
    public static void main(String[] args) {
        int[] res = printNumbers(1);
    }

    public static int[] printNumbers(int n) {
        int m = (int) Math.pow(10, n);
        String[] resStr = new String[m - 1];
        int[] res = new int[m - 1];
        resStr[0] = "1";
        for (int i = 1; i < m - 1; i++) {
            resStr[i] = strAddOne(resStr[i - 1]);
        }
        for (int i = 0; i < m - 1; i++) {
            System.out.println(resStr[i]);
        }
        return res;
    }

    public static String strAddOne(String str) {
        int cnt = str.length();
        int temp = cnt - 1;
        char[] chArray = str.toCharArray();
        while (chArray[temp] == '9' && temp >= 0) {
            chArray[temp] = '0';
            temp--;
        }
        if (temp < 0) {
            return new String("1" + new String(chArray));
        } else {
            chArray[temp]=(char)(chArray[temp]-'0'+1+'0');
        }
        return new String(chArray);
    }
}
