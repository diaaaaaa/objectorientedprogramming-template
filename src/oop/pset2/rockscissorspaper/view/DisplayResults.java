package oop.pset2.rockscissorspaper.view;


import oop.pset2.rockscissorspaper.model.Movement;

public class DisplayResults {
    public void sayResult(Movement move1, Movement move2) {
        System.out.println("The Player 1 chose: " + move1.getName());
        System.out.println("The Player 2 chose: " + move2.getName());

        if (move1.getName().equalsIgnoreCase(move2.getName())) {
            System.out.println("nobody won !!");
        } else if (move1.getName().equalsIgnoreCase("Scissors") && move2.getName().equalsIgnoreCase("Paper")) {
            System.out.println("The Player 1 won !!");
        } else if (move1.getName().equalsIgnoreCase("Rock") && move2.getName().equalsIgnoreCase("Scissors")) {
            System.out.println("The Player 1 won !!");
        } else if (move1.getName().equalsIgnoreCase("Paper") && move2.getName().equalsIgnoreCase("Rock")) {
            System.out.println("The Player 1 won !!");
        } else
            System.out.println("The Player 2 (you) won !!");

    }
}
