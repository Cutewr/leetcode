package Easy.isAnagram_242;

public class solution {
    public static void main(String[] args) {
        String s="rat";
        String t="tar";
        Boolean res=isAnagram(s, t);
        System.out.println(res);
    }
    public static boolean isAnagram(String s, String t) {
        int []count=new int[26];
        int n=s.length();
        int m=t.length();
        if(n!=m)    return false;
        for(int i=0;i<m;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i]!=0) {
                return false;
            }
        }
        return true;
    }
}
