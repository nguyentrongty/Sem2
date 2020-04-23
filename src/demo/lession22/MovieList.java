package lession22;

import java.util.ArrayList;

public class MovieList {

    private ArrayList<String> movieList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Movie List ===");
        System.out.println("-------------------");

        MovieList list = new MovieList();
        list.addMovie("Titanic");
        list.addMovie("Catch me of you can");
        list.addMovie("song o day song");
        list.addMovie("Noting hills");

        list.displayList();

    }

    public void addMovie(String movie) {
        movieList.add(movie);
    }

    public void displayList() {
        System.out.println("You have " + movieList.size() + " items in");
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println("Movie " + (i + 1) + " : " + movieList.get(i));
        }
    }

    public void updateMovie(int index, String movie) {
        movieList.set(index, movie);
        System.out.println("Updated");
        System.out.println("Movie " + (index + 1) + "" + movie);
    }

    public void removeMovie(int index) {
        String movie = movieList.get(index);
        movieList.remove(index);
        System.out.println("Remove " + movie);
    }

    public String findMovie(String search) {
        int position = movieList.indexOf(search);
        if (position > 0) {
            return movieList.get(position);
        }
        return null;
    }

}
