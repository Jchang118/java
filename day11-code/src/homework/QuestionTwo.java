package homework;

import java.util.ArrayList;

public class QuestionTwo {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();

        String[] surnames = {"赵", "钱", "孙", "李"};
        String[] names = {"javase", "javase", "php", "python"};

        for (int i = 0; i < surnames.length; i++) {
            teachers.add(new Teacher(surnames[i] + "老师", names[i]));
        }

        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("姓名: " + teachers.get(i).getName() + ", 专业: " + teachers.get(i).getMajor());
        }
    }
}
