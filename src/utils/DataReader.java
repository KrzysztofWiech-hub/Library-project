package utils;

import data.Book;
import data.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner scanner;

    public DataReader() {
        scanner = new Scanner(System.in);
    }

    public void close() {
        scanner.close();
    }

    public int getInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public Book readAndCreateBook() {

        System.out.println("Tytuł: ");
        String title = scanner.nextLine();

        System.out.println("Autor: ");
        String author = scanner.nextLine();

        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();

        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();

        System.out.println("Rok wydania: ");
        int relaseDate = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ilość Stron: ");
        int pages = scanner.nextInt();
        scanner.nextLine();

        return new Book(title, author, relaseDate, pages, publisher, isbn);

    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("Język: ");
        String language = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Miesiąc: ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dzień: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        return new Magazine(title, publisher, language, year, month, day);
    }

}
