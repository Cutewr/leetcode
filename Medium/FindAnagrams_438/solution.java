package Medium.FindAnagrams_438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，
 * 返回这些子串的起始索引。不考虑答案输出的顺序。
 * 异位词 指由相同字母重排列形成的字符串（包括相同的字符串）。
 */

public class solution {
    public static void main(String[] args) {
        String s="abac";
        String p="bc";
        List<Integer> result=findAnagrams(s, p);
        for(int res:result){
            System.out.print(res+" ");
        }
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        // 思路一：用一个长度为p.length()的滑动窗口去便历，这样时间复杂度为O(mn)
        // 思路二：滑动窗口
        //记录需要的字符
        HashMap<Character,Integer> need=new HashMap<>(p.length());
        //记录窗口里的字符
        HashMap<Character,Integer> window=new HashMap<>();
        int valid=0;
        for(char ch:p.toCharArray()){
            need.put(ch, need.getOrDefault(ch, 0)+1);
        }
        int left=0,right=0;
        while (right<s.length()) {
            char c=s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0)+1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
             // 判断左侧窗口是否要收缩
        while (right - left >= p.length()) {
            // 当窗口符合条件时，把起始索引加入 res
            if (valid == need.size()) {
                result.add(left);
            }
            char d = s.charAt(left);
            left++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(d)) {
                if (window.get(d).equals(need.get(d))) {
                    valid--;
                }
                window.put(d, window.get(d) - 1);
            }
        }
    }
    return result;
    }
}
