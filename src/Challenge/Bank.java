package Challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }


    public void addBranch(Branch newBranch) {
        branches.add(newBranch);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
