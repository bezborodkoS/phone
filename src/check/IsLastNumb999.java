package check;

import java.util.zip.Checksum;

public class IsLastNumb999 implements  CheckNum{

    @Override
    public void printMess(String number) {
        System.out.println("COLLECTOR "+number );
    }

    @Override
    public boolean checkNum(TrasportObject trasportObject) {
        if (trasportObject.getNumber().endsWith("999")){
//            System.out.println("Collector");
            return true;
        }
        return false;
    }
}
