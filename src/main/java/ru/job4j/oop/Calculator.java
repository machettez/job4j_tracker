package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return a * x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int y, int a) {
        return sum(y) + minus(y) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        result = Calculator.minus(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println(result);
        result = calculator.divide(5);
        System.out.println(result);
        result = calculator.sumAllOperation(10, 5);
        System.out.println(result);
    }
}