package store.models;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public double getSalesPrice(int quantity) {
        return quantity + getPrice();
    }

    ;

    public abstract void showDetails();

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {

        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {

        return description;
    }
    @Override
    public String toString() {
        return "ProductForSale{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

}
