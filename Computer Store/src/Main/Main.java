package Main;

import Component.CPU;
import Component.Display;
import Computer.Desktop;
import Computer.Laptop;
import Computer.SmartWatch;

public class Main {
    public static void main(String[] args) {

        ComputerStore store = new ComputerStore();
        store.addComputer(new Desktop("Intel",new CPU(2.3,Math.pow(10,9)),new Display(1920,1080)));

        store.addComputer(new Desktop("AMD",new CPU(2.5,2*Math.pow(10,9)),new Display(2560,1440)));


        store.addComputer(new Laptop("Dell",new CPU(2.1,Math.pow(10,9)),new Display(1366,768),50));

        store.addComputer(new SmartWatch("Xiaomi",new CPU(1.6,Math.pow(10,9)),new Display(220,176),100));

        store.listComputers();


    }
}