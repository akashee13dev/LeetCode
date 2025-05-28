package medium.LC22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(result, new StringBuilder(),0,0,n);
        return result;
    }

    public void generateParenthesis(List<String> answer , StringBuilder builder , int open , int close , int number){
        if(open == number && close == number){
            answer.add(builder.toString());
            return;
        }

        if(open < number){
            builder.append("(");
            generateParenthesis(answer , builder , open+1 , close , number);
            builder.deleteCharAt(builder.length() -1);
        }
        if(close < open){
            builder.append(")");
            generateParenthesis(answer , builder , open , close+1 , number);
            builder.deleteCharAt(builder.length() -1);
        }
    }
}
