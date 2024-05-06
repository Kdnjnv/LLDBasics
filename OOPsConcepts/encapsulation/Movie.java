package OOPsConcepts.encapsulation;

public class Movie {
    private String name;
    private int year;
    private String genre;

    public Movie(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public Movie() {
        this.name = "";
        this.year = -1;
        this.genre = "";
    }

    //setter and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
