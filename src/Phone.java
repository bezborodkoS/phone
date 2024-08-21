import check.CheckNum;
import check.PhoneFab;
import check.PhoneFab2;
import check.TrasportObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phone {

    private PhoneFab phoneFab = new PhoneFab();
    private PhoneFab2 phoneFab2 = new PhoneFab2();
    private ArrayList blackNumbersList = new ArrayList();


    public Phone() {

    }

    public void putNumbersBlackList(String number) {
//        if (blackNumbersList == null) {
//            blackNumbersList = new ArrayList();
//        }
        blackNumbersList.add(number);
    }

    private boolean checkNumber(String number) {
        if (blackNumbersList.contains(number)) {
            return true;
        } else
            return false;
    }

    private boolean checkNumberV2(String number) {
        return blackNumbersList.contains(number);
    }

    private boolean checkNumberV3(String number) {
        for (int i = 0; i < blackNumbersList.size(); i++) {
            if (blackNumbersList.get(i).equals(number)) {
                return true;

            }

        }
        return false;
    }

    public void doCall(String number) {

        TrasportObject trasportObject = new TrasportObject();
        trasportObject.setBlackArrayList(blackNumbersList);
        trasportObject.setNumber(number);
        boolean checkStatus = isCheckStatus2(number, trasportObject);
        if (checkStatus) {
            System.out.println("Can phone " + number);
        }
    }

    private boolean isCheckStatus(String number, TrasportObject trasportObject) {
        ArrayList<CheckNum> checkNums = phoneFab.getCheckNumArrayList();
        for (CheckNum checkNum : checkNums) {
            if (checkNum.checkNum(trasportObject)) {
                checkNum.printMess(number);
                return false;
            }
        }
        return true;
    }

    private boolean isCheckStatus2(String number, TrasportObject trasportObject) {
        Map<String,CheckNum> map = phoneFab2.getMap();
        for(Map.Entry<String, CheckNum> entry: map.entrySet()) {
            // get key
            String key = entry.getKey();
            // get value
            CheckNum value = entry.getValue();
            if (value.checkNum(trasportObject)) {
                value.printMess(number);
                return false;
            }
        }
        return true;
    }

//    private boolean isLastNumb999(String number){
//        if (number.endsWith("999")){
//            return true;
//        }
//        return false;
//    }
//
//    private boolean isAd(String number){
//        if (countryNumber(number)){
//            if (number.contains("056")){
//                return true;
//            }
//        }
//        return false;
//    }


    public ArrayList getBlackNumbersList() {
        return blackNumbersList;
    }
}
