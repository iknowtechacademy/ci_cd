package com.iknow.tdd.katatresenraya;

public class TicTacToe {

    private Character[][] board = {{'0', '0', '0'}, {'0', '0', '0'}, {'0', '0', '0'}};

    public void jugar(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("X esta fuera del tablero");
        } else if (y < 1 || y > 3) {
            throw new RuntimeException("Y esta fuera del tablero");
        }
        if (board[x - 1][y - 1] != '0') {
            throw new RuntimeException("Casilla Ocupada");
        } else {
            board[x - 1][y - 1] = 'X';
            System.out.println("Asignando Casilla");
        }
    }

}
