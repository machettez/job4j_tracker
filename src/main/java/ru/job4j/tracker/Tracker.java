package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int test = 0;
        Item[] rsl = new Item[size];
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                rsl[test] = items[i];
                test++;
            }
        }
        return Arrays.copyOf(rsl, test);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                rsl = items[i];
                break;
            }
        }
        return rsl;
    }

}