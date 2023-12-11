package Easy.isPalindrome_125;
/*
 * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，
 * 短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
 * 字母和数字都属于字母数字字符。
 * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
 */
public class solution {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        Boolean res=isPalindrome(s);
        System.out.println(res);
    }
    public static char change(char ch){
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - 'a');
        } else if(ch >= 'A' && ch <= 'Z'){
            return (char) (ch - 'A');
        }
        return ch;
    }

    public static boolean isCount(char ch){
        return (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i <= s.length() - 1 && !isCount(s.charAt(i))) {
                i++;
            }
            while (j >= 0 && !isCount(s.charAt(j))) {
                j--;
            }
            if (i>=j) return true;
            else if(change(s.charAt(i)) == change(s.charAt(j))) {
                i++; j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
