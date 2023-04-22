package Computer;

import Component.Component;
import Computer.Computer;

public class Desktop extends Computer {


    public Desktop(String modeName, Component cpu, Component display) {
        super(modeName, cpu, display);
    }

    @Override
    public double price() {
        return super.price();
    }

    @Override
    public boolean isWearable() {
        return false;
    }

    @Override
    public boolean isPortable() {
        return false;
    }


    @Override
    public String toString() {
        return "Desktop: " +
                "\n- modeName=" + modeName  +
                "\n- " + cpu +
                "\n- " + display +
                "\n- price: " + String.format("%.2f", price());
    }
}
