package Medium.SimplifyPath_71;

import java.util.Deque;
import java.util.LinkedList;

public class solution {
    public static void main(String[] args) {
        String s="/home//foo/";
        for (String item:s.split("/"))  System.out.print(item);
    }
    public String simplifyPath(String path) {
        /*
         * 这里使用双端队列来表示栈
         * 使用栈是为了在..返回上一级目录时，pop出压进的最近一级目录
         * 最后输出的时候，从栈底部依次输出
         * 因此，使用双端队列
         */
        Deque<String> stack=new LinkedList<>();
        for(String s:path.split("/")){
            if(s.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else if(!s.isEmpty()&!s.equals("."))  stack.push(s);
        }
        String res="";
        for(String d:stack)  res="/"+d+res;
        return res.isEmpty() ? "/" : res;
    }
}
