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
        ticTacToe.jugar(5, 2);
    }

    @Test
    public void cuandoPosicionOcupadaEntoncesRuntimeException() {
        ticTacToe.jugar(2, 1);
        exception.expect(RuntimeException.class);
        ticTacToe.jugar(2, 1);
    }
    
    
    
}
