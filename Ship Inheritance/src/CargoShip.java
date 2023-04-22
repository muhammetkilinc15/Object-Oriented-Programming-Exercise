public class CargoShip extends Ship{
    private int tonnage;

    public CargoShip(String name, String yearBuilt, int tonnage) {
        super(name, yearBuilt);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nCargo capacity: " + tonnage+" tons"+
                "\n--------------------------------";
    }
}
