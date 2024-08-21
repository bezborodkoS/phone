public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
//        phone.putNumbersBlackList("3809612354");

        String number1 = "215616516";
        String number2 = "3809612354";
        String number3 = "38056756";
        String number7 = "380752437";

        phone.doCall(number1);
        phone.putNumbersBlackList(number2);
        phone.doCall(number3);
        phone.doCall(number2);
        phone.doCall(number7);
    }
}