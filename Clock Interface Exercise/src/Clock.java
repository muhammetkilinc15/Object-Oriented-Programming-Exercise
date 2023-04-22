abstract class Clock implements Common_Clock {
    public int hour;
    public int minute;
    public int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public void reset() {
        this.hour = Common_Clock.hour;
        this.minute = Common_Clock.minute;
        this.second = Common_Clock.second;

    }
    interface Common_Clock {
        public int hour = 23;
        public int minute = 59;
        public int second = 59;

        public abstract void reset();

        public abstract String display();
    }
}
