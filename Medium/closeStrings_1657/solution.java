package Medium.closeStrings_1657;
/*
 * 如果可以使用以下操作从一个字符串得到另一个字符串，则认为两个字符串 接近 ：
操作 1：交换任意两个 现有 字符。
例如，abcde -> aecdb
操作 2：将一个 现有 字符的每次出现转换为另一个 现有 字符，并对另一个字符执行相同的操作。
例如，aacabb -> bbcbaa（所有 a 转化为 b ，而所有的 b 转换为 a ）
你可以根据需要对任意一个字符串多次使用这两种操作。
给你两个字符串，word1 和 word2 。如果 word1 和 word2 接近 ，就返回 true ；否则，返回 false 。
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class solution {
    public static void main(String[] args) {
        String word1="cabbba";
        String word2="abbccc";
        System.out.println(closeStrings(word1, word2));
    }

    public static boolean closeStrings(String word1, String word2) {
        Map<Character,Integer> fre1=frequency(word1);
        Map<Character,Integer> fre2=frequency(word2);
        if(word1.length()==word2.length() && compareUniqueChar(word1, word2) && compareMapValues(fre1, fre2))    return true;
        return false;
    }

    public static Map<Character,Integer>  frequency(String word){
        Map<Character,Integer> fre=new HashMap<>();
        for(char c : word.toCharArray()){
            fre.put(c,fre.getOrDefault(c,0)+1);
        }
        return fre;
    }

    public static boolean compareMapValues(Map<Character,Integer> fre1,Map<Character,Integer> fre2){
        int []values1=fre1.values().stream().mapToInt(Integer::intValue).toArray();
        int []values2=fre2.values().stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(values1);
        Arrays.sort(values2);
        return Arrays.equals(values1, values2);
    }

    public static boolean compareUniqueChar(String word1,String word2){
        Set<Character> ch1=new HashSet<>();
        Set<Character> ch2=new HashSet<>();
        for(char c : word1.toCharArray()){
            ch1.add(c);
        }
        for(char c:word2.toCharArray()){
            ch2.add(c);
        }
        return ch1.equals(ch2);
    }
}
