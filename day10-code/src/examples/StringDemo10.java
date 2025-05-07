package examples;

public class StringDemo10 {
    public static void main(String[] args) {
        String phoneNumber = "13112349468";

        String firstThreeDigits = phoneNumber.substring(0, 3);
        String lastFourDigits = phoneNumber.substring(7);

        String hiddenPhoneNumber = firstThreeDigits + "****" + lastFourDigits;
        System.out.println(hiddenPhoneNumber);
    }
}
