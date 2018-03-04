package oop.pset2.burgerhouse.model;

public class Customer {
    private Integer numberOfCustomers;

    public void askForMenu(){
        System.out.println("could you please bring the Menu ?");
    }

    public Integer getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(Integer numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }
}
