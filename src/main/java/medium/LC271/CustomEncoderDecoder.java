package medium.LC271;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomEncoderDecoder {


    public String encode(List<String> input) {
        StringBuilder s = new StringBuilder();
        for(String ele : input){
            if(Objects.isNull(ele)){
                s.append('@');
            }
            else if(ele.isEmpty() || ele.isBlank()){
                s.append('!');
            }
            else {
                s.append('$');
                s.append(ele);
            }
        }
        return s.toString();

    }

    public List<String> decode(String input) {
        List<String> result = new ArrayList<>();
        StringBuilder currentString = new StringBuilder();
        char[] chars = input.toCharArray();
        for(char ch : chars){
            if(ch == '@'){
                if(!currentString.toString().isEmpty()){
                    result.add(currentString.toString());
                    currentString.setLength(0);
                }
                result.add(null);
            }
            else if(ch == '!'){
                if(!currentString.toString().isEmpty()){
                    result.add(currentString.toString());
                    currentString.setLength(0);
                }
                result.add("");
            }
            else if (ch == '$'){
                if(!currentString.toString().isEmpty()){
                    result.add(currentString.toString());
                    currentString.setLength(0);
                }

            }
            else{
                currentString.append(ch);
            }
        }
        if(!currentString.toString().isEmpty()){
            result.add(currentString.toString());
        }
        return result;
    }
}
