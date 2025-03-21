class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Category: " + category +
                ", Price: $" + price + ", Stock: " + stockQuantity);
    }
}
