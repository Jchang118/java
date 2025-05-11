package examples;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建集合的对象
        // 泛形<E>
        // ArrayList的类定义打印不是打印显示地址,而是显示元素并且带有方括号
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}
