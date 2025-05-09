package examples;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        sj.add("hello").add("world").add("java");
        System.out.println(sj);

        StringJoiner sj2 = new StringJoiner(":", "[", "]");
        sj2.add("hello").add("world").add("java");
        System.out.println(sj2);
        System.out.println(sj2.length());
    }
}
