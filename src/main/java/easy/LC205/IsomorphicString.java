package easy.LC205;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {

        int sLen = s.length();
        int tLen = t.length();
        if(sLen != tLen){
            return false;
        }
        HashMap<String , String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i=0;i<sLen;i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(map.containsKey(sChar+"")){
                if(!map.get(sChar+"").equals(tChar+"")){
                    return false;
                }
            }
            else {
                if(list.contains(tChar+"")){
                    return false;
                }
                map.put(sChar+"" , tChar+"");
                list.add(tChar+"");
            }
        }
        return true;
    }

}
