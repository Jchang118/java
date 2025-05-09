package examples;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}

