package com.juangildev.chess.board;

public class Square {

    //Se usara LERF, por lo que la formula para obtener una casilla concreta es fila(row) * 8 + columna(column)
    public static int of (int column, int row) {
        return row*8+column;
    }

    public static int columnOf (int square) {
        return square%8;
    }

    public static int rowOf (int square) {
        return square/8;
    }

    //Al restar un char a otro, devuelve la diferencia entre ellos no el unicode
    //Teniendo esto en cuenta, aplicamos la misma formula row*8+column

    public static int fromAlgebraic (String algebraic) {
        return (algebraic.charAt(1) - '1') * 8 + (algebraic.charAt(0) - 'a');
    }

    public static String toAlgebraic (int square) {
        return "" + (char) ('a' + columnOf(square)) + (1+ rowOf(square));

    }


}
