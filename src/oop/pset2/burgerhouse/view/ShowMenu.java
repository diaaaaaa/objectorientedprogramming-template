package oop.pset2.burgerhouse.view;

import oop.pset2.burgerhouse.controller.BurgerHouseRestaurant;

public class ShowMenu {

    public void showMenu(){
        System.out.println("===================* Restaurant *====================");
        greeting();

        sayGoodbye();
        System.out.println("===================* Restaurant *====================");



    }

    private void sayGoodbye() {
        System.out.println(" Goodbye ");

    }

    private void greeting() {
        System.out.println("Welcome to our Restaurant");
    }
}
