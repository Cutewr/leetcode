package Medium.RestoreIPAddress;

import java.util.ArrayList;
import java.util.List;

/*
 * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，
但是 "0.011.255.245"、"192.168.1.312" 和 "192.168@1.1" 是 无效 IP 地址。
给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，返回所有可能的有效 IP 地址，
这些地址可以通过在 s 中插入 '.' 来形成。你 不能 重新排序或删除 s 中的任何数字。你可以按 任何 顺序返回答案。
 */
public class solution {
    static List<String> ans=new ArrayList<>();
    static char[] cs;
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list=restoreIpAddresses("25525511135");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static List<String> restoreIpAddresses(String s) {
        cs=s.toCharArray();
        dfs(0,cs.length,new ArrayList<>());
        return ans;
    }
    public static void dfs(int idx,int n,List<Integer> cur){
        if(cur.size()>4)    return;
        if(idx==n){
            if(cur.size()==4){  //检索到最后一个字符并且满足条件
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<4;i++){
                    sb.append(cur.get(i)).append('.');
                }
                ans.add(sb.substring(0,sb.length()-1)); //将构建好的 IP 地址字符串添加到结果列表中，去掉末尾多余的 "."
            }
        }
        else{
            for(int i=idx;i<n;i++){
                int temp=0;
                for(int j=idx;j<=i;j++) temp=temp*10+(cs[j]-'0');
                if(cs[idx]=='0'&&i!=idx) break;
                if(temp>255)    break;
                cur.add(temp);
                dfs(i+1,n,cur);
                cur.remove(cur.size()-1);   //删除最近添加的元素，进行回溯
            }
        }
    }
}