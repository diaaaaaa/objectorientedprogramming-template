package oop.pset2.burgerhouse.model;

public class Waiter {
    public void askForCustomerNumber() {
        System.out.println("How many people would like to eat here?");
    }
    public void givePlaceForEating(Integer numberOfCustomer){
        System.out.println("Here please take your place for "+ numberOfCustomer +" persons");
    }
    public void askForOrder(Menu menu){
        System.out.println("What would you like to eat today? ");

    }

}
