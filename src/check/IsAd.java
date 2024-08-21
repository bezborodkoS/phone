package check;

public class IsAd implements CheckNum{
    @Override
    public void printMess(String number) {
        System.out.println("is Add "+number);
    }

    @Override
    public boolean checkNum(TrasportObject trasportObject) {
        if (countryNumber(trasportObject.getNumber())){
            if (trasportObject.getNumber().contains("056")){
//                System.out.println("check number");
                return true;
            }
        }
        return false;
    }


}
