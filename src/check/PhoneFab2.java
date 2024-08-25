package check;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneFab2 {
    private Map<String,Map<String,CheckNum>> map;

    public PhoneFab2() {
        this.map = new HashMap<>();
    }

    public Map<String, Map<String, CheckNum>> getMap() {
        return map;
    }

    public boolean addSettings(String day,ArrayList<CheckNum> checkNums){
        putMap(day, checkNums);
        System.out.println(map);
        return false;
    }

    private boolean putMap(String day,ArrayList<CheckNum> checkNums){
        Map<String, CheckNum> checkNumMap = new HashMap<>();
        for (CheckNum i : checkNums) {
            checkNumMap.put(i.getClass().getSimpleName(),i);
        }
        map.put(day,checkNumMap);
        return true;
    }

}
