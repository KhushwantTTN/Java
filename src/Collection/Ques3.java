package Collection;

import java.util.Stack;

public class Ques3 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public Ques3() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }
    public int pop() {
        int value = stack.pop();
        if (value == minStack.peek()) {
            minStack.pop();
        }
        return value;
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public boolean isFull() {
        return false;
    }
    public int getMin() {
        return minStack.peek();
    }
}

