package check;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneFab2 {
    private Map<String,CheckNum> map;
    public PhoneFab2() {
        this.map = new HashMap<>();
        this.map.put(CountryNumber.class.toString() , new CountryNumber());
        this.map.put(IsLastNumb999.class.toString() , new IsLastNumb999());
        this.map.put(IsAd.class.toString() , new IsAd());
        this.map.put(CheckBlackList.class.toString() , new CheckBlackList());
    }

    public Map<String, CheckNum> getMap() {
        return map;
    }
}
