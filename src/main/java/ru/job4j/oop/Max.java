package ru.job4j.oop;

public class Max {

    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int result = first;
        if (max(second, first) == second && max(second, third) == second) {
            result = second;
        }
        if (max(third, first) == third && max(third, second) == third) {
            result = third;
        }
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = first;
        if (max(fourth, first, second) == fourth && max(fourth, first, third) == fourth && max(fourth, second, third) == fourth) {
            result = fourth;
        }
        return result;
    }

}
