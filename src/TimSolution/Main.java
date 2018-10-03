package TimSolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and
        // a list of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Bank");
        bank.addBranch("Some");
        bank.addCustomer("Some", "Tim", 50.50);
        bank.addCustomer("Some", "Mike", 175.34);
        bank.addCustomer("Some", "Percy", 220.12);
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.53);
        bank.addCustomerTransaction("Some", "Tim", 44.22);
        bank.addCustomerTransaction("Some", "Mike", 12.22);
        bank.addCustomerTransaction("Some", "Tim", 1.22);
        bank.listCustomers("Some", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.33)) {
            System.out.println("Error: Melbourne is not pinned to our Bank");
        }

        if (!bank.addBranch("Some")) {
            System.out.println("Some branch already exists");
        }
    }
}
