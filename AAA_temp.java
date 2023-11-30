import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AAA_temp {
    public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {5, 4, 3, 2, 1};
    
            boolean arraysEqual = Arrays.equals(array1, array2);
    
            if (arraysEqual) {
                System.out.println("两个数组相同。");
            } else {
                System.out.println("两个数组不相同。");
            }
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
