package Medium.MinStack_155;

public class minStackTest {
    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-4);
        minStack.pop();
        int result=minStack.getMin();
        System.out.println(result);
    }
}
