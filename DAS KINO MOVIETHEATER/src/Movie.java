public class Movie {
    String name;
    String director;
    int year;
    Integer duration; // filmin süresi

    public  Movie(){

    }
    public Movie(String name, String director, int year, Integer duration) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.duration = duration;
    }
}
