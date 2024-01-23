import store.models.Bread;
import store.models.Chocolate;
import store.models.Coke;
import store.models.ProductForSale;

public class Store {
    public static void main(String[] args) {


        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("dessert", 30.5, "Handmade Chocolate", "white", Boolean.TRUE);
        products[1] = new Bread("bakery", 10, "zero sugar", "white", "brown");
        products[2] = new Coke("beverage", 25, "extremely unhealthy but delicious", Boolean.TRUE, 1);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}