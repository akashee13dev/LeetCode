package easy.LC1071;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GreatestCommonDivisor  {

    /**
     * @implNote  Will see next , since time is 2 AM
     * @param str1
     * @param str2
     * @return
     */

    public String gcdOfStrings(String str1, String str2) {

        if(str1.isEmpty()){
            return "";
        }
        if(!isCompleteSubstring(str1,str2)){
            return "";
        }
        int twoLen = str2.length();
        String str1Copy = str1;

        String longTemp = "";

        for (int i = 0 ; i<twoLen ; i++){
            if(longTemp.equals(str1Copy)){
                return longTemp;
            }
            String sub = str2.substring(0,i+1);
            if(str1Copy.replaceAll(sub,"").isEmpty()){
                longTemp = longTemp.isEmpty() ? sub : str1.length() > str2.length() ? sub :  sub.startsWith(longTemp) && sub.endsWith(longTemp) ? longTemp : sub;
            }
        }
        return longTemp;
    }

    public boolean isCompleteSubstring(String str1, String str2) {
        Map<Character, Long> str1Frequency = str1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> str2Frequency = str2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return str2Frequency.entrySet().stream()
                .allMatch(entry -> str1Frequency.getOrDefault(entry.getKey(), 0L) >= entry.getValue())
                && str1Frequency.keySet().stream().allMatch(str2Frequency::containsKey);
    }

}
