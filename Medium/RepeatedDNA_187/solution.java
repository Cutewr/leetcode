package Medium.RepeatedDNA_187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    DNA序列 由一系列核苷酸组成，缩写为 'A', 'C', 'G' 和 'T'。
    例如，"ACGAATTCCG" 是一个 DNA序列 。
    在研究 DNA 时，识别 DNA 中的重复序列非常有用。
    给定一个表示 DNA序列 的字符串 s ，返回所有在 DNA 分子中出现不止一次的 长度为 10 的序列(子字符串)。你可以按 任意顺序 返回答案。
 */
public class solution {
    public static void main(String[] args) {
        List<String> result=findRepeatedDnaSequences("AAAAAAAAAAA");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i)+" ");
        }
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();  // 使用ArrayList实现,ArrayList初始化为空
        //用哈希表记录下全部长度为10的子字符串，然后输出出现多次的
        int len=s.length();
        if (len<=10) {
            return result;
        }
        Map<String,Integer> countString=new HashMap<>();
        for(int i=0;i<=len-10;i++){
            String temp=s.substring(i, i+10);
            int cnt=countString.getOrDefault(temp, 0);
            countString.put(temp, cnt+1);
            if (cnt==1) {
                result.add(temp);
            }
        }
        return result;
    }
}
