package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book first = new Book("First Book", 25);
        Book second = new Book("Second Book", 50);
        Book third = new Book("Third Book", 75);
        Book fourth = new Book("Clean Code", 100);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (Book bk : books) {
            System.out.println(bk.getName() + ": " + bk.getCount());
        }
        System.out.println("\nМеняем местами книги с индексом 0 и 3:\n");
        books[0] = fourth;
        books[3] = first;
        for (Book bk : books) {
            System.out.println(bk.getName() + ": " + bk.getCount());
        }
        System.out.println("\nТолько Clean Code:\n");
        for (Book bk : books) {
            if ("Clean Code".equals(bk.getName())) {
                System.out.println(bk.getName() + ": " + bk.getCount());
            }
        }
    }

}
