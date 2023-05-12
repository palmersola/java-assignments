package overloadingPractice.tvShows;

public class TvShow {
    private final String name;
    private int episodes;
    private String genre;

    public TvShow(String name){
        this.name = name;
    }

    public TvShow(String name, String genre){
        this.name = name;
        this.genre = genre;
    }

    public TvShow(String name, int episodes){
        this.name = name;
        this.episodes = episodes;
    }


    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getName() + " with " + getEpisodes() + " episodes. The genre is " + getGenre();
    }

}
