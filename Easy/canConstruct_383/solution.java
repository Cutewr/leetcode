package Easy.canConstruct_383;

import java.util.HashMap;

public class solution {
    public static void main(String[] args) {
        String ransmoNote="a";
        String magazine="b";
        Boolean res=canConstruct(ransmoNote, magazine);
        System.out.println(res);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c:ransomNote.toCharArray()){
            if (map.containsKey(c)) {
                int temp=map.get(c);
                if(temp==0)    return false;
                else    map.put(c, temp-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
