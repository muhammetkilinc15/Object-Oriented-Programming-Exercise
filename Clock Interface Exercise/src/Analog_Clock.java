public class Analog_Clock extends Clock{
    public Analog_Clock(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    @Override
    public String display() {
        return "Hour: "+this.hour+" Minute: "+this.minute+" Second: "+this.second;
    }
}
