package oop.pset4.pset33.controller;

public class Players {

    public Player getOnePlayer(Integer choiceNumber) {
        if (choiceNumber == 1){
            return new ComputerPlayer();
        }
        return new HumanPlayer();
    }
    public Player getOnePlayer() {return new HumanPlayer(); }


}
