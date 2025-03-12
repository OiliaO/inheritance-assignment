package payment;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Premium Customer: " + name);
    }
}