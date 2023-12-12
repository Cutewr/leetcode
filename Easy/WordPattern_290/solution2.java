package Easy.WordPattern_290;

import java.util.Arrays;
import java.util.List;

/*
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 * 这里的 遵循 指完全匹配，
 * 例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
 */
public class solution2 {
    //简单的方法
    //indexOf():第一次出现的位置
    public static void main(String[] args) {
        
    }   
    public static boolean wordPattern(String pattern, String s) {
        List<String> ls=Arrays.asList(s.split(" "));
        int n=pattern.length();
        if(n!=ls.size())    return false;
        for (int i = 0; i < n; i++) {
            if(pattern.indexOf(pattern.charAt(i))!=ls.indexOf(ls.get(i)))   return false;
        }
        return true;
    }
}
