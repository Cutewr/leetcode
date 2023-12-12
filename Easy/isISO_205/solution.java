package Easy.isISO_205;

import java.util.HashMap;

/*
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。
 * 不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 */
public class solution {
    public static void main(String[] args) {
        String s="badc";
        String t="baba";
        Boolean res=isIsomorphic(s, t);
        System.out.println(res);
    }
    public static boolean isIsomorphic(String s, String t) {
        int len=s.length();
        HashMap<Character,Character> map=new HashMap<>();
        for (int i = 0; i < len; i++) {
            if(map.get(s.charAt(i))==null)  map.put(s.charAt(i), t.charAt(i));
            else if(map.get(s.charAt(i))!=t.charAt(i))   return false;
        }
        map.clear();
        for (int i = 0; i < len; i++) {
            if(map.get(t.charAt(i))==null)  map.put(t.charAt(i), s.charAt(i));
            else if(map.get(t.charAt(i))!=s.charAt(i))   return false;
        }
        return true;
    }
}
