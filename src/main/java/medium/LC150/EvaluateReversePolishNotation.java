package medium.LC150;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0 ){
            return 0;
        }
        int len = tokens.length;
        Stack<Integer> stack = new Stack<>();
        for (int i=0 ; i<len ; i++){
            String current = tokens[i];
            if(current.equals("+") || current.equals("-")  || current.equals("/") || current.equals("*") ){
                int b = stack.pop();
                int a = stack.pop();
                switch (current){
                    case "+" : stack.push(a + b) ; break;
                    case "-" : stack.push(a - b) ; break;
                    case "*" : stack.push(a * b) ; break;
                    case "/" : stack.push(a / b) ; break;
                }
            }
            else {
                stack.push(Integer.parseInt(current));
            }
        }
        return stack.pop();
    }

}
