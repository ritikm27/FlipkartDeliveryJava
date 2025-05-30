package FlipkartDelivery;

public class Item {
    private int price;
    private String category;
    private String brand;
    private int quantity;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(String brand, String category, int price, int quantity){
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(String brand, String category, int price){
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.quantity = 1;
    }

    public void updateQuantity(int quantity){
        this.quantity = this.quantity + quantity;
        return;
    }

    public String toString(){
        String string = brand + " " + category + " " + price + " " + quantity;
        return string;
    }
}
