package examples;

public class StringDemo12 {
    public static void main(String[] args) {
        String talk = "你玩的真好,SB,以后不要再玩了,TMD";
        String[] arr = {"TMD", "CNM", "SB", "MLGB"};
        String newTalk = talk;
        for (int i = 0; i < arr.length; i++) {
            newTalk = newTalk.replace(arr[i], "***");
        }
        System.out.println(newTalk);
    }
}
