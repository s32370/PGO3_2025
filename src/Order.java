class Order {
    private int id;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private String orderDate;
    private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public void setQuantities(int[] quantities) {
        this.quantities = quantities;
    }


    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public double calculateTotalValue() {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice() * quantities[i];
        }
        return total;
    }

    public void applyDiscount() {
        if (customer.isLoyalCustomer()) {
            double discount = calculateTotalValue() * 0.1; //applying a discount for loyal customers (10%)
            System.out.println("Discount applied: $" + discount);
        }
    }


    public void displayDetails() {
        System.out.println("Order ID: " + id + ", Customer: " + customer.getFirstName() + " " + customer.getLastName() +
                ", Order Date: " + orderDate + ", Status: " + status);
        System.out.println("Ordered Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + " x" + quantities[i] + " - $" + products[i].getPrice());
        }
        System.out.println("Total Value: $" + calculateTotalValue());
    }
}