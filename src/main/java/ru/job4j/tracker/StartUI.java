package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item currentTime = new Item();
        Item newCurrentTime = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentTimeFormat = currentTime.getTime().format(formatter);
        System.out.println(currentTimeFormat);
        System.out.println(newCurrentTime);
    }

}
