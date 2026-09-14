package com.juangildev.chess.board;

public class Color {

    public enum PieceColor {
        WHITE,
        BLACK;

        public PieceColor opposite() {
            if (this == WHITE) {
                return BLACK;
            } else {
                return WHITE;
            }
        }
    }
}
