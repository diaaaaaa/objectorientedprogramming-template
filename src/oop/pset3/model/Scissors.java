package oop.pset4.pset33.model;

public class Scissors implements Movement {
    @Override
    public String getName() {
        return "Scissors";
    }
    @Override
    public boolean wins(Movement move) {
        if (move.getName().equalsIgnoreCase("Paper") || move.getName().equalsIgnoreCase("Lizard"))
            return true;
        return false;
    }
}
