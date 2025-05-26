public class Product {

    public int id;
    public String description;
    public double price;
    public int quantity;


    public Product(int id, String description, double price, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }


    public void displayProductInfo() {
        System.out.println("Product ID:  " + id);
        System.out.println("Description: " + description);
        System.out.println("Price: LE    " + price);
        System.out.println("Quantity:    " + quantity);
        System.out.println("---------------------------");
    }
}
