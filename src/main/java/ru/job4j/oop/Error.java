package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public void printInfo() {
        System.out.println("Условие: " + active);
        System.out.println("Код: " + status);
        System.out.println("Программа: " + message);
    }

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 1, "Работает");
        error1.printInfo();
        Error error2 = new Error(false, 0, "Не работает");
        error2.printInfo();
    }

}