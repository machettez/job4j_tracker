package ru.job4j.io;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Привет! Как вас зовут?");
        String name = input.nextLine();
        System.out.println(name + ", рад вас видеть!");
    }

}
