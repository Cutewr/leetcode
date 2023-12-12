package Medium.GroupAnagrams_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 */
public class solution {
    public static void main(String[] args) {
        String []strs=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res=new ArrayList<>();
        res=groupAnagrams(strs);
        for (int i = 0; i < res.size(); i++) {
            for(String s:res.get(i)){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(String s:strs){
            String temp=s;
            char []ch=s.toCharArray();
            Arrays.sort(ch);
            s=String.valueOf(ch);
            if (map.get(s) == null) {
                List<String> list = new ArrayList<>();
                list.add(temp);
                map.put(s, list);
            } else {
                map.get(s).add(temp);
            }
        }
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
