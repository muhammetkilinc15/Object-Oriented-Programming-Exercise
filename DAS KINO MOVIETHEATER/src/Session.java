public class Session {
    Movie movie;
    Hall hall;
    String day;
    String time;

    public Session() {
    }

    public Session(Movie movie, Hall hall, String day, String time) {
        this.movie = movie;
        this.hall = hall;
        this.day = day;
        this.time = time;
    }
}
