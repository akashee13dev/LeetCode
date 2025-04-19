package medium.LC17;

import java.util.*;

public class LetterCombinationsofAPhoneNumber {

    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty()){
            return Arrays.asList();
        }
        int len = digits.length();
        HashMap<String , List<String >> numVsChar = new HashMap<>();
        numVsChar.put("2", Arrays.asList("a","b","c"));
        numVsChar.put("3", Arrays.asList("d","e","f"));
        numVsChar.put("4", Arrays.asList("g","h","i"));
        numVsChar.put("5", Arrays.asList("j","k","l"));
        numVsChar.put("6", Arrays.asList("m","n","o"));
        numVsChar.put("7", Arrays.asList("p","q","r","s"));
        numVsChar.put("8", Arrays.asList("t","u","v"));
        numVsChar.put("9", Arrays.asList("w","x","y","z"));
        if(len == 1){
            return numVsChar.get(digits);
        }
        List<String> result = new ArrayList<>();
        for (char digit : digits.toCharArray()){
            List<String > chars = numVsChar.get(digit+"");
            if(result.isEmpty()){
                result = chars;
            }
            else {
                result = mergeList(result , chars);
            }
        }
        return result;
    }

    private List<String> mergeList(List<String> result, List<String> chars) {
        List<String> mergeList = new ArrayList<>();
        for (String listOne : result){
            for (String listTwo : chars){
                mergeList.add(listOne.concat(listTwo));
            }
        }
        return mergeList;
    }

}
