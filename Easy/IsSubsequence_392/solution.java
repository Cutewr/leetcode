package Easy.IsSubsequence_392;
/*
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 */
public class solution {
    public static void main(String[] args) {
        String s="abc",t="ahbgdc";
        Boolean res=isSubsequence(s,t);
        System.out.println(res);
    }
    public static boolean isSubsequence(String s, String t) {
        //判断一个字符串是否是另一个字符的子序列
        //使用双指针：一个字符串一个
        int a=0,b=0;
        while (a<s.length()&&b<t.length()) {
            if (s.charAt(a)==t.charAt(b++)) {
                a++;
            }
        }
        return a==s.length();
    }
}
