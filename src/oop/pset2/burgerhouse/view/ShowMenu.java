package oop.pset2.burgerhouse.view;

import oop.pset2.burgerhouse.controller.BurgerHouseRestaurant;
import oop.pset2.burgerhouse.model.Customer;
import oop.pset2.burgerhouse.model.Menu;
import oop.pset2.burgerhouse.model.Waiter;
import oop.pset2.burgerhouse.parser.MenuParser;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShowMenu {

    Waiter waiter = new Waiter();
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Customer customer = new Customer();
    MenuParser menuParser = new MenuParser();
    String order = "";
    String orderName ;
    Boolean finishOrder = false;
    String yesNo ="";
    public void showMenu(Menu menu){
        System.out.println("===================* Burger House Restaurant *====================");
        greeting();
        waiter.askForCustomerNumber();
        customer.setNumberOfCustomers(scanner.nextInt());
        waiter.givePlaceForEating(customer.getNumberOfCustomers());
        customer.askForMenu();
        menuParser.getMenus().stream().map(e-> "Dish: "+ e.getDish() + ", Type: "+e.getType()+", Price: "+e.getPrice()+" Euro.\n").forEach(e-> System.out.println(e));
        do {
            waiter.askForOrder(menu);
            orderName = scanner1.nextLine();
            order += orderName;
            System.out.println("Do you want something else (Yes/No)");
            yesNo = scanner1.nextLine();
            if(yesNo.equalsIgnoreCase("yes")) {
                finishOrder = true;
            }
            else {
                System.out.println("Ok your order will be ready in minutes welcome again ...");
                finishOrder = false;
            }
        }while(finishOrder );
        System.out.println(order);

        sayGoodbye();
        System.out.println("===================* Burger House Restaurant *====================");



    }

    private void greeting() {
        System.out.println("Welcome to our Restaurant");
    }

    private void sayGoodbye() {
        System.out.println(" Goodbye ");

    }


}
