package com.juangildev.chess.board;

//Un enum puede tener directamente funciones (en este caso getters) y atributos (en este caso value y symbol)
public enum Piece {
        PAWN(100, 'P'),
        KNIGHT(300, 'N'),
        BISHOP(300, 'B'),
        ROOK(500, 'R'),
        QUEEN(1000, 'Q'),
        KING(0, 'K');

        private final int value;
        private final char symbol;

        Piece(int value, char symbol) {
            this.value = value;
            this.symbol = symbol;
        }

        public int getValue() {
            return value;
        }

        public char getSymbol() {
            return symbol;
        }
    }



