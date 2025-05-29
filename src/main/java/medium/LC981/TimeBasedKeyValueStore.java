package medium.LC981;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TimeBasedKeyValueStore {

    class TimeMap {

        private HashMap<String , TreeMap<Integer , String>> keyMap;

        public TimeMap() {
            keyMap = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if(keyMap.containsKey(key)){
                keyMap.get(key).put(timestamp , value);
            }
            else {
                TreeMap<Integer , String > valueMap = new TreeMap<>();
                valueMap.put(timestamp , value);
                keyMap.put(key , valueMap);
            }
        }

        public String get(String key, int timestamp) {
            if(Objects.isNull(keyMap) || !keyMap.containsKey(key)){
                return "";
            }
            TreeMap<Integer,String> treeMap = keyMap.get(key);
            if(treeMap == null){
                return "";
            }
            Map.Entry<Integer,String > entry = treeMap.floorEntry(timestamp);
            return entry != null ? entry.getValue() : "";
        }

    }

}
