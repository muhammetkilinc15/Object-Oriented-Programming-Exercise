public class Phone_With_Camera extends Phone {
    public int numberOfPhotos;
    private String[] takenPhotos;
    public int maxPhotos;

    public Phone_With_Camera(String brand, String model, int maxPhotos) {
        super(brand, model);
        this.maxPhotos = maxPhotos;
        this.takenPhotos = new String[this.maxPhotos];
    }

    public int takePhoto() {
        String name = "photo" + this.numberOfPhotos + ".jpg";
        takenPhotos[this.numberOfPhotos++] = name;
        return this.numberOfPhotos;
    }

    public int takePhoto(String name) {
        this.takenPhotos[numberOfPhotos++]=name;
        return this.numberOfPhotos;
    }

    public String getAllPhotos() {
        String all = "";
        for (int i = 0; i < numberOfPhotos; i++) {
            all += this.takenPhotos[i] + "\n";
        }
        return all;
    }

    @Override
    public String toString() {
        return super.toString() +"Photos: \n"+this.getAllPhotos();
    }
}
