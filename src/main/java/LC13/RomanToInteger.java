package LC13;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<String , Integer> roman = new HashMap<>();
        roman.put("I",1);
        roman.put("V",5);
        roman.put("X",10);
        roman.put("L",50);
        roman.put("C",100);
        roman.put("D", 500);
        roman.put("M",1000);

        int len = s.length();
        int addition = 0;
        for (int i=0 ; i<len ; i++){
            int current = roman.get(s.charAt(i)+"");
            if(i == len-1){
                addition+=current;
                continue;
            }
            int next =  roman.get(s.charAt(i+1)+"");
            if(current > next){
                addition+=current;
            }
            else if(current < next){
                addition-=current;
            }
            else {
                addition+=current;
            }
        }
        return  addition;
    }

}
