package examples;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        boolean result = list.remove("aaa");
        System.out.println(result);
        System.out.println(list);
        boolean result2 = list.remove("ddd");
        System.out.println(result2);
        System.out.println(list);
        String str= list.remove(0);
        System.out.println(str);
        System.out.println(list);
        String removed = list.set(0,"ddd");
        System.out.println(removed);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
