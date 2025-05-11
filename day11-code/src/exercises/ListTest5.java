package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("Enter name: ");
            s.setName(sc.next());
            System.out.println("Enter age: ");
            s.setAge(sc.nextInt());
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Name: " + list.get(i).getName() + ", Age: " + list.get(i).getAge());
        }
    }
}
