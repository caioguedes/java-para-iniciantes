package chapter8;

public interface MyIF {
    int getUserID();
    default int getAdminID() {
        return 1;
    }
}
