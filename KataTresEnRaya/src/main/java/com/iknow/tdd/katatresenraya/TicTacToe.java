package com.iknow.tdd.katatresenraya;

public class TicTacToe {
    
    private char ultimoJugador = '+';

    private Character[][] board = {{'0', '0', '0'}, {'0', '0', '0'}, {'0', '0', '0'}};

    public void jugar(int x, int y) {
       
        verificarCoordenada(x);
        verificarCoordenada(y);
        asignarPosicion(x,y);
        
        ultimoJugador = siguienteJugador();
        
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
            return '+';
        }
        return 'X';
    }            

}
