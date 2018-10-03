package Challenge;

import java.util.ArrayList;

public class Branch {
    private String location;
    private ArrayList<Customer> customer;

    public Branch(String location, ArrayList<Customer> customer) {
        this.location = location;
        this.customer = customer;
    }

//    public void addInitialTransactionAmount(double initialAmount, String customerName) {
//        this.customer.get(customer.indexOf(customerName)).setTransactions(Double.valueOf(initialAmount));
//    }

    public void addToCustomerList(Customer newCustomer) {
        customer.add(newCustomer);
    }
}