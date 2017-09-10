package chapter12;

@Deprecated
public class DeprecatedAnnotation {
    private String msg;

    DeprecatedAnnotation(String m) {
        msg = m;
    }

    @Deprecated
    String getMsg() {
        return msg;
    }
}
