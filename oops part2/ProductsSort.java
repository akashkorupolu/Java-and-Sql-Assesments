import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    String prodname;
    private int price;

    public Product(String prodname, int price) {
        this.prodname = prodname;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return prodname + " - " + price;
    }
}


class SortByName implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.prodname.compareToIgnoreCase(p2.prodname);
    }
}

class SortByPrice implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getPrice(), p2.getPrice());
    }
}

public class ProductsSort {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 5000));
        products.add(new Product("Mobile", 2000));
        products.add(new Product("Tablet", 3000));

        System.out.println("Sort by Name:");
        Collections.sort(products, new SortByName());
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\nSort by Price:");
        Collections.sort(products, new SortByPrice());
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
