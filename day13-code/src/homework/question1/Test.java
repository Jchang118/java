package homework.question1;

public class Test {
    public static void main(String[] args) {
        Lecturer l1 = new Lecturer("1", "John", "Lecturer");
        Buyer b1 = new Buyer("2", "Tom", "Buyer");
        Maintainer m1 = new Maintainer("3", "Mike", "Maintainer");
        Tutor t1 = new Tutor("4", "Jane", "Tutor");

        l1.work();
        b1.work();
        m1.work();
        t1.work();
    }
}
