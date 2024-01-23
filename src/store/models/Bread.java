package store.models;

public class Bread extends ProductForSale {
    private String flourType;

    private String color;

    public Bread(String type, double price, String description, String flourType, String color) {
        super(type, price, description);
        this.flourType = flourType;
        this.color = color;
    }


    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flourType='" + flourType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
