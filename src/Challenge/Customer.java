package Challenge;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName) {
        this.customerName = customerName;
        ArrayList<Double> transactions = new ArrayList<>();
        transactions.add(5.5); // the same as add(5.5);
        this.transactions = transactions;
    }

    public static Customer createCustomer(String customerName) {
        return new Customer(customerName);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}
