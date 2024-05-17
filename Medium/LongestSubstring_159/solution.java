package Medium.LongestSubstring_159;

import java.util.HashMap;

/*
 * 给定一个字符串 s ，找出 至多 包含两个不同字符的最长子串 t 。
 */
public class solution {
    public static void main(String[] args) {
        int result=lengthOfLongestSubstringTwoDistinct("bbabed");
        System.out.println(result);
    }
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int maxCount=0;
        int difCnt=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0,j=0;j<s.length();j++){
            if (!map.containsKey(s.charAt(j))) {
                difCnt++;
            }
            map.put(s.charAt(j), (map.getOrDefault(s.charAt(j), 0)+1));
            if (difCnt>2) {
                while (true) {
                    if (map.getOrDefault(s.charAt(i),0)==1) {
                        break;
                    }                    
                    else{
                        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
                        i++;
                    }
                }
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)-1);
                i++;
                difCnt--;
            }
            maxCount=Math.max(maxCount, j-i+1);
        }
        return maxCount;
    }
}

