import check.CheckNum;
import check.CountryNumber;
import check.IsAd;
import check.IsLastNumb999;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "Wednesday";
        Phone phone = new Phone();
//        phone.putNumbersBlackList("3809612354");
        phone.addSettingsBlock("Monday", new ArrayList<>(Arrays.asList(new IsAd(),new CountryNumber())));
        phone.addSettingsBlock("Wednesday", new ArrayList<>(Arrays.asList(new IsLastNumb999())));
//        phone.addSettingsBlock("Monday", new ArrayList<>(Arrays.asList(new IsLastNumb999())));
        String number1 = "215616516";
        String number2 = "3809612354";
        String number3 = "38056756";
        String number7 = "380752437";

        phone.doCall(number1,s);
        phone.putNumbersBlackList(number2);
        phone.doCall(number3,s);
        phone.doCall(number2,s);
        phone.doCall(number7,s);
    }
}