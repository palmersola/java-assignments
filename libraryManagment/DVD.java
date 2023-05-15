package libraryManagment;

public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, int releaseYear, String director, int  duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }


    @Override
    String getItemType() {
        return "Type: DVD";
    }

    @Override
    String getItemDetails() {
        return ("Title: " + this.getTitle() + "  Year: " + this.getReleaseYear() +
                "  Director: " + director + "  Duration: " + duration);
    }
}
