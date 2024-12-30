package easy.LC232;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>() ;
    Stack<Integer> stack2 = new Stack<>() ;

    public ImplementQueueUsingStacks() {
    }

    public void push(int x) {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.add(x);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return  stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return  stack1.isEmpty();
    }

}
