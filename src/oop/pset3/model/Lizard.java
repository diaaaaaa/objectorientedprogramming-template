package oop.pset3.model;

import oop.pset3.model.Movement;

public class Lizard implements oop.pset3.model.Movement {

        @Override
        public String getName() {
            return "Lizard";
        }
    @Override
    public boolean wins(Movement move) {
        if (move.getName().equalsIgnoreCase("Spock") || move.getName().equalsIgnoreCase("Paper"))
        return true;
        return false;
    }


}
