package exercise;

import java.util.Random;

public class VerificationCode {
    public static void main(String[] args) {
        System.out.println("您的验证码为: "+ getCode());
    }

    public static String getCode() {
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            boolean flag = random.nextBoolean();
            char c = (char) (random.nextInt(26) + (flag ? 'A' : 'a'));
            code += c;
        }
        int randomNum = random.nextInt(10);
        code += randomNum;
        return code;
    }
}
