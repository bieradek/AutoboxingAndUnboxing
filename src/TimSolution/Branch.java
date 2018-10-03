package TimSolution;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) { // in other words, if there is no duplicate of customer name
            this.customers.add(new Customer(customerName, initialAmount)); // add to the list a new customer with gvien name and initial amount, i.e. create customer on the fly
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName); // in other words existingCustomer is a boolean in a sense: doesCustomerExist
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i <= this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer; // < -- this.customers.get(i)
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
