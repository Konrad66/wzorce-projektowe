package structural.chess;

import chess.mod.Peasant;

public class FigureAdapter implements Figure {

    private Peasant peasant;

    public FigureAdapter(Peasant peasant) {
        this.peasant = peasant;
    }

    @Override
    public void move() {
        peasant.changePosition();
    }
}
