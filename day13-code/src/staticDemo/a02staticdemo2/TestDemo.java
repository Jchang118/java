package staticDemo.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double avg = ArrayUtil.getAvg(arr2);
        System.out.println(avg);
    }
}
