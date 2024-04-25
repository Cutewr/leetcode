package Medium.LongestSubstring_3;

import java.util.HashMap;

/* 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 */
public class solution {
    public static void main(String[] args) {
        String s="abba";
        int count=lengthOfLongestSubstring(s);
        System.out.println(count);
    }

    //滑动窗口
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) {
            return 0;
        }
        int left=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max=Math.max(max, i-left+1);
        }
        return max;
    }
}
