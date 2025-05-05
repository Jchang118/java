package examples.Test2;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100, '男');
        Role r2 = new Role("鸠摩智", 100, '男');

        r1.showRoleInfo();
        r2.showRoleInfo();

        while (true) {
            r1.attach(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r2.getName() + "被" + r1.getName() + "杀死了");
                break;
            }
            r2.attach(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r1.getName() + "被" + r2.getName() + "杀死了");
                break;
            }
        }
    }
}
