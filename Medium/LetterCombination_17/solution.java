package Medium.LetterCombination_17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
public class solution {
    public static void main(String[] args) {
        String digits="";
        List<String> res=new ArrayList<>();
        res=letterCombinations(digits);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> res=new LinkedList<>();
         if(digits==null||digits.isEmpty()){
            return res;
        }
        res.add("");
        char[][] phone={{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
        {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        while (res.peek().length()!=digits.length()) {
            String temp=res.poll();
            char[] ch=phone[digits.charAt(temp.length())-'0'-2];
            for(int i=0;i<ch.length;i++){
                res.add(temp+ch[i]);
            }
        }
        return res;
    }
}