package homework.question2;

public class Test {
    static void useMobile(Mobile x) {
        System.out.println("我正在使用" + x.getBrand() + "手机");
        x.call();
        x.sendMessage();
        if (x instanceof NewMobile nm) {
            nm.play();
        }
    }

    public static void main(String[] args) {
        NewMobile nm1 = new NewMobile("苹果", 9999);
        OldMobile om1 = new OldMobile("诺基亚", 399);

        Mobile test1 = nm1;
        Mobile test2 = om1;

        useMobile(test1);
        useMobile(test2);
    }
}
