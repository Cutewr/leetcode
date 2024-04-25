import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AAA_temp {
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('c', 0);
        map.put('a', 1);
        map.put('c', 2);
        map.put('b', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('c', 6);
        System.out.println(map.get('c'));
    }
    class Solution {
    static final int L = 10;

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        int n = s.length();
        for (int i = 0; i <= n - L; ++i) {
            String sub = s.substring(i, i + L);
            cnt.put(sub, cnt.getOrDefault(sub, 0) + 1);
            if (cnt.get(sub) == 2) {
                ans.add(sub);
            }
        }
        return ans;
    }
}
}
