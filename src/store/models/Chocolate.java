package store.models;

public class Chocolate extends ProductForSale {

    private String color;
    private boolean hasSugar;

    public Chocolate(String type, double price, String description, String color, boolean hasSugar) {
        super(type, price, description);
        this.color = color;
        this.hasSugar = hasSugar;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "colors'" + color + '\'' +
                ", hasSugar=" + hasSugar + '}';
    }
}
