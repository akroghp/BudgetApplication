package Application;

public class Item {
    private double price;
    private String category;
    private String itemName;

    public Item(double price, String category, String itemName) {
        this.price = price;
        this.category = category;
        this.itemName = itemName;
    }

    public Item(double price, String category) {
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
