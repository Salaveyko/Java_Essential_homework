package GroceryStore;

/**
 * The Price class contains the productName, storeName and price fields.
 * Compares by storeName.
 */
public class Price implements Comparable<Price> {
    private String productName;
    private String storeName;
    private double price;

    public Price() {
    }

    public Price(String productName, String storeName, double price) {
        this.productName = productName;
        this.storeName = storeName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return storeName + ":\t" + productName + " - $" + price;
    }

    @Override
    public int compareTo(Price other) {
        return this.storeName.compareTo(other.storeName);
    }
}
