import java.util.ArrayList;
import java.util.List;

class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

class CartItem {
    private final Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Quantity must be positive");
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void increaseQuantity(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        quantity += amount;
    }
    public double subtotal() { return product.getPrice() * quantity; }
}

class ShoppingCart {
    private final List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getName().equalsIgnoreCase(product.getName())) {
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void displayCart() {
        double total = 0;
        for (CartItem item : items) {
            double subtotal = item.subtotal();
            total += subtotal;
            System.out.printf("%s x %d = Rs. %.2f%n",
                    item.getProduct().getName(), item.getQuantity(), subtotal);
        }
        System.out.printf("Total: Rs. %.2f%n", total);
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Keyboard", 1200), 1);
        cart.addProduct(new Product("Mouse", 600), 2);
        cart.addProduct(new Product("Keyboard", 1200), 1);
        cart.displayCart();
    }
}
