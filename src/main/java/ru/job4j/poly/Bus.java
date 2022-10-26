package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров автобуса: " + count);
    }

    @Override
    public int fillPrice(int count) {
        return count * 50;
    }

}
