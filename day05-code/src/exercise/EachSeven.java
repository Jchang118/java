package exercise;

public class EachSeven {
    static boolean containsSeven(int n) {
        if (n % 7 == 0) return true;
        while (n / 10 != 0) {
            if (n % 10 == 7) return true;
            n /= 10;
        }
        return n == 7;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (!containsSeven(i)) System.out.println(i);
            else System.out.println("过");
        }
    }
}

