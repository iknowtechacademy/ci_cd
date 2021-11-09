package com.iknow.tdd.katacalculadora;

public class Calculadora {
    
    public String suma(String parametros){
        
        if(parametros.equals("")){
            return "0";
        }
        
        int total = 0;
        
        String[] sumandos=parametros.split(",");
        
        if(sumandos.length > 3){
            throw new RuntimeException("Se ingresaron mas de 3 numeros");
        }
        
        for(int i=0;i < sumandos.length ;i++){
            Integer numero = new Integer(sumandos[i]);
            
            
            if(numero > 1000){
                //continue;
            }
            
            if(numero < 0){
                throw new RuntimeException("Se introdujo un numero negativo");
            }
            
            total = total + numero;
            
        }
        
        return new Integer(total).toString();
        
    }
    
}
