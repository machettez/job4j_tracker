package ru.job4j.poly;

public class PolyUsage {

    public static void main(String[] args) {
        Vehicle plain = new Plain();
        Vehicle train = new Train();
        Vehicle bus = new NewBus();

        Vehicle[] vehicles = new Vehicle[] {plain, train, bus};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }

}
