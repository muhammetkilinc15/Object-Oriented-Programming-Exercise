package Computer;

import Component.Component;
import Component.CPU;

public class Laptop extends Computer {
    private int cameraCost;

    public Laptop(String modeName, Component cpu, Component display, int cameraCost) {
        super(modeName, cpu, display);
        this.cameraCost = cameraCost;
    }

    @Override
    public double price() {
        return super.price() + getCameraCost();
    }

    @Override
    public boolean isWearable() {
        return false;
    }

    @Override
    public boolean isPortable() {
        return true;
    }

    public int getCameraCost() {
        return cameraCost;
    }

    public void setCameraCost(int cameraCost) {
        this.cameraCost = cameraCost;
    }
    @Override
    public String toString() {
        return "Laptop:" +
                "\n- cameraCost=" + getCameraCost() +
                "\n- modeName=" + getModeName() +
                "\n- "+getCpu() +
                "\n- " + getDisplay() +
                "\n- price: " + String.format("%.2f", price());
    }
}
