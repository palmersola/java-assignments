package libraryManagment;

import java.util.ArrayList;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> library = new LibraryManager<>();

        Book test = new Book("Test Title", 1945, "Steve", "adgs678asd6g9");
        DVD cd = new DVD("Cool DVD", 2003, "Micheal", 120);

        library.addItem(test);
        library.addItem(cd);
        library.displayItems();
        System.out.println(test.getItemType());
        library.deleteItem(cd);
        library.displayItems();
    }
}
