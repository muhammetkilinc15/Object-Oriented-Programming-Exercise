public class Phone_With_Camera_Radio extends Phone_With_Camera {
    public int currentChannel;

    public Phone_With_Camera_Radio(String brand, String model, int maxPhotos) {
        super(brand, model, maxPhotos);
    }

    public int previousChannel() {
        if (this.currentChannel > 0) {
            this.currentChannel--;
        }
        return this.currentChannel;
    }

    public int nextChannel() {
        return ++this.currentChannel;
    }

    @Override
    public String toString() {
        return super.toString()+"Current radio: "+this.currentChannel;
    }
}
