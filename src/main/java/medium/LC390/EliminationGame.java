package medium.LC390;

import java.util.*;

public class EliminationGame {

    public int lastRemaining(int n) {

//        if(n%2 != 0){
//            return ( n/2 )+1;
//        }
//
//        return n/2;
        Set<Integer> element = new TreeSet<>();
        for (int i=1 ; i<=n ; i++){
            element.add(i);
        }
        return findLastElement(element);
    }

    private int findLastElement( Set<Integer>  element){
       boolean isReverse = false;

       int startSize = element.size();
       int size = element.size();

       while (size > 1){

           for (int i = 1 ; i<=size ; i=i+2){
               if(isReverse){
                   int ind = size-i+1;

                   element.remove(ind+ (startSize - size - ind - 1));
               }
               else {
                   element.remove(i + (startSize - size));
               }
           }
           isReverse = !isReverse;
           size = element.size();
       }
       return element.iterator().next();
    }

}
