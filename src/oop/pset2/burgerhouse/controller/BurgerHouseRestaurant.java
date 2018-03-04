package oop.pset2.burgerhouse.controller;

import oop.pset2.burgerhouse.model.Menu;
import oop.pset2.burgerhouse.view.ShowMenu;

public class BurgerHouseRestaurant {

    public void visit() {
        Menu menu = new Menu();
        ShowMenu showMenu = new ShowMenu();
        showMenu.showMenu();



    }
}
