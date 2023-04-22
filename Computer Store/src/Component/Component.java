package Component;

import Main.SaleItem;

public abstract class Component implements SaleItem {
    public abstract double productionCost();
    public abstract double profitRate();
    @Override
    public double price() {
        return 0;
    }
}
