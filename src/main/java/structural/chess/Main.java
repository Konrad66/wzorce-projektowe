package structural.chess;

import java.util.List;
import chess.mod.Peasant;

public class Main {
    public static void main(String[] args) {
        Pawn pawn = new Pawn();
        Queen queen = new Queen();
        Peasant peasant = new Peasant();
        FigureAdapter figureAdapter = new FigureAdapter(peasant);
        chessApp(List.of(pawn, queen, figureAdapter));
    }

    public static void chessApp(List<Figure> figures ){
        System.out.println("Testuję ruchy figur");
        for(Figure figure : figures){
            figure.move();
        }
    }
}