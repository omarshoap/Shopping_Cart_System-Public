
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "mouse", 100, 3);
        Product product2 = new Product(2, "keyboard", 200, 3);
        Product product3 = new Product(3, "camera", 300, 3);


        ShoppingCart cart = new ShoppingCart();


        cart.addProductToCart(product1);
        cart.addProductToCart(product2);
        cart.addProductToCart(product3);


        cart.displayCartContents();


        double totalCost = cart.calculateTotalCost();
        System.out.println("Total Cost: LE " + totalCost);
    }
}
