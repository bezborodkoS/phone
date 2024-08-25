import check.*;

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

    public void doCall(String number, String day) {

        TrasportObject trasportObject = new TrasportObject();
        trasportObject.setBlackArrayList(blackNumbersList);
        trasportObject.setNumber(number);
        boolean checkStatus = isCheckStatus2(number, trasportObject,day);
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

    private boolean isCheckStatus2(String number, TrasportObject trasportObject, String day) {
        Map<String, Map<String, CheckNum>> map = phoneFab2.getMap();
//        System.out.println("/////////////"+map.get(IsAd.class.toString()));
        for (Map.Entry<String, Map<String, CheckNum>> entry : map.entrySet()) {
            // get keyMap
            String keyMap = entry.getKey();
            // get valueMap
            Map<String, CheckNum> valueMap = entry.getValue();
            if (keyMap.equals(day)) {
                for (Map.Entry<String, CheckNum> checkNumMap : valueMap.entrySet()) {
                    // get key
                    String key = entry.getKey();
                    // get value
                    CheckNum value = checkNumMap.getValue();
                    if (value.checkNum(trasportObject)) {
                        value.printMess(number);
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public boolean addSettingsBlock(String day, ArrayList<CheckNum> checkNumArrayList) {
        phoneFab2.addSettings(day, checkNumArrayList);
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
