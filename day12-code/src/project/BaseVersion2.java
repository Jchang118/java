package project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseVersion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userData = new ArrayList<>();
        ArrayList<Student> infoList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("欢迎来到学生管理系统, 请选择操作:\n1: 登录\n2: 注册\n3: 忘记密码\n4: 退出");
            switch (scanner.next()) {
                case "1" -> login(userData, infoList, sc);
                case "2" -> register(userData, sc);
                case "3" -> forgetPassword(userData, sc);
                case "4" -> {
                    System.out.println("感谢您的使用,再见");
                    return;
                }
                default -> System.out.println("输入错误,请重新输入");
            }
        }
    }

    public static void login(ArrayList<User> list, ArrayList<Student> infoList, Scanner sc) {
        String userName, password, passwordEntered, verificationCode, verificationCodeEntered;
        int maxTry = 3;
        System.out.println("请输入用户名:");
        userName = sc.next();
        if (getUserIndex(list, userName) == -1) {
            System.out.println("用户名不存在,请先注册");
            return;
        }
        password = list.get(getUserIndex(list, userName)).getPassword();
        verificationCode = generateVerificationCode();
        System.out.println("注册的手机号码收到的验证码为:" + verificationCode);
        for (int i = 0; i < maxTry; i++) {
            System.out.println("请输入密码:");
            passwordEntered = sc.next();
            System.out.println("请输入验证码:");
            verificationCodeEntered = sc.next();
            boolean match = password.equals(passwordEntered) && verificationCode.equals(verificationCodeEntered);
            if (match) {
                break;
            } else {
                if (i == maxTry - 1) {
                    System.out.println("密码或验证码错误,请联系管理员");
                    return;
                } else {
                    System.out.println("密码或验证码错误,请重新输入");
                    System.out.println("您还有" + (maxTry - i - 1) + "次机会");
                }
            }
        }
        StudentInfoSysRun(infoList, sc);
    }

    public static void register(ArrayList<User> list, Scanner sc) {
        String userName, password, passwordConfirm, idCardNumber, mobileNumber;

        while (true) {
            System.out.println("请输入要创建的用户名:");
            userName = sc.next();
            if (getUserIndex(list, userName) != -1) {
                System.out.println("用户名已存在,请重新输入");
            } else if (!userNameValidation(userName)) {
                System.out.println("用户名不符合要求(要求如下), 请重新输入:");
                System.out.println("1: 长度为3-15个字符\n2: 必须包含字母和数字\n3: 不能包含特殊字符");
            } else break;
        }

        while (true) {
            System.out.println("请输入选择的密码:");
            password = sc.next();
            System.out.println("请再次输入选择的密码:");
            passwordConfirm = sc.next();
            if (!password.equals(passwordConfirm)) {
                System.out.println("两次密码不一致,请重新输入");
            } else break;
        }

        while (true) {
            System.out.println("请输入您的身份证号:");
            idCardNumber = sc.next();
            if (!idCardNumberValidation(idCardNumber)) {
                System.out.println("身份证号格式错误,请重新输入");
            } else break;
        }

        while (true) {
            System.out.println("请输入您的手机号:");
            mobileNumber = sc.next();
            if (!mobileNumberValidation(mobileNumber)) {
                System.out.println("手机号格式错误,请重新输入");
            } else break;
        }

        list.add(new User(userName, password, idCardNumber, mobileNumber));
        System.out.println("注册成功,请登录");
    }

    public static void forgetPassword(ArrayList<User> list, Scanner sc) {
        String userName, idCardNumber, idCardNumberEntered;
        String mobileNumber, mobileNumberEntered, newPassword, newPasswordConfirm;
        System.out.println("请输入用户名:");
        userName = sc.next();
        int index = getUserIndex(list, userName);
        if (index == -1) {
            System.out.println("用户名不存在,请先注册");
            return;
        }
        idCardNumber = list.get(index).getIdCardNumber();
        mobileNumber = list.get(index).getMobileNumber();
        System.out.println("请输入身份证号:");
        idCardNumberEntered = sc.next();
        System.out.println("请输入手机号:");
        mobileNumberEntered = sc.next();
        boolean match = idCardNumber.equalsIgnoreCase(idCardNumberEntered) && mobileNumber.equals(mobileNumberEntered);
        if (!match) {
            System.out.println("账号信息不匹配,修改失败");
            return;
        }
        while (true) {
            System.out.println("请输入新密码:");
            newPassword = sc.next();
            System.out.println("请再次输入新密码:");
            newPasswordConfirm = sc.next();
            if (!newPassword.equals(newPasswordConfirm)) {
                System.out.println("两次密码不一致,请重新输入");
            } else break;
        }
        list.get(index).setPassword(newPassword);
        System.out.println("密码修改成功,请登录");
    }

    public static int getUserIndex(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    public static String generateVerificationCode() {
        Random random = new Random();
        char[] array = new char[5];
        for (int i = 0; i < array.length - 1; i++) {
            int caseFlag = random.nextInt(2);
            int letterFlag = random.nextInt(26);
            if (caseFlag == 0) {
                array[i] = (char) (letterFlag + 'a');
            } else {
                array[i] = (char) (letterFlag + 'A');
            }
        }
        array[array.length - 1] = (char) (random.nextInt(10) + '0');
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(array.length);
            char temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return new String(array);
    }

    public static boolean userNameValidation(String userName) {
        if (userName.length() < 3 || userName.length() > 15) return false;
        char[] chars = userName.toCharArray();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int digitCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') lowerCaseCount++;
            else if (chars[i] >= 'A' && chars[i] <= 'Z') upperCaseCount++;
            else if (chars[i] >= '0' && chars[i] <= '9') digitCount++;
            else return false;
        }
        int alphabetCount = lowerCaseCount + upperCaseCount;
        return alphabetCount != 0 && digitCount != 0;
    }

    public static boolean idCardNumberValidation(String idCardNumber) {
        if (idCardNumber.length() != 18) return false;
        char[] chars = idCardNumber.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] < '0' || chars[i] > '9') return false;
        }
        if (chars[0] == '0') return false;
        char lastChar = chars[chars.length - 1];
        return lastChar == 'X' || lastChar == 'x' || (lastChar >= '0' && lastChar <= '9');
    }

    public static boolean mobileNumberValidation(String mobileNumber) {
        char[] chars = mobileNumber.toCharArray();
        if (chars.length != 11) return false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') return false;
        }
        if (chars[0] == '0') return false;
        return true;
    }

    public static void StudentInfoSysRun(ArrayList<Student> list, Scanner sc) {
        while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------\n1：添加学生\n2：删除学生\n3：修改学生\n4：查询学生\n5：退出\n请输入您的选择:");
            switch (sc.next()) {
                case "1" -> addStudent(list, sc);
                case "2" -> deleteStudent(list, sc);
                case "3" -> updateStudent(list, sc);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("感谢您的使用,返回登陆界面");
                    System.out.println("-----------------------------------------");
                    return;
                }
                default -> System.out.println("您的输入有误,请重新输入");
            }
        }
    }

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

