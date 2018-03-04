package oop.pset2.burgerhouse.model;

public class Menu {
    String dish;
    String type;
    Double price;

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dish='" + dish + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
