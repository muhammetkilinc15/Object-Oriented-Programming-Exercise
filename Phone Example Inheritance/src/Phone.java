public class Phone {
    private String brand;
    private String model;
    private SIM SIM1;
    public boolean IsOpened;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSIM1(SIM SIM1) {
        this.SIM1 = SIM1;
    }
    public String toString(){
        return "Brand: "+this.brand+" Model: "+this.model+" SIM detail: "+SIM1.toString();
    }
}
