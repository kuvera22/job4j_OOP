package ru.job4j.module3incapulation;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 16);
        Book book2 = new Book("Veronika", 90);
        Book book3 = new Book("Mami", 368);
        Book book4 = new Book("Ochen smoshnie", 3933);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        System.out.println("My books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }

        System.out.println(System.lineSeparator() + "Swap 0 and 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }

        System.out.println(System.lineSeparator() + "Only CleanCode");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPages());
            }
        }
    }
}
