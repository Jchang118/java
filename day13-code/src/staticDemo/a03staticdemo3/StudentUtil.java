package staticDemo.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {}

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        int maxAge = list.get(0).getAge();
        for (Student s : list) {
            if (s.getAge() > maxAge) {
                maxAge = s.getAge();
            }
        }
        return maxAge;
    }
}
