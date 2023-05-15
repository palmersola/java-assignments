package libraryManagment;

abstract class LibraryItem {
     private String title;
     private int releaseYear;

    public LibraryItem(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    abstract String getItemType();

    abstract String getItemDetails();

}
