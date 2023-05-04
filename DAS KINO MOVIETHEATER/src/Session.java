public class Session {
    public Movie movie;
    public Hall hall;
    public String day;
    public String time;

    public Session() {
    }

    public Session(Movie movie, Hall hall, String day, String time) {
        this.movie = movie;
        this.hall = hall;
        this.day = day;
        this.time = time;
    }
}
