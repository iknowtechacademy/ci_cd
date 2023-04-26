package com.iknow.tdd.katatresenraya;

public class TicTacToe {
    
    private char ultimoJugador = '+';

    private Character[][] board = {{'0', '0', '0'}, {'0', '0', '0'}, {'0', '0', '0'}};

    public String jugar(int x, int y) {
       
        verificarCoordenada(x);
        verificarCoordenada(y);
        
        ultimoJugador = siguienteJugador();
        asignarPosicion(x,y);
        
        if (esGanador()) {
            return ultimoJugador + " es el ganador";
        }
        return "No ganador";
        
    }
    
    private static final int SIZE = 3;
     private boolean esGanador() {
        int total = ultimoJugador * 3;
        for (int i = 0; i < SIZE; i++) {
            
            if (board[0][i] + board[1][i] + board[2][i] == total) {
                return true;
            } else if (board[i][0] + board[i][1] + board[i][2] == total) {
                return true;
            }

        }
        return false;

    }
    
    public void verificarCoordenada(int coordenada){
        if (coordenada < 1 || coordenada > 3) {
            throw new RuntimeException("La coordenada esta fuera del tablero");
        }
    }
    
    public void asignarPosicion(int x, int y){
        
        if (board[x - 1][y - 1] != '0') {
            throw new RuntimeException("Casilla Ocupada");
        } else {
            board[x - 1][y - 1] = 'X';
            System.out.println("Asignando Casilla");
        }
        
    }
    
    public char siguienteJugador(){
        
        if(ultimoJugador == 'X'){
            return '*';
        }
        return 'X';
    }            

}
