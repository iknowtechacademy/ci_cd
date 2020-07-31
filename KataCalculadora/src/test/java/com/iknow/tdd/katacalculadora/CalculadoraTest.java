package com.iknow.tdd.katacalculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
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
       assertEquals("-10", calc.suma("-20,10"));
       
   }
   
    
}
