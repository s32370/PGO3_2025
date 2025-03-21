public class Main {
    public static void main(String[] args) {

        ComputerStore store = new ComputerStore();


        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop 1");
        product1.setCategory("Laptop");
        product1.setPrice(4999.99);
        product1.setStockQuantity(10);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Mouse 1");
        product2.setCategory("Mouse");
        product2.setPrice(349.99);
        product2.setStockQuantity(30);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Monitor 1");
        product3.setCategory("Monitor");
        product3.setPrice(1299.99);
        product3.setStockQuantity(15);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
//        store.addProduct(product4);

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("John");
        customer1.setLastName("Smith");
        customer1.setEmail("john.smith@example.com");
        customer1.setIsLoyalCustomer(true);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Anna");
        customer2.setLastName("Brown");
        customer2.setEmail("anna.brown@example.com");
        customer2.setIsLoyalCustomer(false);

        store.addCustomer(customer1);
        store.addCustomer(customer2);
      //  store.addCustomer(customer3);

        Product[] orderProducts1 = {product1, product2};
        int[] orderQuantities1 = {1, 1};
        Order order1 = store.createOrder(customer1, orderProducts1, orderQuantities1);
        order1.applyDiscount();
        store.updateStockAfterOrder(order1);


        System.out.println("Order details:");
        order1.displayDetails();
        System.out.println("\nStock levels after the order:");
        store.displayProductsInCategory("Laptop");
        store.displayProductsInCategory("Mouse");


        store.changeOrderStatus(order1.getId(), "Completed");
        System.out.println("\nOrder status after update:");
        order1.displayDetails();


        Product[] orderProducts2 = {product3, product2};
        int[] orderQuantities2 = {2, 1};
        Order order2 = store.createOrder(customer2, orderProducts2, orderQuantities2);
        store.updateStockAfterOrder(order2);


        System.out.println("\nOrders of John Smith:");
        store.displayCustomerOrders(1);
    }
}
