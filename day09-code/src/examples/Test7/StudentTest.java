package examples.Test7;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student stu1 = new Student("heima001", "John", 20);
        Student stu2 = new Student("heima002", "Mary", 21);
        Student stu3 = new Student("heima003", "Tom", 22);
        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;

        Student stu4 = new Student("heima004", "Jane", 23);
        boolean flag = contains(stu4, students);
        if (flag) {
            System.out.println("该学生已存在");
        } else {
            int count = getCount(students);
            if (count == students.length) {
                Student[] newStudents = createNewStudents(students);
                newStudents[count] = stu4;
                students = newStudents;
            } else {
                students[count] = stu4;
            }
        }
        printStudents(students);
        System.out.println();
        int index = getIndex(students, "heima007");
        if (index >= 0) {
            students[index] = null;
            printStudents(students);
        } else {
            System.out.println("当前id不存在,删除失败");
        }

        System.out.println();

        index = getIndex(students, "heima002");
        if (index >= 0) {
            students[index].setAge(students[index].getAge() + 1);
        } else {
            System.out.println("当年id不存在,修改失败");
        }
        printStudents(students);
    }

    public static int getIndex(Student[] students, String id) {
        for (int i = 0; i < students.length; i++) {
            Student tmp = students[i];
            if (tmp != null) {
                if (tmp.getId().equals(id)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean contains(Student stu, Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId().equals(stu.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getCount(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] createNewStudents(Student[] students) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        return newStudents;
    }

    public static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getId() + "," + students[i].getName() + "," + students[i].getAge());
            }
        }
    }
}

