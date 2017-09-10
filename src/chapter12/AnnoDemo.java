package chapter12;

public class AnnoDemo {
    public static void main(String[] args) {
        DeprecatedAnnotation a = new DeprecatedAnnotation("test");
        System.out.println(a.getMsg());
    }
}
