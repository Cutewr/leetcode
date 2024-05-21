package AAAoffer.MinStack_28;

import java.util.Stack;

class MinStack {
    public Stack<Integer> stack1;
    public Stack<Integer> minStack;

    public MinStack() {
        stack1=new Stack<>();
        minStack=new Stack<>();    
    }
    
    public void push(int x) {
        stack1.push(x);
        if (minStack.isEmpty() || minStack.peek().intValue()>=x) {
            minStack.push(x);
        }
    }
    
    public void pop() {
        /* if (minStack.peek()==stack1.peek()) {
            minStack.pop();
        } */
        if (minStack.peek().equals(stack1.peek())) {
            minStack.pop();
        }
        stack1.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}