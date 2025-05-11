package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------欢迎来到黑马图书管理系统----------------\n1：添加图书\n2：删除图书\n3：修改图书\n4：打印图书信息\n5: 查询图书\n6: 退出\n请输入您的选择:");
            switch (sc.next()) {
                case "1" -> addBook(list, sc);
                case "2" -> deleteBook(list, sc);
                case "3" -> updateBook(list, sc);
                case "4" -> queryBook(list);
                case "5" -> queryBookByTitle(list, sc);
                case "6" -> {
                    System.out.println("感谢您的使用");
                    return;
                }
                default -> System.out.println("您的输入有误,请重新输入");
            }
        }
    }

    public static int getIndexById(ArrayList<Book> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexByTitle(ArrayList<Book> list, String title) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public static void addBook(ArrayList<Book> list, Scanner sc) {
        System.out.println("请输入图书id:");
        String id;
        while (true) {
            id = sc.next();
            if (getIndexById(list, id) != -1) {
                System.out.println("id已存在，请重新输入:");
            } else break;
        }
        System.out.println("请输入图书书名:");
        String title = sc.next();
        System.out.println("请输入图书作者:");
        String author = sc.next();
        System.out.println("请输入图书价格:");
        String price = sc.next();
        list.add(new Book(id, title, author, price));
        System.out.println("添加成功");
    }

    public static void deleteBook(ArrayList<Book> list, Scanner sc) {
        System.out.println("请输入要删除的图书id:");
        String id = sc.next();
        int index = getIndexById(list, id);
        if (index == -1) {
            System.out.println("id不存在, 返回主菜单");
        } else {
            list.remove(index);
            System.out.println("删除成功");
        }
    }

    public static void updateBook(ArrayList<Book> list, Scanner sc) {
        System.out.println("请输入要修改的图书id:");
        String id = sc.next();
        int index = getIndexById(list, id);
        if (index == -1) {
            System.out.println("id不存在, 返回主菜单");
        } else {
            System.out.println("请输入图书书名:");
            String title = sc.next();
            System.out.println("请输入图书作者:");
            String author = sc.next();
            System.out.println("请输入图书价格:");
            String price = sc.next();
            list.set(index, new Book(id, title, author, price));
            System.out.println("修改成功");
        }
    }

    public static void queryBook(ArrayList<Book> list) {
        if (list.size() == 0) {
            System.out.println("图书信息为空, 返回主菜单");
        } else {
            System.out.printf("%-12s%-12s%-12s%-12s\n", "图书id", "图书书名", "图书作者", "图书价格");
            for (int i = 0; i < list.size(); i++) {
                Book book = list.get(i);
                System.out.printf("%-12s%-12s%-12s%-12s\n", book.getId(), book.getTitle(), book.getAuthor(), book.getPrice());
            }
        }
    }

    public static void queryBookByTitle(ArrayList<Book> list, Scanner sc) {
        System.out.println("请输入要查询的图书的书名:");
        String title = sc.next();
        int index = getIndexByTitle(list, title);
        if (index == -1) {
            System.out.println("未查询到该书名, 返回主菜单");
        } else {
            Book book = list.get(index);
            System.out.println("查询到的图书信息如下:");
            System.out.printf("%-12s%-12s%-12s%-12s\n", "图书id", "图书书名", "图书作者", "图书价格");
            System.out.printf("%-12s%-12s%-12s%-12s\n", book.getId(), book.getTitle(), book.getAuthor(), book.getPrice());
        }
    }
}

