package easy.LC1796;

import java.util.SortedSet;
import java.util.TreeSet;

public class SecondLargestDigitInAString {

    public int secondHighest(String s) {
        if(s.length() < 2){
            return -1;
        }
        SortedSet<Integer> set = new TreeSet<>();
        char[] letters = s.toCharArray();

        for (int ind = 0 ; ind< s.length()  ; ind++){
            if(Character.getNumericValue(letters[ind]) < 10){
                set.add(Integer.parseInt(letters[ind]+""));
            }
        }
        return set.size() < 2 ? -1 : set.headSet(set.last()).last();

    }

}
