package interface_intro.demo6;

public interface InterB {
    public default void show(){
        System.out.println("InterB接口中的默认方法 ---- show");
    }
}
