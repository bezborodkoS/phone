package check;

public class CheckBlackList implements CheckNum{
    @Override
    public void printMess(String number) {
        System.out.println("Black List "+number);
    }

    @Override
    public boolean checkNum(TrasportObject trasportObject) {
        if (trasportObject.getBlackArrayList().contains(trasportObject.getNumber())){
            return true;
        }
        return false;
    }
}
