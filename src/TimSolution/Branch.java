package TimSolution;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) != null) {
            this.customers.add(new Customer(customerName, initialAmount)); // add to the list a new customer with gvien name and initial amount, i.e. create customer on the fly
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (findCustomer(customerName) != null) {
        }
    }
}
