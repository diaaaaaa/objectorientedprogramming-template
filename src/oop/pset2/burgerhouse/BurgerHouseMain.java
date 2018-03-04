package oop.pset2.burgerhouse;

import oop.pset2.burgerhouse.controller.BurgerHouseRestaurant;
import oop.pset2.burgerhouse.parser.MenuParser;

public class BurgerHouseMain {

    public static void main(String[] args) {
        //new BurgerHouseRestaurant().visit();
        MenuParser menuParser = new MenuParser();
        menuParser.getMenus().forEach(e-> System.out.println(e));

    }
}