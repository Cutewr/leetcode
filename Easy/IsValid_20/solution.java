package Easy.IsValid_20;

import java.util.Stack;

public class solution {
    public static void main(String[] args) {
        
    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{')   stack.push(c);
            else if(c==')'&&stack.peek()!='(')  return false;
            else if(c=='}'&&stack.peek()!='{')  return false;
            else if(c=='['&&stack.peek()!=']')  return false;
            else stack.pop();
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
