package oop.pset2.rockscissorspaper.controller;



import oop.pset2.rockscissorspaper.model.Movement;
import oop.pset2.rockscissorspaper.model.Paper;
import oop.pset2.rockscissorspaper.model.Rock;
import oop.pset2.rockscissorspaper.model.Scissors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeckMoves {
    private List<Movement> movements;

    public DeckMoves() {
        movements = Stream.of(
                new Paper(),
                new Rock(),
                new Scissors()
        ).collect(Collectors.toList());
    }

    public List<Movement> getMoves() {
        return new ArrayList<>(movements);
    }
}
