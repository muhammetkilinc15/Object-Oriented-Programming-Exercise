import java.util.Date;

public class Digital_Clock extends Clock implements Cloneable {
    private Date date;

    public Digital_Clock(int hour, int minute, int second) {
        super(hour, minute, second);
        this.date = new Date();
    }

    @Override
    public String display() {
        this.hour = this.hour % 12;
        return "Hour: "+this.hour+" Minute: "+this.minute+" Second: "+this.second+"\nDate: "+date.toString();

    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
