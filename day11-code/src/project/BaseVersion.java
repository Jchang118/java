package project;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseVersion {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------\n1：添加学生\n2：删除学生\n3：修改学生\n4：查询学生\n5：退出\n请输入您的选择:");
            switch (sc.next()) {
                case "1":
                    addStudent(list, sc);
                    break;
                case "2":
                    deleteStudent(list, sc);
                    break;
                case "3":
                    updateStudent(list, sc);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    return;
                default:
                    System.out.println("您的输入有误,请重新输入");
            }
        }
    }

//        public static boolean containsId(ArrayList<Student> list, String id){
//            for (int i = 0; i < list.size(); i++) {
//                if (list.get(i).getId().equals(id)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
        public static int getIndex(ArrayList<Student> list, String id) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id)) {
                    return i;
                }
            }
            return -1;
        }

        public static void addStudent(ArrayList<Student> list, Scanner sc) {
            System.out.println("请输入学生id:");
            String id;
            while (true) {
                id = sc.next();
                if (getIndex(list, id) != -1) {
                    System.out.println("id已存在，请重新输入:");
                } else break;
            }
            System.out.println("请输入学生姓名:");
            String name = sc.next();
            System.out.println("请输入学生年龄:");
            int age = sc.nextInt();
            System.out.println("请输入学生地址:");
            String address = sc.next();
            Student s = new Student(id, name, age, address);
            list.add(s);
            System.out.println("学生信息添加成功");
        }

        public static void deleteStudent(ArrayList<Student> list, Scanner sc) {
            System.out.println("请输入要删除的学生id:");
            String id = sc.next();
            int idx = getIndex(list, id);
            if (idx == -1) {
                System.out.println("该id不存在,返回主菜单");
            } else {
                list.remove(idx);
                System.out.println("删除成功");
            }
        }

        public static void updateStudent(ArrayList<Student> list, Scanner sc) {
            System.out.println("请输入要修改的学生id:");
            String id = sc.next();
            int idx = getIndex(list, id);
            if (idx == -1) {
                System.out.println("该id不存在,返回主菜单");
            } else {
                System.out.println("请输入新的学生姓名:");
                list.get(idx).setName(sc.next());
                System.out.println("请输入新的学生年龄:");
                list.get(idx).setAge(sc.nextInt());
                System.out.println("请输入新的学生地址:");
                list.get(idx).setAddress(sc.next());
                System.out.println("修改成功");
            }
        }

        public static void queryStudent(ArrayList<Student> list) {
            if (list.size() == 0) {
                System.out.println("当前无学生信息，请添加后再查询");
            } else {
                System.out.printf("%-12s%-12s%-12s%-12s\n","id","姓名", "年龄", "地址");
                for (int i = 0; i < list.size(); i++) {
                    Student s = list.get(i);
                    System.out.printf("%-12s%-12s%-12s%-12s\n",s.getId(),s.getName(),s.getAge(),s.getAddress());
                }
            }
        }
    }
