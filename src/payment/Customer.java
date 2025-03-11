package payment;
import java.util.*;

public abstract class Customer {
    protected String name;
    private ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String paymentDetails = "Amount: " + amount + ", " + paymentStrategy.getPaymentDetails();
        paymentHistory.add(paymentDetails);
    }

    public void showPaymentHistory() {
        for (String payment : paymentHistory) {
            System.out.println(payment);
        }
    }
}