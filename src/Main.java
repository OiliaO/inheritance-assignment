import payment.*;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = {
                new RegularCustomer("mehrdad"),
                new PremiumCustomer("arman"),
                new PremiumCustomer("mobin")
        };

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "Mehrdad Hasannejad");
        PaymentStrategy payPalPayment = new PayPalPayment("salam@paypal.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("aqwsed");

        customers[0].makePayment(creditCardPayment, 100.0);
        customers[0].makePayment(payPalPayment, 200.0);

        customers[1].makePayment(creditCardPayment, 300.0);
        customers[1].makePayment(bitcoinPayment, 400.0);

        customers[2].makePayment(payPalPayment, 500.0);
        customers[2].makePayment(bitcoinPayment, 600.0);

        for (Customer customer : customers) {
            customer.displayCustomerInfo();
            customer.showPaymentHistory();
            System.out.println();
        }
    }
}