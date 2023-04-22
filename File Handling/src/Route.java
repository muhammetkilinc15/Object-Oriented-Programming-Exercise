public class Route {
    public String current;
    public String destination;
    public int taken_route;
    public int time;
    public int cost;

    public Route(String current, String destination, int taken_route, int time, int cost) {
        this.current = current;
        this.destination = destination;
        this.taken_route = taken_route;
        this.time = time;
        this.cost = cost;
    }

    public double get_Average_Route() throws InvalidTime {
        if (this.time == 0) {
            throw new InvalidTime("Time must be greater than 0");
        }
        return (double) this.taken_route / this.time;
    }

    public double get_Average_Cost() throws InvalidTime {
        if (this.time == 0) {
            throw new InvalidTime("time must be greater than 0");
        }
        return (double) this.cost / this.time;
    }
}
