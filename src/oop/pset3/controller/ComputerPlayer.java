package oop.pset4.pset33.controller;



import oop.pset4.pset33.model.Movement;

import java.util.Collections;
import java.util.List;

public class ComputerPlayer implements Player {
    @Override
    public Movement showMove(DeckMoves deckMoves) {
        return randomMove(deckMoves);
    }

    private Movement randomMove(DeckMoves deckMoves) {
        List<Movement> moves = deckMoves.getMoves();
        Collections.shuffle(moves);
        return moves.get(0);
    }
}
