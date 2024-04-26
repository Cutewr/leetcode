package Hard.MinWindow_76;
/* 
 * 给你一个字符串 s 、一个字符串 t 。
 * 返回 s 中涵盖 t 所有字符的最小子串。
 * 如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 */

import java.util.HashMap;

public class solution {
    public static void main(String[] args) {
        String s="ACDBCACB";
        String t="AB";
        String result=minWindow(s, t);
        System.out.println(result);
    }

    public static String minWindow(String s, String t) {
        if (s.length()<t.length()) {
            return "";
        }
        
        int needCnt=t.length();
        //记录覆盖字串还需要的字符个数
        HashMap<Character,Integer> tMap=new HashMap<>(t.length());
        for(char ch:t.toCharArray()){
            tMap.put(ch, (tMap.getOrDefault(ch, 0)+1));
        }
        int []minResult=new int[]{0,Integer.MAX_VALUE};
        for(int j=0,i=0;j<s.length();j++){
            char temp=s.charAt(j);
            if (tMap.getOrDefault(s.charAt(j),0)>0) {
                needCnt--;
            }
            tMap.put(temp, (tMap.getOrDefault(temp,0)-1));
            //缩小左边界
            if (needCnt==0) {
                while (true) {
                    char c=s.charAt(i);
                    if(tMap.getOrDefault(c, 0)==0){
                        break;
                    }
                    else{
                        tMap.put(c, (tMap.getOrDefault(c, 0)+1));
                        i++;
                    }
                }
                if (j-i<minResult[1]-minResult[0]) {
                    minResult[1]=j;
                    minResult[0]=i;
                }
                //移动左边界，查找下一个包含子字符串的窗口
                tMap.put(s.charAt(i), 1);
                needCnt++;
                i++;
            }
        }
         // 超过边界，返回空串
         if (minResult[1] > s.length()) {
            return "";
        } else {
            return s.substring(minResult[0], minResult[1] + 1);
        }
    }

}
