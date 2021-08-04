package web.model;

public class Car {

    private String model;
    private int series;
    private int price;

    public Car(String model, int series, int price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}