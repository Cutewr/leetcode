package Medium.lexicalOreder_386;

import java.util.ArrayList;
import java.util.List;

/*
 * 给你一个整数 n ，按字典序返回范围 [1, n] 内所有整数。
你必须设计一个时间复杂度为 O(n) 且使用 O(1) 额外空间的算法。
 */
public class solution {
    public static void main(String[] args) {
        int n=100;
        List<Integer> res=new ArrayList<>();
        res=lexicalOrder(n);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> res=new ArrayList<>();
        int number=1;
        for (int i = 0; i < n; i++) {
            res.add(number);
            if (number*10<=n) {
                number*=10;
            }
            else{
                while (number%10==9||number==n) {
                    number/=10;
                }
                number++;
            }
        }
        return res;
    }
}
