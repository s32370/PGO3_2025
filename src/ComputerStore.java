class ComputerStore {
    private Product[] products;
    private Customer[] customers;
    private Order[] orders;
    private int productCount, customerCount, orderCount;

    public ComputerStore() {
        products = new Product[10];
        customers = new Customer[10];
        orders = new Order[10];
        productCount = 0;
        customerCount = 0;
        orderCount = 0;
    }


    public void addProduct(Product product) {
        products[productCount++] = product;
    }


    public void addCustomer(Customer customer) {
        customers[customerCount++] = customer;
    }


    public Order createOrder(Customer customer, Product[] products, int[] quantities) {
        Order order = new Order();
        order.setId(orderCount + 1);
        order.setCustomer(customer);
        order.setProducts(products);
        order.setQuantities(quantities);
        order.setOrderDate("2025-03-21");
        order.setStatus("New");
        orders[orderCount++] = order;
        return order;
    }

       public void updateStockAfterOrder(Order order) {
        for (int i = 0; i < order.getProducts().length; i++) {
            Product product = order.getProducts()[i];
            product.setStockQuantity(product.getStockQuantity() - order.getQuantities()[i]);
        }
    }

    public void changeOrderStatus(int orderId, String newStatus) {
        for (int i = 0; i < orderCount; i++) {
            if (orders[i].getId() == orderId) {
                orders[i].setStatus(newStatus);
                return;
            }
        }
    }

    public void displayProductsInCategory(String category) {
        System.out.println("Products in " + category + " category:");
        for (int i = 0; i < productCount; i++) {
            if (products[i].getCategory().equalsIgnoreCase(category)) {
                products[i].displayInfo();
            }
        }
    }


    public void displayCustomerOrders(int customerId) {
        System.out.println("Orders for Customer ID: " + customerId);
        for (int i = 0; i < orderCount; i++) {
            if (orders[i].getCustomer().getId() == customerId) {
                orders[i].displayDetails();
            }
        }
    }
}
