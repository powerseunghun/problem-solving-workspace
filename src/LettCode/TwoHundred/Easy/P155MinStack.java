package LettCode.TwoHundred.Easy;

import java.util.Stack;
class MinStack {
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        st.clear();
        minStack.clear();
    }
    
    public void push(int val) {
        st.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        } 
    }
    
    public void pop() {
        int val = st.pop();
        if (minStack.peek() == val) {
            minStack.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class P155MinStack {
	public static void main(String[] args) {
		
	}
}
