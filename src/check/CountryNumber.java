package check;

public class CountryNumber implements CheckNum{
    @Override
    public void printMess(String number) {
        System.out.println("Not Ukraine "+number);
    }

    @Override
    public boolean checkNum(TrasportObject trasportObject) {
        if (countryNumber(trasportObject.getNumber())){
//            System.out.println("country number");
        }
        return !countryNumber(trasportObject.getNumber());
    }

}
