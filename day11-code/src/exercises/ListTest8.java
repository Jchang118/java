package exercises;

import java.util.ArrayList;

public class ListTest8 {
    public static void main(String[] args) {
        ArrayList<Mobile> list = new ArrayList<>();

        Mobile mobile1 = new Mobile("小米", 1000);
        Mobile mobile2 = new Mobile("苹果", 8000);
        Mobile mobile3 = new Mobile("锤子", 2999);

        list.add(mobile1);
        list.add(mobile2);
        list.add(mobile3);

        ArrayList<Mobile> result = getListLessThanPrice(list, 3000);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getBrand() + " " + result.get(i).getPrice());
        }
    }

    public static ArrayList<Mobile> getListLessThanPrice(ArrayList<Mobile> list, int price) {
        ArrayList<Mobile> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < price) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
