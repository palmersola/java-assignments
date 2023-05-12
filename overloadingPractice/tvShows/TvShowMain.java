package overloadingPractice.tvShows;

import overloadingPractice.tvShows.TvShow;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> shows = new ArrayList<>();

        shows.add(new TvShow("Friends"));
        shows.add(new TvShow("Breaking Bad", 62));
        shows.add(new TvShow("Game of Thrones", "Fantasy"));
        shows.add(new TvShow("Johnny Test", 117, "Animation"));


        System.out.println("Loop will break when no name is given.");
        while (true) {
            System.out.println("Name of show:");
            String name = scanner.nextLine();

            if(name.equals("")) break;

            System.out.println("Number of episodes:");
            int episodes = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Genre the show belongs to:");
            String genre = scanner.nextLine();
            shows.add(new TvShow(name, episodes, genre));

        };

        for (TvShow show: shows) {
            System.out.println(show.toString());
        }
    }
}
