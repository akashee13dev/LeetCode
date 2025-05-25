package medium.LC49;

import net.bytebuddy.asm.Advice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
//        int len = strs.length;
//        if(len == 0 ){
//            return new ArrayList<>();
//        }
//        String[] sortedArray = new String[len];
//        int ind = 0;
//        for(String str : strs){ // O(n)
//            char[] chars = str.toCharArray();
//            Arrays.sort(chars); // O(nLogn)
//            sortedArray[ind] = new String(chars);
//            ind++;
//        }
//
//        List<String> taken = new ArrayList();
//        List<List<String>> result = new ArrayList();
//
//        for(int i = 0 ; i < len ; i++){
//            String str = sortedArray[i];
//            if(!taken.contains(str)){
//                List<String> pair = new ArrayList();
//                taken.add(str);
//                pair.add(strs[i]);
//                for(int j = i+1 ; j < len ; j++){
//                    if(sortedArray[j].equals(str)){
//                        pair.add(strs[j]);
//                    }
//                }
//
//                result.add(pair);
//            }
//        }
//        return result;
        int len = strs.length;
        if(len == 0 ){
            return new ArrayList();
        }
        HashMap<String,List<String>> freqVsEle = new HashMap();
        int[] freq = new int[26];
        for(String str : strs){
            Arrays.fill(freq,0);
            char[] chars = str.toCharArray();
            for(char ch : chars){
                freq[ch- 'a']++;
            }
            StringBuilder strBuilder = new StringBuilder();
            for(int i = 0 ; i < 26 ; i++){
                strBuilder.append("#");
                strBuilder.append(freq[i]);
            }
            String key = strBuilder.toString();
            if(freqVsEle.containsKey(key)){
                List<String> list = freqVsEle.get(key);
                list.add(str);
                freqVsEle.put(key,list);

            }else{
                freqVsEle.put(key , new ArrayList<>(Arrays.asList(str)));
            }

        }
        List<List<String>> result = new ArrayList();
        for(List<String> values : freqVsEle.values()){
            result.add(values);
        }
        return result;

    }

}
