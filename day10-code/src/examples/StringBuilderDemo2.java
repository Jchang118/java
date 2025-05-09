package examples;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        String str = "abccba";
        StringBuilder sb = new StringBuilder(str);
        String str_reversed = sb.reverse().toString();
        boolean is_palindrome = str.equals(str_reversed);
        System.out.println(is_palindrome);
    }
}
