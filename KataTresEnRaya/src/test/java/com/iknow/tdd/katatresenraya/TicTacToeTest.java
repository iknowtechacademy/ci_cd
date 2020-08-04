package com.iknow.tdd.katatresenraya;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TicTacToeTest {
    
    @Rule
    public ExpectedException exception
            = ExpectedException.none();
    
    private TicTacToe ticTacToe;

    @Before
    public final void before() {
        ticTacToe = new TicTacToe();
    }
    
    //Primer requerimiento
    @Test
    public void xEstaFueraDelTableroEntoncesRuntimeException() {
        exception.expect(RuntimeException.class);
        ticTacToe.jugar(5, 2);
    }
    
    @Test
    public void yEstaFueraDelTableroEntoncesRuntimeException() {
        exception.expect(RuntimeException.class);
        ticTacToe.jugar(2, 5);
    }

    @Test
    public void cuandoPosicionOcupadaEntoncesRuntimeException() {
        ticTacToe.jugar(2, 1);
        exception.expect(RuntimeException.class);
        ticTacToe.jugar(2, 1);
    }
    
    @Test
    public void verificarPrimerTurnoSeaX(){
        assertEquals('X',ticTacToe.siguienteJugador());
    }
    
    @Test
    public void siJuegaXleTocaCruz(){
        ticTacToe.jugar(1, 1);//X
        assertEquals('+', ticTacToe.siguienteJugador());
        
        ticTacToe.jugar(2, 1);//+
        assertEquals('X', ticTacToe.siguienteJugador());
    }
    
    //3er Req
    
    @Test
    public void cuandoNoHayGanador() {
        String actual = ticTacToe.jugar(1, 1);
        assertEquals("No ganador", actual);
    }

    @Test
    public void cuandoGanaLineasHorizontales() {
        ticTacToe.jugar(1, 1); // X
        ticTacToe.jugar(1, 2); // +
        ticTacToe.jugar(2, 1); // X
        ticTacToe.jugar(2, 2); // +
        String actual = ticTacToe.jugar(3, 1); // X
        assertEquals("X es el ganador", actual);
    }

    
    @Test
    public void cuandoGanaLineasVerticales() {
        ticTacToe.jugar(2, 1); // X
        ticTacToe.jugar(1, 1); // +
        ticTacToe.jugar(3, 1); // X
        ticTacToe.jugar(1, 2); // +
        ticTacToe.jugar(2, 2); // X
        String actual = ticTacToe.jugar(1, 3); // +
        assertEquals("+ es el ganador", actual);
    }
    
    
    
}
