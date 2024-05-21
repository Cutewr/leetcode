package AAAoffer.ValidateStackSequences_29;

import java.util.Stack;

public class solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=0,k=0;i<n;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && popped[k]==stack.peek().intValue()){
                stack.pop();
                k++;
            }
        }
        return stack.isEmpty();
    } 
}
