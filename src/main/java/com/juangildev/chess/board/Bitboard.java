package com.juangildev.chess.board;

public class Bitboard {
    private Bitboard(){}

    public static long setBit (long bitboard, int square) {
        return bitboard | (1L << square);
    }

    public static long clearBit (long bitboard, int square) {
        return bitboard & (~(1L << square));
    }

    public static boolean isSet (long bitboard, int square) {
        return (bitboard & (1L << square)) !=0L;

    }

    public static int popCount (long bitboard) {
        return Long.bitCount(bitboard);

    }

    //Un bucle para las filas y dentro otro para las columnas, y utilizamos la funcion isSet de los bitboard y la funcion of de square

    public static void print (long bitboard) {
        for (int i = 7; i >=0 ; i--) {
            for (int j = 0; j <=7 ; j++) {
                if (Bitboard.isSet(bitboard, (Square.of(j, i)))) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }

            }
            System.out.println();
        }


    }
}
