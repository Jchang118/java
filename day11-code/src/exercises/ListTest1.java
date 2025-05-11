package exercises;

import java.util.ArrayList;

public class ListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("点赞了吗?");
        list.add("收藏了吗?");
        list.add("关注了吗?");
        list.add("评论了吗?");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
