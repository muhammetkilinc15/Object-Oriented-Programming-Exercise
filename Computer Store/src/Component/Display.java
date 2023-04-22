package Component;

import Component.Component;

public class Display extends Component {
    private int width;
    private int height;
    private String resolution;
    private final double productionCostPerPixel = 0.0001;

    public Display(int width, int height) {
        this.width = width;
        this.height = height;
        this.resolution = width + "x" + height;
    }


    @Override
    public double productionCost() {
        return this.height * this.width * this.productionCostPerPixel;
    }

    @Override
    public double profitRate() {
        return 0.25;
    }

    @Override
    public double price() {
        return (productionCost() * profitRate()) + productionCost();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getProductionCostPerPixel() {
        return productionCostPerPixel;
    }

    @Override
    public String toString() {
        return "Display=" +
                "width=" + width +
                ", height=" + height +
                ", resolution=" + resolution +
                ", productionCostPerPixel=" + productionCostPerPixel +
                ", productionCost=" + String.format("%.2f", productionCost()) +
                ", price=" + String.format("%.2f",price());
    }
}
