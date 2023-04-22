package Computer;

import Main.SaleItem;
import Component.Component ;

public abstract class Computer implements SaleItem {
    protected String modeName;
    protected Component cpu;
    protected Component display;

    public Computer(String modeName, Component cpu, Component display) {
        this.modeName = modeName;
        this.cpu = cpu;
        this.display = display;
    }

    @Override
    public double price() {
        return cpu.price() + display.price();
    }
    public abstract boolean isWearable();
    public abstract boolean isPortable();

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public Component getCpu() {
        return cpu;
    }

    public void setCpu(Component cpu) {
        this.cpu = cpu;
    }

    public Component getDisplay() {
        return display;
    }

    public void setDisplay(Component display) {
        this.display = display;
    }
}

