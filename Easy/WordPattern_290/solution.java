package Easy.WordPattern_290;

import java.util.HashMap;

/*
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 * 这里的 遵循 指完全匹配，
 * 例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
 */
public class solution {
    public static void main(String[] args) {
        String pattern="abaa";
        String s="cat dog dog cat";
        Boolean res=wordPattern(pattern, s);
        System.out.println(res);
    }
    
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map1=new HashMap<>();
        String []temp=s.split(" ");
        int len1=pattern.length(),len2=temp.length;
        if(len1!=len2)  return false;
        int i=0;
        for (char c:pattern.toCharArray()){
            if(map.get(c)==null)    {map.put(c, temp[i]);}
            else if(!map.get(c).equals(temp[i]))    return false;
            i++;
        }
        i=0;
        for(String str:temp){
            if(map1.get(str)==null)    map1.put(str, pattern.charAt(i));
            else if(map1.get(str)!=pattern.charAt(i))    return false;
            i++;
        }
        return true;
    }
}
