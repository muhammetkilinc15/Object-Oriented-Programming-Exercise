package Main;

import Computer.Computer;

import java.util.ArrayList;

public class ComputerStore {

    private ArrayList<Computer> computers;

    public ComputerStore(){
        computers=new ArrayList<>();
    }
    public void addComputer(Computer computer){
        computers.add(computer);
    }
    public void listComputers(){
        for (Computer c:computers) {
            System.out.println(c);
            System.out.println("-------------------------------------------------------------------------------");
        }
    }
}
