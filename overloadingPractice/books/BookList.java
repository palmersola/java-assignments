package overloadingPractice.books;

import overloadingPractice.books.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("To Kill a Mockingbird", 281, 1960));
        books.add(new Book("Moby Dick", 427));
        books.add(new Book("Lord of the Rings"));


        System.out.println("Loop will break when no name is given.");
        while (true) {
            System.out.println("Title of book:");
            String title = scanner.nextLine();

            if(title.equals("")) break;

            System.out.println("Number of pages:");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Year book was published:");
            int year = scanner.nextInt();
            scanner.nextLine();
            books.add(new Book(title, pages, year));

        };

        System.out.println("What information would you like printed? everything/title");
        String printOut = scanner.nextLine();

        for (Book book: books) {
            System.out.println((printOut.equalsIgnoreCase("everything"))? book.toString(): book.getTitle());
        }
    }
}
