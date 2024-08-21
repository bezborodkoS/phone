package check;

public interface CheckNum {
    default boolean countryNumber(String number) {
        return number.startsWith("380");

    }

    public void printMess(String number);
    public boolean checkNum(TrasportObject trasportObject);
}
