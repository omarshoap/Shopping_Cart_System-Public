
public class ShoppingCart {

    private Product[] cartItems;
    private int itemCount;


    public ShoppingCart() {
        this.cartItems = new Product[5];
        this.itemCount = 0;
    }


    public void addProductToCart(Product product) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = product;
            itemCount++;
            System.out.println("Product added to cart: " + product.description);
        } else {
            System.out.println("The cart is full and cannot add more products.");
        }
    }


    public double calculateTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost = totalCost + (cartItems[i].price * cartItems[i].quantity);
        }
        return totalCost;
    }


    public void displayCartContents() {
        System.out.println("==========================");
        System.out.println("##### Cart Contents  #####");
        System.out.println("==========================");

        for (int i = 0; i < itemCount; i++) {
            cartItems[i].displayProductInfo();
        }
    }
}
