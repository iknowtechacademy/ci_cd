package com.iknow.tdd.katacalculadora;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class CalculadoraTest {
    
   @Rule
    public ExpectedException exception = ExpectedException.none();
    
   @Test 
   public void siCadenaVaciaRetorneCero(){
       //Preparacion
       Calculadora calc = new Calculadora();
       
       //Logica de la Prueba
       
       //Verificacion o Asercion
       assertEquals("0", calc.suma(""));
   }
   
   //GWT: Given When Then
   
   @Test
   public void cuando2numerosRetorneSuma(){
       //Preparacion
       Calculadora calc = new Calculadora();
       
       //Logica de la Prueba
       
       //Verificacion o Asercion
       assertEquals("5", calc.suma("2,3"));
       assertEquals("1", calc.suma("1,0"));
       assertEquals("100", calc.suma("50,50"));
       assertEquals("30", calc.suma("20,10"));
       
   }
   
    @Test
    public void cuando3numerosRetorneSuma(){
        Calculadora calc = new Calculadora();
        
        assertEquals("10",calc.suma("2,3,5"));
        assertEquals("31",calc.suma("20,3,8"));
    }
    
    @Test
    public void numerosMayores100SonIgnorados(){
        Calculadora calc = new Calculadora();
                
        assertEquals("50",calc.suma("1500,50"));
        assertEquals("35",calc.suma("35,5000"));
        assertEquals("45",calc.suma("10,1001,35"));
    }
    
    @Test
    public void numerosNegativoLanzaException(){
        
        Calculadora calc = new Calculadora();
        exception.expect(RuntimeException.class);
        assertEquals("50",calc.suma("1500,-50"));
    }
   
   
    
}
