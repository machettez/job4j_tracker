package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11 спичек:");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + ", введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            int left = count - matches;
            if (matches == 1) {
                System.out.println("На столе осталось " + left + " спичек");
                count = left;
                turn = !turn;
            } else if (matches == 2 && count >= 2) {
                System.out.println("На столе осталось " + left + " спичек");
                count = left;
                turn = !turn;
            } else if (matches == 3 && count >= 3) {
                System.out.println("На столе осталось " + left + " спичек");
                count = left;
                turn = !turn;
            } else {
                System.out.println("Ошибка");
            }
            System.out.println();
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }

}
