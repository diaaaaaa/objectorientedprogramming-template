package oop.pset2.rockscissorspaper.controller;




import oop.pset2.rockscissorspaper.model.Movement;
import oop.pset2.rockscissorspaper.view.DisplayResults;

import java.util.Scanner;

public class RockPaperScissors {

    private Players players = new Players();

    public void play() {
        DeckMoves deckMoves = new DeckMoves();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the player 1 if you want the computer press 1 or with your friend press 0 ");
        Integer choiceNumber = scanner.nextInt();
        Player player1 = players.getOnePlayer(choiceNumber);
        Player player2 = players.getOnePlayer();
        Movement move1 = player1.showMove(deckMoves);
        Movement move2 = player2.showMove(deckMoves);
        DisplayResults jury = new DisplayResults();
        jury.sayResult(move1, move2);
    }

}
