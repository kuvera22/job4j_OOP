package ru.job4j.module1;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(message);
        System.out.println(status);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 45, "exist");
        Error error3 = new Error(false, 38, "not exist");

        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
