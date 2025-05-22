package homework.question3;

public class Test1 {
    public static void main(String[] args) {
        new IPlay() {
            @Override
            public void playGame() {
                System.out.println("玩游戏");
            }
        }.playGame();
    }
}
