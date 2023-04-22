package Computer;

import Component.Component;
import Computer.Computer;

public class SmartWatch extends Computer {
    private int buckleCost;

    public SmartWatch(String modeName, Component cpu, Component display, int buckleCost) {
        super(modeName, cpu, display);
        this.buckleCost = buckleCost;
    }

    @Override
    public double price() {
        return super.price() + getBuckleCost();
    }

    @Override
    public boolean isWearable() {
        return true;
    }

    @Override
    public boolean isPortable() {
        return true;
    }

    @Override
    public String toString() {
        return "SmartWatch:" +
                "\n- buckleCost=" + buckleCost +
                "\n- modeName=" + modeName  +
                "\n- " + getCpu() +
                "\n- " + getDisplay() +
                "\n- price=" + price();
    }

    public int getBuckleCost() {
        return buckleCost;
    }

    public void setBuckleCost(int buckleCost) {
        this.buckleCost = buckleCost;
    }
}
