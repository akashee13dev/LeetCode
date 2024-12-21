package LC1773;

import java.util.List;

public class CountItemsMatchingARule {


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        int totalCount = items.size();
        int count = 0 ;
        for (int ind = 0 ; ind < totalCount ; ind++){
            count = items.get(ind).get(index).equals(ruleValue) ? count + 1 : count;
        }
        return count;
    }

}
