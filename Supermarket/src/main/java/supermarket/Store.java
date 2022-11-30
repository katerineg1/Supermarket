package supermarket;

public class Store {
        public String name;
        public int quantity;
        public String description;
        public float price;

    public Store(String name, int quantity, String description, float price) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}



