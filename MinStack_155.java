package org.VISA;

import java.util.Stack;

public class MinStack_155 {
private Stack<Integer>stack=null;
private Stack<Integer>minStack=null;
int min;
    /** initialize your data structure here. */
   public   MinStack_155() {
      stack=new Stack<Integer>();
      minStack=new Stack<Integer>();
    }

    public void push(int x) {
        int min = x;
        if (!minStack.isEmpty()) {
            if (min > minStack.peek()) {
                min = minStack.peek();
            }
        }
        stack.push(x);
        minStack.push(min);
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
return stack.peek();

    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

