package exercises;

import java.util.ArrayList;

public class ListTest4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("zhangsan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangwu", 25));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
}
