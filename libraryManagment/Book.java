package libraryManagment;

public class Book extends LibraryItem {
     private String author;
     private String ISBN;

     public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    String getItemType() {
        return "Type: Book";
    }

    @Override
    String getItemDetails() {
        return ("Title: " + this.getTitle() + "  Year: " + this.getReleaseYear() +
                "  Author: " + author + "  ISBN: " + ISBN);
    }
}
