package Easy.IsValid_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class solution2 {
    //利用map进行匹配
    //为了防止一开始就是右括号的空指针错误
    //往stack中push一个'?'
    public boolean isValid(String s){
        Map<Character,Character> map=new HashMap<Character,Character>(){{
            put('(', ')');put('?', '?');put('[', ']');put('{', '}');
        }};
        Stack<Character> stack=new Stack<>();
        stack.push('?');
        for(char c:s.toCharArray()){
            if(map.containsKey(c))  stack.push(c);
            else if(c!=map.get(stack.pop())) return false;
        }
        return stack.size()==1;
    }
}
