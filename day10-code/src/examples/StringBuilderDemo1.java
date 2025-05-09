package examples;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append(1);
        sb.append(true);
        sb.append(3.14);
        sb.append('中');
        System.out.println(sb); // 打印的是属性值而非地址
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());

        String str = sb.toString();
        System.out.println(str);
    }
}
