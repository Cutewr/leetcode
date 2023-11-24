package Easy.CountPairs_2824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class solution {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(-1,1,2,3,1));
        int target=2;
        int result=countPairs(integerList, target);
        System.out.println(result);
    }
    public static int countPairs(List<Integer> nums, int target) {
        int count=0;
        for (int i = 0; i < nums.size()-1; i++) {
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    count++;
                }
            }
        }
        return count;
    }
}
