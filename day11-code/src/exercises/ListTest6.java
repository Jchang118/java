package exercises;

import java.util.ArrayList;

public class ListTest6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "123456");
        User u3 = new User("heima003", "lisi", "123456");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(idContains(list, "heima001"));
        System.out.println(idContains(list, "heima004"));
    }

    public static boolean idContains(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) return true;
        }
        return false;
    }
}
