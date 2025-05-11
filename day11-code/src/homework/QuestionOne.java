package homework;

import java.util.ArrayList;

public class QuestionOne {
    public static void main(String[] args) {
        String[] arr = {"aaa", "bbb", "aaa", "aaa", "ccc", "bbb"};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
