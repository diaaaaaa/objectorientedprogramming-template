package oop.pset2.rockscissorspaper.controller;

public class Players {

    public Player getOnePlayer(Integer choiceNumber) {
        if (choiceNumber == 1){
            return new ComputerPlayer();
        }
        return new HumanPlayer();
    }
    public Player getOnePlayer() {return new HumanPlayer(); }


}
