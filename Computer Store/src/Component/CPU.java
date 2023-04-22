package Component;

import Component.Component;

public class CPU extends Component {
    private double frequency;
    private double numTransistors;

    public CPU(double frequency, double numTransistors) {
        this.frequency = frequency;
        this.numTransistors = numTransistors;
    }

    @Override
    public String toString() {
        return "CPU=" +
                "frequency=" + getFrequency() +
                ", numTransistors=" + getNumTransistors() +
                ", price= "+String.format("%.2f",price());
    }

    @Override
    public double productionCost() {
        return this.frequency * 50;
    }

    @Override
    public double profitRate() {
        if (this.frequency > 2.4) {
            return 0.3;
        }
        return 0.2;
    }

    @Override
    public double price() {
        return (profitRate()*productionCost())+ productionCost();
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getNumTransistors() {
        return numTransistors;
    }

    public void setNumTransistors(double numTransistors) {
        this.numTransistors = numTransistors;
    }
}
