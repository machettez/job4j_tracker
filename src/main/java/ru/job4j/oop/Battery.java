package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        System.out.println("first: " + charger.load + ". second: " + another.load);
        charger.exchange(another);
        System.out.println("first: " + charger.load + ". second: " + another.load);
    }

}
