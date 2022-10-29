package ru.job4j.poly;

public class NewBus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " выезжает на скоростную трассу...");
    }

}
