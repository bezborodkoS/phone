package check;

import check.CheckNum;
import check.CountryNumber;
import check.IsAd;
import check.IsLastNumb999;

import java.util.ArrayList;

public class PhoneFab{
    private ArrayList<CheckNum> checkNumArrayList;

    public PhoneFab() {
        this.checkNumArrayList = new ArrayList<>();
        this.checkNumArrayList.add(new CountryNumber());
        this.checkNumArrayList.add(new IsAd());
        this.checkNumArrayList.add(new IsLastNumb999());
        this.checkNumArrayList.add(new CheckBlackList());
    }

    public ArrayList<CheckNum> getCheckNumArrayList() {
        return checkNumArrayList;
    }
}
